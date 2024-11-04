/** Class representing a sandwich from the Simple Lunch Items */
public class Sandwich extends SimpleLunchItem
{
   private String bread;
   
   public Sandwich(String name, String bread, double price)
   { 
      super(name, price);
      this.bread = bread; 
   }
   
   //TO-DO
   //override the getName method to include the type of bread
 
   public String getName()
   {
      return super.getName() +" on " + bread;
   }

}