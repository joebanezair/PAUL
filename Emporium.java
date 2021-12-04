package main;

public class Emporium {
    
        //Encapsulation variables
	      private String fish_name, fish_color, fish_details, fish_background;
        private int fish_price, fish_quantity;
        //Encapsulation variables
        
        //fish name
	      public void setName(String name) { fish_name = name; }	
	      public String getName() { return fish_name; }
      	//fish name
        
        //color
	      public void setColor(String color) { fish_color = color; }
	      public String getColor() { return fish_color; }
      	//color
        
        //details
        public void setDetails(String details, String background){ fish_details = details;  fish_background = background; }
        public String getDetails(){ String D = fish_details + fish_background; return D; }
        //details
        
        //price
        public void setprice(int price){ 
          fish_price = price;
        }
        public int getprice(){ return fish_price; }
        //price
        
        //quantity
	      public void setAmount(int quantity) { fish_quantity = quantity; }
	      public int getAmount() { return fish_quantity; }
        //quantity
}

