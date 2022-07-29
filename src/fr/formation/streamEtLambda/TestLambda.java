package fr.formation.streamEtLambda;

public class TestLambda {

	public static void main(String[] args) {
		Ecriveur ec = new EcriveurRouge();
		ec.ecrire("Coucou");
		
		Ecriveur ecBalise = new Ecriveur() {
			@Override
			public void ecrire(String message) {
				System.out.println("<>"+message+"<>");
			}
		};
		
		ecBalise.ecrire("Coucou");
		
		Ecriveur ecBaliseRouge = m -> System.err.println("<>"+m+"<>");
		
		ecBaliseRouge.ecrire("coucou");
	}

}
