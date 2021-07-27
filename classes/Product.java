package classes;
import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	protected String pid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setpid(String pid){this.pid = pid;}
	public void setname(String name){this.name = name;}
	public void setavailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	public void setprice(double price){this.price = price;}
	
	
	public String getpid(){return pid;}
	public String getname(){return name;}
	public int getavailableQuantity(){return availableQuantity;}
	public double getprice(){return price;}
	
	public abstract void showInfo();
	public boolean additem(int item)
	{
		if(item>0)
		{
			System.out.println("Previous Items: "+ availableQuantity);
			System.out.println("Add Item: "+ item);
			availableQuantity += item;
			
			System.out.println("Current Items of Product: "+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellitem(int item)
	{
		if(item>0 && item<=availableQuantity)
		{
			System.out.println("Previous Items:	"+ availableQuantity);
			System.out.println("After Selling :	"+ item);
			availableQuantity -= item;
			System.out.println("Current Number of items:	"+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
		
}