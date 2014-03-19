package stest;

import java.io.Serializable;

abstract class Employee implements Serializable{
	public Employee(String id, String name) {
		super();
		this.name = name;
		this.id = id;
		CalcMonthAverSalary();
	}

	String name;
	String id;
	Double monthAverSalary;
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	protected Double getMonthAverSalary() {
		return monthAverSalary;
	}

	abstract public Double CalcMonthAverSalary();
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Id = " + id);
		sb.append(", name = " + name );
		sb.append(", month average salary = " + getMonthAverSalary());
		return sb.toString() ;
	}



}
