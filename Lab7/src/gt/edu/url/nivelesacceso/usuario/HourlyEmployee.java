package gt.edu.url.nivelesacceso.usuario;

public abstract class HourlyEmployee {

	int hourPerWeek = 7;
	double hourlyWage= 252.00;
	
	public double monthlyPay() {
		return hourPerWeek * hourlyWage;
	}
	
	public abstract double annualPay();	
}
