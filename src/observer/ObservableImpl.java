package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObservable{
private List<Observer> observers=new ArrayList<Observer>();
	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
		
	}
	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObserver(Observer obs) {
		observers.forEach(observer->observer.update());
		
	}

}
