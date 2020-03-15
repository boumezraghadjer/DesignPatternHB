package singletone;

import java.io.Serializable;

public enum SingletoneEnum{
INSTANCE;
	 int value;
	    public int getValue() {
	        return value;
	    }
	    public void setValue(int value) {
	        this.value = value;
	    }
}
