package customer.order.details;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OrderDetails {

	public static void main(String[] args) {
		
		Item item1 = new Item(134, "Moto24", 15000, "Mobiles");
		Item item2 = new Item(157, "Spiderman", 50, "Books");
		Item item3 = new Item(204, "Acer", 70000, "Laptops");
		Item item4 = new Item(210, "iPhone", 45000, "Mobiles");
		Item item5 = new Item(215, "Shirt", 1500, "Shirts");
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		
		
		Customer customer1 = new Customer(1, "Tom", "male", "Bangalore");
		Customer customer2 = new Customer(2, "Mike", "male", "Delhi");
		Customer customer3 = new Customer(3, "Miley", "female", "Pune");
		Customer customer4 = new Customer(4, "Kunal", "male", "Delhi");
		Customer customer5 = new Customer(5, "Sakshi", "female", "Delhi");
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		
		Order order1 = new Order(1, "delivered",LocalDate.of(2021, Month.NOVEMBER, 12), LocalDate.of(2021, Month.NOVEMBER, 14), Arrays.asList(item1,item3), customer1 );
		Order order2 = new Order(2, "delivered",LocalDate.of(2022, Month.MAY, 19), LocalDate.of(2022, Month.MAY, 24), Arrays.asList(item3), customer4 );	
		Order order3 = new Order(3, "delivered",LocalDate.of(2021, Month.JULY, 31), LocalDate.of(2021, Month.AUGUST, 4), Arrays.asList(item4,item5), customer2 );
		Order order4 = new Order(4, "pending",LocalDate.of(2022, Month.OCTOBER, 29), null, Arrays.asList(item1,item2,item3,item5), customer3 );
		Order order5 = new Order(5, "pending",LocalDate.of(2021, Month.OCTOBER, 30), null, Arrays.asList(item1), customer5 );
		
		List<Order> orderList = new ArrayList<>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		
		//1: Obtain a list of items belongs to category “Mobiles”
		
		List<Item> mobileList = itemList.stream()
								.filter(item -> item.getCategory() == "Mobiles")
								.collect(Collectors.toList());
		System.out.println("list of items belongs to category “Mobiles” :");
		System.out.println(mobileList);
		System.out.println();
		System.out.println();
		
		
		//2: Obtain a list of items belongs to category “Mobiles” and price is greater than 20000
		
		List<Item> mobileListWithPrice = itemList.stream()
								.filter(item -> item.getCategory() == "Mobiles" && item.getPrice() > 20000)
								.collect(Collectors.toList());
		System.out.println("list of items belongs to category “Mobiles” and price is greater than 20000 :");
		System.out.println(mobileListWithPrice);
		System.out.println();
		System.out.println();
		
		//3: Obtain a list of order with items category is not “Mobiles”
		List<Order> orderListWithoutMobile = orderList.stream()
											 .filter(order -> {
												 List<Item> tempList = order.getItems().stream().filter(item -> item.getCategory() == "Mobiles").collect(Collectors.toList());
												 //System.out.println(tempList);
												 if(!tempList.isEmpty()) {
													 return false;
												 }
												 return true;
												 })
											 .collect(Collectors.toList());
		System.out.println("list of order with items category is not “Mobiles” :");
		System.out.println(orderListWithoutMobile);
		System.out.println();
		System.out.println();
		
		
		//4. Obtain a list of items with category “Laptops” and then apply 5% discount
		System.out.println("list of items with category “Laptops” and then apply 5% discount :");
		itemList.stream()
		.filter(item -> item.getCategory() == "Laptops")
		.forEach(item -> { 
			  double discount = ((double)5/100) * item.getPrice(); 
			  item.setPrice(item.getPrice()-discount);
			  System.out.println(item);
		});
		System.out.println();
		System.out.println();
		
		
		//5: Obtain a list of items ordered by customers who are female 
		Set<Item> orderedByFemale = orderList.stream()
										   .filter(order ->  order.getCus().getGender() == "female")
									       //.map(order -> order.getItems())
									       .flatMap(order -> order.getItems().stream())
									       .collect(Collectors.toSet());
		System.out.println("list of items ordered by customers who are female :");
		System.out.println(orderedByFemale);
		System.out.println();
		System.out.println();
		
		
		//6: Obtain a list of items ordered by customers between 01-Jan-2022 and 31-Oct-2022
		LocalDate fromDate = LocalDate.of(2022, Month.JANUARY, 01);
		LocalDate toDate = LocalDate.of(2022, Month.OCTOBER, 31);
		
		Set<Item> orderedInGivenDate = orderList.stream()
										.filter(order -> (order.getOrderDate().compareTo(fromDate) >= 0 
																		&& order.getOrderDate().compareTo(toDate) <= 0))
										//.map(order -> order.getItems())
										.flatMap(order -> order.getItems().stream())
										.collect(Collectors.toSet());
		System.out.println("list of items ordered by customers between 01-Jan-2022 and 31-Oct-2022 :");
		System.out.println(orderedInGivenDate);
		System.out.println();
		System.out.println();
	}

}
