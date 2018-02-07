package org.company.fsm.xdsml.fsmlanguage.aspects;

import org.company.fsm.xdsml.fsmlanguage.gemoc.Transition;
import java.util.Map;
import org.company.fsm.xdsml.fsmlanguage.aspects.TransitionAspectTransitionAspectProperties;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.company.fsm.xdsml.fsmlanguage.aspects.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<org.company.fsm.xdsml.fsmlanguage.gemoc.Transition, org.company.fsm.xdsml.fsmlanguage.aspects.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
