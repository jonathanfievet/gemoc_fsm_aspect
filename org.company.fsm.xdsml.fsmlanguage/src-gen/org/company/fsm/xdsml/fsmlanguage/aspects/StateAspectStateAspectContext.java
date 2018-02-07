package org.company.fsm.xdsml.fsmlanguage.aspects;

import org.company.fsm.xdsml.fsmlanguage.gemoc.State;
import java.util.Map;
import org.company.fsm.xdsml.fsmlanguage.aspects.StateAspectStateAspectProperties;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.company.fsm.xdsml.fsmlanguage.aspects.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<org.company.fsm.xdsml.fsmlanguage.gemoc.State, org.company.fsm.xdsml.fsmlanguage.aspects.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
