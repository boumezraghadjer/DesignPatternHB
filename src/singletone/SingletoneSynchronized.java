package singletone;
// cette impl�mentation est lente 
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
