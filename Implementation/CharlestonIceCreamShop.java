
public class CharlestonIceCreamShop extends IceCreamShop {
	
	public CharlestonIceCreamShop(){
		location = "Charleston";
	}
	
	/* This is the factory method - it returns the ice cream product that corresponds 
	 * with the Charleston ice cream shop's menu. Any changes to Charleston's menu can
	 * be done here without affecting other shops.
	 * @see IceCreamShop#createIceCream(java.lang.String)
	 */
	public IceCream createIceCream(String flavor) {
		IceCream icecream = null;
		switch (flavor)
		{
			case ("vanilla"):
				icecream = new CharlestonVanilla();
				break;
			case ("chocolate"):
				icecream = new CharlestonChocolate();
				break;
			case ("strawberry"):
				icecream = new CharlestonStrawberry();
				break;
		}
		return icecream;
	}
}
