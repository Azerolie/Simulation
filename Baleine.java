import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Baleine extends Agent {

	private static final int SATIETE = 25;
	private static final int ESPERANCE = 55;
	private static final int DELAIS = 10;
	private static final String PROIES = "Meduse";	

	private Baleine soulsister;

	Baleine(World w) {
		super(SATIETE, ESPERANCE, DELAIS, PROIES,w);
	}


	public void setSoulsister(Baleine b) {
		this.soulsister = b;
	}

	public Baleine getSoulsister() {
		return this.soulsister;
	}

	public void move() { // Les baleines bougent la journée
		if (this.getWorld().getCircadian() == 1) { 
			if (this.getSoulsister() == null) {
				System.out.println(this.chooseNextPoint(this.getPoint()));
			}
		}

	}


	public Point chooseNextPoint(Point p) {
		Random rnd = new Random();

		ArrayList<Point> coordinateList = new ArrayList<Point>();
		for (int x = (int)p.getX() -1 ; x <= p.getX() + 1; x++) {
			for (int y = (int)p.getY() -1 ; y <= p.getY() + 1; y++) {
				coordinateList.add(new Point(x,y));
			}
		}
		
		int index = rnd.nextInt(coordinateList.size());
        return coordinateList.get(index);
	}

}