package BrigePattern;

public class Circle extends Shape {

	private int x, y, r;

	public void Cicle(int x, int y, int r,DrawingApi drawingApi) {
		this.x = x;
		this.y = y;
		this.r = r;
		super.api = drawingApi;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
