package BrigePattern;

public abstract class Shape {

	DrawingApi api;

	public void useApi(DrawingApi drawingApi) {
		this.api = drawingApi;
	}

	public abstract void draw();
}
