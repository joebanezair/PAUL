package main;
import java.util.*;

public class MVCEmporium {

       
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Emporium model = retrieveOrderInfo();
		EmporiumView view = new EmporiumView();
		EmporiumController controller = new EmporiumController(model, view);
		controller.updateView();
		System.out.println("\nIs this order correct? (Y/N)");
		String opt = s.nextLine();
		
                if(opt.equalsIgnoreCase("y")) {
		  System.out.println("\nThank you for purchasing at Pontus' Emporium.");
		}else if(opt.equalsIgnoreCase("n")){
		  System.out.println("Change which field? N for name, C for color, A for amount.");
		  String edit = s.nextLine();
		  if(edit.equalsIgnoreCase("n")) {
		    System.out.println("Enter the fish name: ");
		    controller.setFishName(s.nextLine());
		    System.out.println("\n- - UPDATED ORDER - -\n");
		    controller.updateView();
		} else if(edit.equalsIgnoreCase("c")) {
		    System.out.println("Enter the fish color: ");
		    controller.setColor(s.nextLine());
		    System.out.println("\n- - UPDATED ORDER - -\n");
		    controller.updateView();
	        } else if(edit.equalsIgnoreCase("a")) {
		    System.out.println("Enter quantity: ");
		    controller.setAmount(s.nextInt());
                    
                    //get set price
                    int price = controller.getAmount();
                    int finalprice = price * 3000;
                    controller.set_price(finalprice);
                    //get set price
		    System.out.println("\n- - UPDATED ORDER - -\n");
		    controller.updateView();
		 }
		}
                
	}
	
	private static Emporium retrieveOrderInfo() {
            int price = 3000, amount = 1;
		Emporium e = new Emporium();
		e.setName("Betta");
		e.setColor("Red");
                
                //fish details
                String F_details, F_background;
                F_details = "High Fin Red_Melano"; 
                F_background = "\nSalt Water Fish\nEats small fish\n";
                e.setDetails(F_details,F_background);
                //fish details
               
                e.setprice(price);
		e.setAmount(amount);
		return e;
	}
}
