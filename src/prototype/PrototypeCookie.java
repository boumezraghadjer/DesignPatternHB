package prototype;

public class PrototypeCookie implements Cloneable{
public PrototypeCookie clone() {
	try {
		PrototypeCookie copy= (PrototypeCookie) super.clone();
		return copy;
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	
	
	
}

}
