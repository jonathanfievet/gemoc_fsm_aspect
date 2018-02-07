package org.company.fsm.xdsml.fsmlanguage.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.company.fsm.xdsml.fsmlanguage.gemoc.FSM;
import org.company.fsm.xdsml.fsmlanguage.gemoc.State;
import org.company.fsm.xdsml.fsmlanguage.gemoc.Transition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  @Step
  @InitializeModel
  public static void initialize(final FSM _self) {
	final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initialize(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FSM", "initialize");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Main
  public static void main(final FSM _self) {
	final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  private static boolean isCurrentStateTheLast(final FSM _self) {
    final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isCurrentStateTheLast(_self_, _self);;
    return (boolean)result;
  }
  
  public static void setCurrentState(final FSM _self, final State state) {
	final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_setCurrentState(_self_, _self, state);
	;
}
  
  private static State currentState(final FSM _self) {
    final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentState(_self_, _self);;
    return (org.company.fsm.xdsml.fsmlanguage.gemoc.State)result;
  }
  
  private static void currentState(final FSM _self, final State currentState) {
    final org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties _self_ = org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    _privk3_currentState(_self_, _self,currentState);;
  }
  
  protected static void _privk3_initialize(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    InputOutput.<String>println("init");
    EList<State> _state = _self.getState();
    for (final State state : _state) {
      state.setFSM(_self);
    }
    _self.setCurrentState(_self.getState().get(0));
    InputOutput.<String>println("finish init");
  }
  
  protected static void _privk3_main(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    while ((!FSMAspect.isCurrentStateTheLast(_self))) {
      {
        String _name = FSMAspect.currentState(_self).getName();
        String _plus = ("State " + _name);
        String _plus_1 = (_plus + " | Entrer le trigger : ");
        InputOutput.<String>println(_plus_1);
        final String trigger = System.console().readLine();
        FSMAspect.currentState(_self).step(trigger);
      }
    }
  }
  
  protected static boolean _privk3_isCurrentStateTheLast(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    Transition _outcoming = FSMAspect.currentState(_self).getOutcoming();
    return (_outcoming == null);
  }
  
  protected static void _privk3_setCurrentState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State state) {
    _self.setCurrentState(state);
  }
  
  protected static State _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.company.fsm.xdsml.fsmlanguage.gemoc.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
}
