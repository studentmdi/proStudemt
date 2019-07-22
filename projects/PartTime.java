

public class PartTime extends Employee {

	

	private double rate;
	private double hoursWorked;
	private double salary;
	
	public PartTime(double _rate,double _hworked,double _sal,int _empID, String _name, Vehicle _v) {
		super(_empID, _name, _v);
		this.rate = _rate;
		this.hoursWorked = _hworked;
		this.salary = _sal;
		
	}
	@Override
	public double calculatePay() {
		setSalary(this.getHoursWorked()*this.getRate());
		return getSalary();
	}
	
	public void setRate(double _r) {
		this.rate = _r;
	}
	public void setHoursWorked(double hw) {
		this.hoursWorked = hw;
	}
	private void setSalary(double sal) {
		this.salary = sal;
	}
	
	public double getRate() {
		return this.rate ;
	}
	public double getHoursWorked() {
		return this.hoursWorked;
	}
	public double getSalary() {
		return this.salary;
	}
}
