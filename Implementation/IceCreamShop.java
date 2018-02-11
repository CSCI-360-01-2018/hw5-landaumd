
public abstract class IceCreamShop {
	public String location;
	
	// Factory Method implemented in the IceCreamShop subclasses so that they can each manage their own different flavors
	public abstract IceCream createIceCream( String flavor ); 
	
	// Other methods for IceCreamShop
	public IceCream orderIceCream( String flavor ){
		IceCream icecream;
		icecream = createIceCream(flavor);
		return icecream;
	}
	
	public void serve(IceCream icecream){
		System.out.println("You ordered the: " + icecream.getName());
		System.out.println("Preparing...");
		icecream.scoop();
		icecream.pourSauce();
		icecream.serveToppings();
		System.out.println("Here you go!");
	}
	
	public void cleanShop(){
		System.out.println("Cleaning shop.");
	}
	
	public void openShop(){
		System.out.println("Shop is open.");
	}
	
	public void closeShop(){
		System.out.println("Shop is closed.");
	}
	
	public String getLocation(){
		return location;
	}
}
