package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary, tax;
	
	public double NetSalary() {
		double netsalary = GrossSalary - tax;
		
		return netsalary;
		

	}

	public void IncreaseSalary(double percentage) {
		
		GrossSalary=GrossSalary+(GrossSalary*(percentage/100));
		
	}
}

