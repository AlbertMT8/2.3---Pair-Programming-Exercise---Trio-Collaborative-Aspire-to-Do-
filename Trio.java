/**
 * @author Albert Tsao, Eric Nie, Nathan Egbuna
 */
/** Class representing a Trio Package of Simple Menu Items */

import java.util.Arrays;

public class Trio extends MenuItem
{
   //the instance variables that you need for a trio object
   Sandwich item1;
   Salad item2;
   Drink item3;

   // A constructor that takes a Sandwich, Salad, and a Drink, in that order
   public Trio(Sandwich sand, Salad sal, Drink drink)
   {
      this.item1 = sand;
      this.item2 = sal;
      this.item3  = drink;
   }

   /** @return the sandwich name/salad name/drink name for this  Trio */
   public String getName()
   {
      //TO DO: edit this to return the sandwich name/salad name/drink name
      return item1.getName() + "/" + item2.getName() + "/" + item3.getName();
   }

  /** @return the price of the two highest price items in the trio. */
   public double getPrice()
   {
      //TO DO: edit the following, so the lowest priced item is not included in the price
      double cost1 = item1.getPrice();
      double cost2 = item2.getPrice();
      double cost3 = item3.getPrice();
      
      double[] costs = {cost1, cost2, cost3};
      Arrays.sort(costs);

      return costs[1] +costs[2] ;           
            
   }

   //DO NOT EDIT UNTIL PART 2
   public static void main(String[] args)
   {
      Sandwich burger = new Sandwich("Cheeseburger","bun", 2.75);
      Sandwich club = new Sandwich("Club Sandwich", "rye", 2.75);
      Salad spinachSalad = new Salad("Spinach Salad","italian", 1.25);
      Salad coleslaw = new Salad("Coleslaw", "no", 1.25);
      Drink orange = new Drink("Orange Soda", 1.25);
      Drink cap = new Drink("Cappuccino", 3.50);
      Trio trio1 = new Trio(burger,spinachSalad, orange);
      System.out.println(trio1);
      Trio trio2 = new Trio(club,coleslaw,cap);
      System.out.println(trio2);
      
      //Why doesn't the commented out code below compile?
      //Trio trio3 = new Trio(spinachSalad,coleslaw,orange);
      //System.out.println(trio3);
   }
}
