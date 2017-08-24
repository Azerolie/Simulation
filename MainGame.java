

class MainGame {
   public static void main (String[] args){
   	
    	//Agent a = new Agent(10,10,"Poisson");
    	//System.out.print(a.getEstomac() + "\n");
    	//System.out.print(a.mangeQuoi());

   		//Agent a = new Baleine();
   		//System.out.print(a.getEstomac() + "\n");
    	
    	World w = new World(10,10);
    	Simulation s = new Simulation(w);
    	s.run();
    }
}