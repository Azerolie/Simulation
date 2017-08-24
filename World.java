public class World {

	private int width;
	private int height;
	private int circadian = 1; //  1 = jour / 0 = nuit

	World(int w, int h) {
		this.setWidth(w);
		this.setHeight(h);
	}

	public int getCircadian(){
		return this.circadian;
	}

	public void setCircadian() {
		this.circadian = (this.circadian == 0) ? 1 : 0 ;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	
}