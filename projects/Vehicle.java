
public class Vehicle extends Employee{
	private String plateNumber;
	private String colour;
	

	public Vehicle (String vPlateNo,String Vcolor, int emId,String eName) {
		super(emId,Vcolor,ev);
		this.plateNumber = vPlateNo;
		this.colour = Vcolor;
	}
	
	
	public void setPlateNumber(String pn) {
		this.plateNumber = pn;
	}
	public void setColour(String Setcolor) {
		colour = Setcolor;
	}
	
	public String getPlateNumber() {
		return this.plateNumber;
	}
	public String getColour() {
		return this.colour;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
