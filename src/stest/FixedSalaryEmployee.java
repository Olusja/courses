package stest;

public class FixedSalaryEmployee extends Employee {

	public FixedSalaryEmployee(String id, String name, Double monthAverSalary) {
		super(id, name);
		super.monthAverSalary = monthAverSalary;
	}

	@Override
	public Double CalcMonthAverSalary() {
		return monthAverSalary;
	}
	@Override
	public String toString (){
		return super.toString() + ".....fixed wage" + "\n";
	}

}
