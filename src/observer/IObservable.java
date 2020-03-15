package observer;

public interface IObservable {
public void addObserver(Observer obs);
public void removeObserver(Observer obs);
public void notifyObserver(Observer obs);


}
