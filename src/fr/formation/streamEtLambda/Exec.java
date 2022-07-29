package fr.formation.streamEtLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exec {

	public static void main(String[] args) {
		List<Personne> lst = new ArrayList<>();
		lst.add(new Personne("Cérien","Jean",50));
		lst.add(new Personne("Terrieur","Alex",25));
		lst.add(new Personne("Terrieur","Alain",28));
		lst.add(new Personne("Tim","Vincent",5));
		
		// avant java 8
		List<String> lstNoms = new ArrayList<String>();
		for (Personne personne : lst) {
			if("Terrieur".equals(personne.getNom())) {
				lstNoms.add(personne.getPrenom());
			}
		}
		System.out.println(lstNoms);
		
		// depuis java 8
		lst.stream()
		.filter(p->"Terrieur".equals(p.getNom()))
		.map(p->p.getPrenom())
		.forEach(System.out::println);
		
		
		List<String> prenoms = 	lst.stream()
				.filter(p->"Terrieur".equals(p.getNom()))
				.map(p->p.getPrenom())
//				.toList(); // depuis 16
				.collect(Collectors.toList()); // en java 8

		
		// moyenne age
		double moyenne = lst.stream()
				.filter(p->"Terrieur".equals(p.getNom()))
				.mapToInt(p->p.getAge())
				.average().orElse(0);
		System.out.println(moyenne);
		
		// avant 8
//		List<Personne> lstp = null;
//		for (Personne personne : lst) {
//			if("Terrieur".equals(personne.getNom())) {
//				lstp.add(personne);
//			}
//		}
//		for (Personne personne : lstp) {
//			lst.remove(personne);
//		}
		
		lst.removeIf(p->"Terrieur".equals(p.getNom()));
		lst.forEach(System.out::println);
	}

}
