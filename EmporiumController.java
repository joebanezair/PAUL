/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package main;

public class EmporiumController {
	
	private Emporium model;
	private EmporiumView view;
	
	public EmporiumController(Emporium model, EmporiumView view) {
	 this.model = model;
	 this.view = view;       
	}
	
        //name
	public void setFishName(String name){ model.setName(name); }
	public String getFishName(){ return model.getName(); }
	//name
        
        //color
	public void setColor(String color) { model.setColor(color); }
	public String getColor() { return model.getColor(); }
	//color
        
        //amount
	public void setAmount(int num) { model.setAmount(num); }
	public int getAmount() { return model.getAmount(); }
        //amount
        
        //details
        public void set_details(String details, String background){
           model.setDetails(details, background);
        }
        public String get_details(){ return model.getDetails(); }
        //details
        
        //price
        public void set_price(int price){ model.setprice(price); }
        public int get_price(){ return model.getprice(); }
        //price

    public void updateView(){
        view.printOrderDetails(model.getName(), model.getColor(), model.getDetails(), model.getAmount(), model.getprice());
    }
}
