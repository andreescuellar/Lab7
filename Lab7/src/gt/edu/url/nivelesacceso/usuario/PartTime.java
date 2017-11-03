package gt.edu.url.nivelesacceso.usuario;

public abstract class PartTime extends HourlyEmployee {

	public double annnualPay() {
		return this.monthlyPay()*12;
	}

}
