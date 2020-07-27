
public class Vehicle {
	private String vehicleName;
	private double vehiclePrice;
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	
	public Vehicle(String vehicleName, double vehiclePrice) {
		super();
		this.vehicleName = vehicleName;
		this.vehiclePrice = vehiclePrice;
	}
	
	
}
