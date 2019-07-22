

public abstract class Employee {
	private int empID;
	private String name;
	private Vehicle vehicle;
	
	
	public Employee(int eID, String eName, Vehicle eV) {
		this.empID = eID;
		this.name = eName;
		this.vehicle = eV;
	}
	
	public abstract double calculatePay();
	
	public void setEmpID(int id) {
		empID = id;
	}
	public void setName(String Aname) {
		name = Aname;
	}
	public void setVehicle(Vehicle v) {
		vehicle = v;
	}
	
	public int getEmpID() {
		return this.empID;
	}
	public String getName() {
		return this.name;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	
}
