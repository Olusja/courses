package stest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeExecutor {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new HourlyEmployee("01", "Misha", 60));
		employees.add(new HourlyEmployee("02", "Vasya", 18));
		employees.add(new HourlyEmployee("03", "Nadya", 20));
		employees.add(new HourlyEmployee("04", "Valya", 30));
		employees.add(new HourlyEmployee("05", "Vasya", 40));
		employees.add(new HourlyEmployee("06", "Petya", 60));
		employees.add(new FixedSalaryEmployee("07", "Kolya",2000.0));
		employees.add(new FixedSalaryEmployee("08", "Halya", 2000.0));
		employees.add(new FixedSalaryEmployee("09", "Dima", 2000.0));
		employees.add(new FixedSalaryEmployee("10", "Vira", 2000.0));
		employees.add(new FixedSalaryEmployee("11", "Olya", 2000.0));
		
		Comparator<Employee> compEmployeeName = new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		Comparator<Employee> compEmployeeSal = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getMonthAverSalary().compareTo(o2.getMonthAverSalary());
			}
		};
		
		Collections.sort(employees, compEmployeeName);
		Collections.sort(employees, compEmployeeSal);


		System.out.println(employees);
		for (int i = 0; i < 5; i++){
			System.out.println((employees.get(i)).name);
		}
		for (int i = (employees.size())-3; i < employees.size(); i++){
			System.out.println((employees.get(i)).id);
		}
		 
//		ObjectOutputStream out = null;
//		try {
//	     out = new ObjectOutputStream(new BufferedOutputStream(
//	                                  new FileOutputStream("Employess.ser")));
//	     out.writeObject(employees);
//		} catch ( IOException ex ) {
//			ex.printStackTrace();
//		}
//		finally {
//			if ( out != null )
//				try {
//					out.close();
//				} catch ( IOException ex ) {
//					ex.printStackTrace();
//				}
//		}
//		ObjectInputStream in = null;
//		ArrayList<Employee> restObj = null;
//		try {
//		    in = new ObjectInputStream(new BufferedInputStream(
//		                               new FileInputStream("Employess.ser")));
//		    try {
//				restObj = (ArrayList<Employee>)in.readObject();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch ( IOException ex ) {
//		   ex.printStackTrace();
//		}
//		System.out.println(restObj);

//	FileWriter fw = new FileWriter("Employees.ser");
//	BufferedWriter bw = new BufferedWriter(fw);
//	bw.write(employees.toString());
//	bw.close();
//	
//	FileReader fr = new FileReader("Employees.ser");
//	BufferedReader br = new BufferedReader(fr);
//	String s = null;
//	while ((s = br.readLine()) != null)
//	System.out.println(s.toString());
//	
	
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	fos = new FileOutputStream("Employees1.ser");
	oos = new ObjectOutputStream(fos);
	oos.writeObject(employees);
	oos.close();
	
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	fis = new FileInputStream("Employees1.ser");
	ois = new ObjectInputStream(fis);
	ArrayList<Employee> newEmployees = null;
	try {
		newEmployees = (ArrayList<Employee>) ois.readObject();
		ois.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (FileNotFoundException ex){
		ex.printStackTrace();
	}
	System.out.println(newEmployees);
	 
	}
}
