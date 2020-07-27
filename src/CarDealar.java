public class CarDealar {

	public static void main(String[] args) {
		Customer  cust = new Customer ();
		cust.setName("John");
		cust.setAdd("101 st. Yavatmal");
		cust.setCashOnHand(12000);
		
		Vehicle vec = new Vehicle("Honda City", 15);
		//vec.setVehicleName("Honda City");
		//vec.setVehiclePrice(15000);
		
		Employee emp= new Employee();
		
		cust.PurchaseCar(vec, emp,false);
		
		
	}

}
