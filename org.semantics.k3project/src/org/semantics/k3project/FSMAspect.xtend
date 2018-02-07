package org.semantics.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import gemoc.FSM
import gemoc.State
import gemoc.Transition


@Aspect(className=FSM)
class FSMAspect {
	
	private State currentState;
	
	@Step
	@InitializeModel
	def public void initialize(){
		println("init")
		
		//Ajoute la référence FSM au State.
		for(State state: _self.state) 
			state.FSM = _self;
		
		//Définie le premier state.
		_self.currentState = _self.state.get(0);
		
		println("finish init")
	}
	
	@Main
    def public void main() {
		
		//Tant que nous ne sommes pas au dernier State...
		while (!_self.isCurrentStateTheLast()) {
			
			println("State " + _self.currentState.name + " | Entrer le trigger : ")
			val trigger = System.console.readLine()
			_self.currentState.step(trigger)
		}
	}
	
	def private boolean isCurrentStateTheLast() {
		return _self.currentState.outcoming === null;
	}
	
	
	def public void setCurrentState(State state) {
		_self.currentState = state
	}
	
}
@Aspect(className=State)
class StateAspect {
	
	private FSM fsm;
	
	@Step
    def public void step(String inputString) {
    
    	//Si le trigger en entré est le bon trigger pour la transition sortante...
    	if (_self.isValidTrigger(inputString)) {
    		println("Trigger " + inputString + " is valid !")
    		//... on le déclenche.
    		_self.outcoming.fire()
    	}
    	return
	}
	
	def public boolean isValidTrigger(String trigger) {
		return _self.outcoming.trigger.compareTo(trigger) == 0
	}
	
	def public FSM getFSM() {
		return _self.fsm;
	}
	
	def public void setFSM(FSM fsm) {
		_self.fsm = fsm;
	}
}
@Aspect(className=Transition)
class TransitionAspect {
	
	@Step
    def public void fire() {
    	println("Fire " + _self.name + " and entering in " + _self.state.name)
    	val fsm = _self.src.FSM
    	fsm.currentState = _self.state;
    	return
	}
}