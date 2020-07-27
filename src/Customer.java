
public class Customer {
	private String name;
	private String add;
	private double cashOnHand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public void PurchaseCar(Vehicle vec, Employee emp, boolean finance) {
		emp.handleCustomer(this, vec ,finance);
	
	}
}