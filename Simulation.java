public class Simulation {
	
	private Agent a;
	private World w;

	Simulation(World w) {
		this.setAgent(new Baleine(w));
		this.setWorld(w);
	}

	public void run() {
		int t = 0;

		while (a.isAlive()) {

			if (t%10==0) {this.getWorld().setCircadian();}
			this.a.setAge(1);
			this.a.setEstomac(-1);
			this.a.move();
			t += 10;
		}
		System.out.println("L'agent est mort");
		System.out.println(a);
	}

	public void setAgent(final Agent a) {
		this.a = a;
	}

	public void setWorld(World w) {
		this.w = w;
	}

	public World getWorld() {
		return this.w;
	}
}


