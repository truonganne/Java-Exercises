package com.qa.qacommunity;

import java.util.ArrayList;

public class ArrayLists {

public static void arrayListsExercise() {

//	String[]  ordersArray = new String[8];
	
//	Create an array list for drink order types	
	ArrayList<String> ordersList = new ArrayList<>();
	ArrayList<String> doneOrdersList = new ArrayList<>();
	
//	Add a new order to the orders array
	ordersList.add("Small Espresso w/ Chocolate");
	
//	Return the name of the order
    System.out.println("Initial order: " + ordersList);
	
//	Modify the order (passing in a string)
	ordersList.set(0, "Large Cold Brew w/ double shot");
    System.out.println("Modified order: " + ordersList);
	
		
//	Add the order to the doneOrders array
	doneOrdersList.addAll(ordersList);
	System.out.println("Done orders: " + doneOrdersList);
	
//	Remove the order from the orders array
    ordersList.remove(0);
    
//   Prints length of both array lists
    System.out.println("Final orders list: " + ordersList.size());
    System.out.println("Final done orders list: " + doneOrdersList.size());
    
//   Clear arrays
    ordersList.clear();
    doneOrdersList.clear();
    System.out.println("After clearing doneOrdersList" + doneOrdersList);


	}	
}
