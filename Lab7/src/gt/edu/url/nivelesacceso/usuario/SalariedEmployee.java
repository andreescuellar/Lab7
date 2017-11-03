package gt.edu.url.nivelesacceso.usuario;

public abstract class SalariedEmployee extends Employee {

	int annualSalary;
	
	public SalariedEmployee() {
		name = "Victor";
		setHireYear(1999);
		country = "Guatemala";
		
	}

	public double monthlyPay() {
		return 1000.00;
	}
	
	public abstract double annualPay();	
}
