package gt.edu.url.nivelesacceso.usuario;

public  abstract class Employee {


		public String name; //Publica
		private int hireYear; 	//Privada 
		protected String country; //Protected 
		
		public void setHireYear (int hireYear) {
			this.hireYear = hireYear;
			
		}
		
		public int getHireYear () {
			return this.hireYear;
		}
		
		protected abstract double monthlyPay (); //Los abstract solo puede ser public o protected
		protected abstract double annualPay (); //default tambien pero solo en el mismo paquete
		

}
