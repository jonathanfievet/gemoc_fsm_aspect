package org.semantics.k3project;

import gemoc.FSM;
import java.util.Map;
import org.semantics.k3project.FSMAspectFSMAspectProperties;

@SuppressWarnings("all")
public class FSMAspectFSMAspectContext {
  public final static FSMAspectFSMAspectContext INSTANCE = new FSMAspectFSMAspectContext();
  
  public static FSMAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.semantics.k3project.FSMAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM, FSMAspectFSMAspectProperties> map = new java.util.WeakHashMap<gemoc.FSM, org.semantics.k3project.FSMAspectFSMAspectProperties>();
  
  public Map<FSM, FSMAspectFSMAspectProperties> getMap() {
    return map;
  }
}
