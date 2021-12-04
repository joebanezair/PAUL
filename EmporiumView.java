package main;
public class EmporiumView {

	public void printOrderDetails(String name, String color, String details, int num, int price) {
		System.out.println("ORDER INFO\n");
		System.out.println("FISH NAME: " + name);
		System.out.println("COLOR: " + color);
                System.out.println("\nFISH EXTRA DETAILS : \n" + details);
		System.out.println("QUANTITY: " + num);
                System.out.println("PRICE: " + price);
	}
}
