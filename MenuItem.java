//import for DecimalFormat
import java.text.*;

/** Class representing a generic menu item */
public class MenuItem
{
   private String name;
   private double price;
   
   public MenuItem()
   {
      name = "";
      price = 0;
   }
   
   public MenuItem(String aName, double aPrice)
   {
     name = aName;
     price = aPrice;
   }
   
   /** @return the name of the menu item */
   String getName(){
     return name;
   }

   /** @return the price of the menu item */
   double getPrice()
   {
      return price;
   }
   
   /** @return a String representation of the menu item */
   public String toString ()
   {
      DecimalFormat money = new DecimalFormat("0.00");
      return getName() + ": $" + money.format(getPrice());
   }
}