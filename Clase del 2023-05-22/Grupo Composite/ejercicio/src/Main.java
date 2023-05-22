import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		NaveEspacial pew = new NaveEspacial(5, 1, 2, "Holder");
		NaveEspacial pew2 = new NaveEspacial(5, 1, 2, "Messi");
		 LinkedList<NaveEspacial> squad = new LinkedList<NaveEspacial>();
		 squad.add(pew);
		 squad.add(pew2);
		EscuadronCazas alfa = new EscuadronCazas(squad);
		//Escuadron picante = new Escuadron(alfa);
		//picante.adding(pew);
		
		System.out.println(pew);
		System.out.println(pew2);
		pew.attack(pew2);
		pew.attack(pew2);
		pew.attack(pew2);
		pew.attack(pew2);
		pew.attack(pew2);
		System.out.println(pew2);
		pew.attack(alfa);
		System.out.println(alfa);
		//System.out.println(picante);
		//alfa.attack(pew2);

	}

}
