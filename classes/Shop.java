package classes;
import java.lang.*;
import interfaces.*;


public class Shop implements ProductOperations
{
	private String name;
	private int sid;
	private Product products[] = new Product [10];
	
	
	public void setname(String name){this.name = name;}
	public void setsid(int sid){this.sid = sid;}
	
	
	public String getname(){return name;}
	public int getsid(){return sid;}
	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllProducts()
	{
		for(int i =0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				products[i].showInfo();
			}
		}
	}
	public Product searchProducts(int availableQuantity)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getavailableQuantity() == availableQuantity)
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
}