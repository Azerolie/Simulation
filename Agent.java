import java.util.Random;
import java.awt.Point;

public class Agent {

	private World w;

	private boolean alive = true;

	private String PROIES;
	private int ESPERANCE;
	private int DELAIS;
	private int SATIETE;

	private int estomac;
	private int age = 0;
	
	private Point p = new Point();

	Random rnd = new Random();

	public Agent(final int satiete, final int esperance, final int delais, final String proies, World w) {
		this.setSatiete(satiete);
		this.setEsperance(esperance);
		this.setDelais(delais);
		this.setProies(proies);
		this.setWorld(w);
		this.estomac = satiete;
		this.p.setLocation(rnd.nextInt(w.getWidth()) , rnd.nextInt(w.getHeight()));
	}

	public Agent() {
		this.SATIETE = 10;
		this.ESPERANCE = 25;
		this.DELAIS = 5;
		this.PROIES = "Poisson";
		this.estomac = 10;
		this.p.setLocation(rnd.nextInt(w.getWidth()) , rnd.nextInt(w.getHeight()));
	}

	public void move() {}

	public String toString() {
  		return "Agent : " + this.getClass().getName() + "\n" +
		"Age : " + this.getAge() + "/" + this.ESPERANCE + "\n" +
		"Estomac : " + this.getEstomac() + "/" + this.SATIETE  + "\n" +
		"Position : (" + this.getPoint().toString() + ")";
	}

	public void setWorld(World w) {
		this.w = w;
	}

	public World getWorld(){
		return this.w;
	}

	public Point getPoint() {
		return this.p;
	}

	/*
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	*/

	public final String getProies() {
		return this.PROIES;
	}

	public void setProies(final String p) {
		this.PROIES = p;
	}
	public final int getSatiete() {
		return this.SATIETE;
	}

	public void setSatiete(final int s) {
		this.SATIETE = s;
	}

	public final int getEsperance() {
		return this.ESPERANCE;
	}

	public void setEsperance(final int e) {
		this.ESPERANCE = e;
	}

	public final int getDelais() {
		return this.DELAIS;
	}

	public void setDelais(final int d) {
		this.DELAIS = d;
	}

	public int getEstomac() {
		return this.estomac;
	}

	public void setEstomac(int i) {
		this.estomac += i;
		if (this.estomac <= 0) {this.alive = false;}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int i) {
		this.age += i;
		if (this.age >= this.getEsperance()) {this.alive = false;}
	}

	public boolean isAlive() {
		return this.alive;
	}

}