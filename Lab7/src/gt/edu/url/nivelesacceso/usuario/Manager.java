package gt.edu.url.nivelesacceso.usuario;

public abstract class Manager extends SalariedEmployee {

		public double annnualPay() {
			return this.monthlyPay()*12;
		}
	
}
