package gt.edu.url.nivelesacceso.usuario;

public abstract class Staff extends SalariedEmployee {

	public double annnualPay() {
		return this.monthlyPay()*12;
	}

}
