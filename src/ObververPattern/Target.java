package ObververPattern;

public class Target extends Observer{
	
	public Target(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + "을 갱신합니다.");
	}
}
