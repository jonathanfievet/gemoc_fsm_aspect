package org.company.fsm.xdsml.fsmlanguage.aspects;

import org.company.fsm.xdsml.fsmlanguage.gemoc.FSM;
import java.util.Map;
import org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties;

@SuppressWarnings("all")
public class FSMAspectFSMAspectContext {
  public final static FSMAspectFSMAspectContext INSTANCE = new FSMAspectFSMAspectContext();
  
  public static FSMAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM, FSMAspectFSMAspectProperties> map = new java.util.WeakHashMap<org.company.fsm.xdsml.fsmlanguage.gemoc.FSM, org.company.fsm.xdsml.fsmlanguage.aspects.FSMAspectFSMAspectProperties>();
  
  public Map<FSM, FSMAspectFSMAspectProperties> getMap() {
    return map;
  }
}
