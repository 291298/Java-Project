
public class Employee {
	
	public void handleCustomer(Customer cust, Vehicle vec, boolean finance){
		
		if(finance  == true) {
			
			double LoanAmmt = vec.getVehiclePrice() - cust.getCashOnHand();
			runCreditHistory(LoanAmmt, cust);
			
		}else if(cust.getCashOnHand() >= vec.getVehiclePrice()) {
			ProcessTranscation(cust,vec);
		}else {
			System.out.println("Bring More Cash For Purchasing These Vehicle");
			System.out.println("Price of these vehicle is :"+vec.getVehiclePrice());
		}
	}
	
	public void runCreditHistory(double LoanAmmt, Customer cust) {
		System.out.println(" Ran Customer Credit History");
		System.out.println("Loan Approved");
	}
	
	public void ProcessTranscation(Customer cust, Vehicle vec) {
		System.out.println("Customer has purchase the vehicle: " +vec.getVehicleName() 
		+ "\n For the price:"+vec.getVehiclePrice());
	}
}
