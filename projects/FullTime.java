
public  class FullTime extends Employee {

	private double salary;
	private double overTime;
	private double rate;
	private double maxDay = 24;
	
	
	public FullTime(double Fsalary,double overT,double Rate,double MxDay,int eID, String eName, Vehicle eV) {
		super(eID, eName, eV);
		this.salary = Fsalary;
		this.overTime = overT;
		this.rate = Rate;
		this.maxDay = MxDay;
		
	}
	@Override
	public double calculatePay() {
	  if(getOverTime()>0) {
		  setSalary((this.getMaxDay() * this.getRate()) + this.getOverTime() * 10);
		  return getSalary();
	  }
	  else {
		  setSalary(this.getMaxDay() * this.getRate());
          return getSalary();
	  }
	}
	
	
	public void setSalary(double _sal) {
		this.salary = _sal;
	}
	public void setOverTime(double _ot) {
		this.overTime = _ot;
	}
	public void setRate(double _rate) {
		this.rate = _rate;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public double getOverTime() {
		return this.overTime;
	}
	public double getRate() {
		return this.rate;
	}
	public void setMaxDay(double _mDay) {
        this.maxDay = _mDay;
	}
	public double getMaxDay() {
        return this.maxDay;
	}

}
