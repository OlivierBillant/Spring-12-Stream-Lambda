package fr.formation.streamEtLambda;

public class EcriveurRouge implements Ecriveur {

	@Override
	public void ecrire(String message) {
		System.err.println(message);
	}

}
