package ObververPattern;

import java.util.List;

public class Members implements Subject {

	private List<Observer> observers;

	public Members() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);

	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);

	}

	@Override
	public void notifyObserver(Observer observer) {
		// TODO Auto-generated method stub
		
		observers.forEach(Observer::update);

	}

}
