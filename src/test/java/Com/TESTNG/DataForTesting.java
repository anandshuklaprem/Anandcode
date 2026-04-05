package Com.TESTNG;

import org.testng.annotations.DataProvider;

public class DataForTesting {
@DataProvider(name="ebay search")
public String[] search() {
	String [] arr= {"Mobile","Laptop","Sunglasses","graphic card"};
	return arr;
}
 



@DataProvider(name="ebay search anand wishList")
public String[][] data(){
	String[][] arr =new String [4][2];
	arr[0][0]="mobile";
	arr[0][1]="Mobile for sale | eBay";
			
	arr[1][0]="mac";
	arr[1][1]="Mac for sale | eBay";
			
	arr[2][0]="graphic card";
	arr[2][1]="Graphic Card for sale | eBay";
	
	arr[3][0]= "Bike";
	arr[3][1]="Bike for sale | eBay";
	return arr;
	
}
}
