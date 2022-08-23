package ObververPattern;

public abstract class Observer {

	private String name;

	public Observer() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void update();

}
