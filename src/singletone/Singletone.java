package singletone;
// il y a une faille ->   en sérialisant la  classe on peut obtenir une 2eme instance
public class Singletone {
private static Singletone INSTANCE= new Singletone();
private Singletone() {}
public static Singletone getInstance() {
return INSTANCE;	
}
}
