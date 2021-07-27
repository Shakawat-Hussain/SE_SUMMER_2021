package classes;
import java.lang.*;

public class ImportedProduct extends Product
{
	private String countryname;
	
	public void setcountryname(String countryname)
	{
		this.countryname = countryname;
	}
	public String getcountryname()
	{
		return countryname;
	}
	public void showInfo()
	{
		System.out.println("Product pid: "+getpid());
		System.out.println("Product Name: "+getname());
		System.out.println("AvailableQuantity: "+getavailableQuantity());
		System.out.println("Price : "+getprice());
		System.out.println("Country NAme: "+getcountryname());
		System.out.println();
	}
}