package stest;

public class HourlyEmployee extends Employee{
	private double rate;
	private static Double ALL_WORKING_HOURS = 40.0;
	public HourlyEmployee(String id, String name, double rate) {
		super(id, name);
		this.rate = rate;
		CalcMonthAverSalary();
		
	}

	@Override
	public Double CalcMonthAverSalary() {
		super.monthAverSalary = rate*ALL_WORKING_HOURS;
		return monthAverSalary;
	}
	@Override
	public String toString (){
		return super.toString() + ".....hourly wage" + "\n";
	}
}
