package singletone;
// cette implémentation est lente 
public class SingletoneSynchronized {
	private static SingletoneSynchronized INSTANCE =null;
private SingletoneSynchronized() {}

public synchronized static SingletoneSynchronized getInstance() {
if(INSTANCE==null)
{
	return new SingletoneSynchronized();
}
return INSTANCE;
}
}
