package org.semantics.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import gemoc.FSM;
import gemoc.State;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.semantics.k3project.StateAspectStateAspectProperties;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_step(_self_, _self,inputString);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"State","step");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean isValidTrigger(final State _self, final String trigger) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isValidTrigger(_self_, _self,trigger);;
    return (boolean)result;
  }
  
  public static FSM getFSM(final State _self) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getFSM(_self_, _self);;
    return (gemoc.FSM)result;
  }
  
  public static void setFSM(final State _self, final FSM fsm) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    _privk3_setFSM(_self_, _self,fsm);;
  }
  
  private static FSM fsm(final State _self) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_fsm(_self_, _self);;
    return (gemoc.FSM)result;
  }
  
  private static void fsm(final State _self, final FSM fsm) {
    final org.semantics.k3project.StateAspectStateAspectProperties _self_ = org.semantics.k3project.StateAspectStateAspectContext.getSelf(_self);
    _privk3_fsm(_self_, _self,fsm);;
  }
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString) {
    boolean _isValidTrigger = StateAspect.isValidTrigger(_self, inputString);
    if (_isValidTrigger) {
      InputOutput.<String>println((("Trigger " + inputString) + " is valid !"));
      _self.getOutcoming().fire();
    }
    return;
  }
  
  protected static boolean _privk3_isValidTrigger(final StateAspectStateAspectProperties _self_, final State _self, final String trigger) {
    int _compareTo = _self.getOutcoming().getTrigger().compareTo(trigger);
    return (_compareTo == 0);
  }
  
  protected static FSM _privk3_getFSM(final StateAspectStateAspectProperties _self_, final State _self) {
    return StateAspect.fsm(_self);
  }
  
  protected static void _privk3_setFSM(final StateAspectStateAspectProperties _self_, final State _self, final FSM fsm) {
    StateAspect.fsm(_self, fsm);
  }
  
  protected static FSM _privk3_fsm(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFsm") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (gemoc.FSM) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.fsm;
  }
  
  protected static void _privk3_fsm(final StateAspectStateAspectProperties _self_, final State _self, final FSM fsm) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFsm")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, fsm);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.fsm = fsm;
    }
  }
}
