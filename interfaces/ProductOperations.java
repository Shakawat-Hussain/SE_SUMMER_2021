package interfaces;
import java.lang.*;
import classes.Product;


public interface ProductOperations
{
	boolean insertProduct(Product p);
	boolean removeProduct(Product p);
	Product searchProducts(int availableQuantity);
	void showAllProducts();
}