import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;


public class Start
{
	public static void main(String args[])
	{
		try{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Gulistan Market");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You Choose Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(m.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							m.showAllEmployees();
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
				
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You Choose Shop  Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Search A Shop");
					System.out.println("\t4. Show All Shops");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop ID: ");
							int sid1 = sc.nextInt();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							Shop s1 = new Shop();
							s1.setsid(sid1);
							s1.setname(name1);
							
							if(m.insertShop(s1)){System.out.println("Shop Inserted with SID: "+s1.getsid());}
							else{System.out.println("Shop can not be inserted");}
							
							break;
							
						case 2:
						System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Existing Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop ID to Remove: ");
							int sid2 = sc.nextInt();
							
							Shop s2 = m.searchShop(sid2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2)){ System.out.println("Shop Removed with ID: "+s2.getsid());}
								else{System.out.println("Shop Can Not be Removed......");}
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							break;
						
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop SID: ");
							int sid3 = sc.nextInt();
							
							Shop s3 = m.searchShop(sid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found");
								System.out.println("Shop Name: "+s3.getname());
								System.out.println("Shop SID: "+s3.getsid());
								s3.showAllProducts();
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							
							break;
							
						case 4:
						System.out.println("---------------------------------");
							System.out.println("You Choose to See All Shops");
							System.out.println("---------------------------------");
							
							m.showAllShops();
							
						
							break;
							
						case 5:
						System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("You have chosen Shop Product Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Product for a Shop");
					System.out.println("\t2. Remove Existing Product of a Shop");
					System.out.println("\t3. Search A Product for a Shop");
					System.out.println("\t4. Show All Products of a Shop");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert New Product for a particular Shop ");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop SID: ");
							int sid1 = sc.nextInt();
							
							if(m.searchShop(sid1) != null)
							{
								System.out.println("\tWhat type of product do you want to purchase?");
								System.out.println("\t1. Local Product");
								System.out.println("\t2. Imported Product");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Product Type: ");
								int productType = sc.nextInt();
								
								if(productType == 1)
								{
									System.out.print("Enter Product ID: ");
									String pi1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn1 = sc.next();
									System.out.print("Enter Product Quaantity: ");
									int pq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pc1 = sc.nextDouble();
									
									System.out.print("Discount Rate: ");
									double dr = sc.nextDouble();
									
									LocalProduct lp = new LocalProduct();
									lp.setpid(pi1);
									lp.setname(pn1);
									lp.setavailableQuantity(pq1);
									lp.setprice(pc1);
									lp.setdiscountRate(dr);
									
									if(m.searchShop(sid1).insertProduct(lp))
									{
										System.out.println("Shop Inserted for "+ sid1 + " with Product Number " + pi1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
									
									
								}
								else if(productType == 2)
								{
									
									System.out.print("Enter Product ID: ");
									String pi1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn1 = sc.next();
									System.out.print("Enter Product Quaantity: ");
									int pq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pc1 = sc.nextDouble();
									System.out.print("Enter Country of Origin: ");
									String cn = sc.next();
									
									ImportedProduct ip = new ImportedProduct();
									ip.setpid(pi1);
									ip.setname(pn1);
									ip.setavailableQuantity(pq1);
									ip.setprice(pc1);
									ip.setcountryname(cn);
									
									if(m.searchShop(sid1).insertProduct(ip))
									{
										System.out.println("product Inserted for "+ sid1 + " with Product Number " + pi1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
								}
								else if(productType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid Product Type");
								}
							}
							else
							{
								System.out.println("SID MISMATCH");
							}
							
							break;
							
						case 2:
						
						
						
							break;
							
						case 3:
						
							break;
							
						case 4:
							
							break;
						
						case 5:
						
							break;
							
						default:
							
							break;
					}
					
					break;
					
				case 4:
					System.out.println("---------------------------------");
					System.out.println("You Chose to see Product Quantity");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Items");
					System.out.println("\t2. Sell items");
					System.out.println("\t3. Show Items Left");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Add item");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop SID: ");
							int sid1 = sc.nextInt();
							
							if(m.searchShop(sid1) != null)
							{
								System.out.print("Enter  Product availableQuantity: ");
								int pq1 = sc.nextInt();
								
								if(m.searchShop(sid1).searchProducts(pq1) != null)
								{
									System.out.print("Enter item to add: ");
									int am = sc.nextInt();
									
									if(m.searchShop(sid1).searchProducts(pq1).additem(am))
									{
										System.out.println("Adding Successfull");
										frwd.writeInFile("Add Item: "+ am +" in Product Quantity Number " + pq1 + " by " + sid1);
									}
									else
									{
										System.out.println("Can Not Add item");
									}
								}
								else
								{
									System.out.println("Invalid Product");
								}
								
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							
							break;
							
						case 2:
						
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose See Left Items");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							break;
							
						default:
						
							break;
					}
					
					break;
				
				case 5:
					System.out.println("---------------------------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------------------------");
					repeat = false;
					break;
				
				default:
					System.out.println("-----------------------------------");
					System.out.println("Invalid Choice.....");
					break;
				}
			System.out.println("-----------------------------------\n");
			}
		}
		catch(Exception e1){
			System.out.println();
			System.out.println("Exception: "+e1);
		}
		finally{
			System.out.println("There are some error in system!!!");
			System.out.println("Please try again..!!!");
		}
	}
}