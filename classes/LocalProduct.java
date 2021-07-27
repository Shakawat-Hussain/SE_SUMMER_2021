package classes;


import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public void setdiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getdiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Product pid: "+getpid());
		System.out.println("Product Name: "+getname());
		System.out.println("AvailableQuantity: "+getavailableQuantity());
		System.out.println("Price : "+getprice());
		System.out.println("Discount Rate: "+getdiscountRate());
		System.out.println();
	}
}