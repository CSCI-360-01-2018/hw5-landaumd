
public class SavannahIceCreamShop extends IceCreamShop {
	
	public SavannahIceCreamShop(){
		location = "Savannah";
	}
	
	/* This is the factory method - it returns the ice cream product that corresponds with the Savannah 
	 * Ice Cream Shop's menu
	 * @see IceCreamShop#createIceCream(java.lang.String)
	 */
	public IceCream createIceCream(String flavor) {
		IceCream icecream = null;
		switch (flavor)
		{
			case ("vanilla"):
				icecream = new SavannahVanilla();
				break;
			case ("chocolate"):
				icecream = new SavannahChocolate();
				break;
			case ("strawberry"):
				icecream = new SavannahStrawberry();
				break;
		}
		return icecream;
	}
	
	/* The Savannah Ice Cream Shop also wants to give coupons to customers every time they serve 
	 * them ice cream so the serve() method inherited from the IceCreamShop class can be overridden 
	 */
	@Override
	public void serve(IceCream icecream){
		System.out.println("You ordered the: " + icecream.getName());
		System.out.println("Preparing...");
		icecream.scoop();
		icecream.pourSauce();
		icecream.serveToppings();
		System.out.println("** Here in Savannah, we are also giving you a coupon with your order! **");
		System.out.println("Here you go!");
	}
}
