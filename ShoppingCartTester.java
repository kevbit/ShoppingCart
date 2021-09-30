/**
 * A tester program for class ShoppingCart.
 *
 * 
 * @author  Kevin Lo
 * @version 2020-09-08
 */
public class ShoppingCartTester
{
    public static void main(String[] args)
    {
        double costOne = 20.50;   
        double costTwo = 209.90;  

        // Step 2: Create a ShoppingCart object and assign it to
        //         a variable called cart
        
        ShoppingCart cart = new ShoppingCart();
        
        // Testing method getSubtotal() on an empty cart
        System.out.print("The subtotal of the shopping cart: ");
        System.out.printf("%.2f\n", cart.getSubtotal());
        System.out.printf("Expected: %.2f\n", 0.0);
        
        // Step 3: Activate method add() on cart 
        //         with parametr costOne
        cart.add(costOne);
        
        
        // Testing method getSubtotal() after adding costOne
        System.out.print("The subtotal of the shopping cart: ");
        System.out.printf("%.2f\n", cart.getSubtotal());
        System.out.printf("Expected: %.2f\n", costOne);
        
        // Step 4: Activate method add() on cart 
        //         with parametr costTwo
        cart.add(costTwo);
        
        
        // Testing method getSubtotal() after adding costTwo
        System.out.print("The subtotal of the shopping cart: ");
        System.out.printf("%.2f\n", cart.getSubtotal());
        System.out.printf("Expected: %.2f\n", costOne + costTwo);
        
        // Step 5: Activating the remove() method 
        //         with parameter costTwo
        cart.remove(costTwo);
        
        
        // Testing method getSubtotal() after removing costTwo
        System.out.print("The subtotal of the shopping cart: ");
        System.out.printf("%.2f\n", cart.getSubtotal());
        System.out.printf("Expected: %.2f\n", costOne);
        
        // Step 6: Activating the remove() method 
        //         with parameter costOne
        cart.remove(costOne);
        
        
        // Testing method getSubtotal() after removing costOne
        System.out.print("The subtotal of the shopping cart: ");
        System.out.printf("%.2f\n", cart.getSubtotal());
        System.out.printf("Expected: %.2f\n", 0.0);
    }
}