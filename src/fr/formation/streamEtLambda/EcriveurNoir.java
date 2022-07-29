package fr.formation.streamEtLambda;

public class EcriveurNoir implements Ecriveur {

	@Override
	public void ecrire(String message) {
		System.out.println(message);
	}

}
