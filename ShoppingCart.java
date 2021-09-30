/**
 * The class models an online shopping cart.
 *
 * Step 1: Enter your name and a date
 * @author  Kevin Lo
 * @version 2020-09-08
 */
public class ShoppingCart
{
    
    private double subTotal;
    
    /**
     * Constructs an object of class ShoppingCart by
     * initializing the instance variable.
     */
    public ShoppingCart ()
    {
        subTotal = 0;
    }
    
    
    /**
     * Adds the cost of a product to this shopping cart.
     *
     * @param cost the cost of the product
     */
    public void add(double cost) 
    {
       subTotal += cost;
    }
    
    
    
    /**
     * Removes the cost of a product from this shopping cart.
     * 
     * @param cost the cost of a product
     * 
     */
    public void remove(double cost) 
    {
        subTotal -= cost;
        
    }
    
    
    
    /**
     * Returns the subtotal of all products in this shopping cart.
     * 
     * @return the subtotal of this shopping cart
     */
    public double getSubtotal() 
    {
        return subTotal;
        
    }

    
}