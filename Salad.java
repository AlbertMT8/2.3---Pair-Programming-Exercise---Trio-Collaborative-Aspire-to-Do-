/** Class representing a salad from the Simple Lunch Items */
public class Salad extends SimpleLunchItem
{
   private String dressing;
   
    public Salad(String name, String dressing, double price)
    { 
       super(name, price); 
       this.dressing = dressing;
     }
   
   //TO-DO
   //override the getName method to include the type of bread
 
   public String getName()
   {
      return super.getName() +" with "+ dressing + " dressing";
   }
}