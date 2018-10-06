package principal;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balancoJan = 15000;
		int balancoFev = 17000;
		int balancoMar = 23000;
		
		int balancoTrimestral = balancoJan + balancoFev + balancoMar;
		
		int mediaTrimestral = balancoTrimestral / 3;
		
		System.out.println("Valor trimestral "+balancoTrimestral+" Valor da média: "+mediaTrimestral);
	}

}
