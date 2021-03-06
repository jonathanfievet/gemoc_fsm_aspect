package org.semantics.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import gemoc.FSM;
import gemoc.Transition;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.semantics.k3project.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
    final org.semantics.k3project.TransitionAspectTransitionAspectProperties _self_ = org.semantics.k3project.TransitionAspectTransitionAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_fire(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Transition","fire");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Fire " + _name);
    String _plus_1 = (_plus + " and entering in ");
    String _name_1 = _self.getState().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    final FSM fsm = _self.getSrc().getFSM();
    fsm.setCurrentState(_self.getState());
    return;
  }
}
