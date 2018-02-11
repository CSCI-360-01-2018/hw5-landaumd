import java.util.ArrayList;

public abstract class IceCream {
	String name;
	String flavor;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void scoop(){
		System.out.println("\tScooping " + flavor + " ice cream into cone...");
	}
	
	public void taste(){
		System.out.println("Tasting " + flavor + " ice cream flavor.");
	}
	
	public String getFlavor(){
		return flavor;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSauce(){
		return sauce;
	}
	
	public void pourSauce(){
		if (!sauce.equals("no")){
			System.out.println("\tPouring " + sauce + " sauce onto ice cream...");
		}
	}
	
	public void addTopping( String topping ){
		toppings.add(topping);
	}
	
	public void serveToppings(){
		System.out.println("\tAdding " + getToppings() + " on top...");
	}
	
	public String getToppings(){
		String toppingString = "";
		for (int i = 0; i < toppings.size(); i++){
			if (i == toppings.size()-1){
				toppingString += toppings.get(i);
			} else {
				toppingString += toppings.get(i) + ", ";
			}
		}
		return toppingString;
	}
	
}
