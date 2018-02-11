import java.util.Scanner;

public class IceCreamDriver {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Print welcome message
		System.out.println("-------------------------------------------");
		System.out.println("\t\uD83C\uDF66 Megan's Ice Cream Store \uD83C\uDF66 ");
		System.out.println("-------------------------------------------");	
		
		// Determine user location to instantiate an IceCreamShop for that location
		System.out.println("\nWhich location are you visiting?\n\t- Charleston\n\t- Savannah");
		IceCreamShop shop = null;

		if (input.hasNextLine()){
			String location = input.nextLine();
			if (location.equalsIgnoreCase("Charleston")){
				shop = new CharlestonIceCreamShop();
			} else if (location.equalsIgnoreCase("Savannah")){
				shop = new SavannahIceCreamShop();
			} else {
				System.out.println("Invalid location.");
			}
		}
		
		System.out.println("\nWelcome to our " + shop.getLocation() + " Location!");
		
		// Ask user which flavor they would like from that IceCreamShop
		IceCream icecream = null;
		if (shop != null){
			System.out.println("\nWhat flavor of ice cream would you like?\n\t- Strawberry\n\t- Vanilla\n\t- Chocolate");
			if (input.hasNextLine()){
				String flavor = input.nextLine().toLowerCase();
				
				/* Here, the concrete IceCreamShop calls the orderIceCream() method, which uses the 
				   Factory Method createIceCream() that is implemented within the concrete ice cream shops
				   (either CharlestonIceCreamShop or SavannahIceCreamShop) to return the appropriate flavor 
				   of ice cream. The IceCreamShop does not need to know how the IceCream is created - all it needs
				   to know is that an IceCream has been instantiated. */
				icecream = shop.orderIceCream(flavor);
				shop.serve(icecream);
			}
			if (icecream == null){
				System.out.println("We do not have that flavor. Sorry!");
			}
		}
		
		System.out.println("\nThank you! Come back soon!");
	}

}
