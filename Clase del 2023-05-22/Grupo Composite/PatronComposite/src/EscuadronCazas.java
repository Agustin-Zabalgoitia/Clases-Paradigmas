import java.util.LinkedList;

public class EscuadronCazas extends UnidadCombate {
	private LinkedList<NaveEspacial> listaNaves = new LinkedList<NaveEspacial>();

	public EscuadronCazas(NaveEspacial nave) {
		listaNaves.add(nave);
		// TODO Auto-generated constructor stub
	}

	public EscuadronCazas(LinkedList<NaveEspacial> ListaNaves) {
		this.listaNaves.addAll(ListaNaves);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeDamage(int damage) {
		listaNaves.get(0).takeDamage(damage);
		if (!listaNaves.get(0).alive) {
			listaNaves.remove(0);
		}
		if (listaNaves.isEmpty()) {
			System.out.println("Se muri� el escuadron " + this.Nombre);
			this.alive = false;
		}
	}

	public void attack(NaveEspacial naveEnemiga) {
		for (NaveEspacial naveEspacial : listaNaves) {
			naveEnemiga.takeDamage(naveEspacial.damage);
		}
	}

	public void attack(EscuadronCazas escuadronEnemigo) {
		for (NaveEspacial naveEspacial : listaNaves) {
			naveEspacial.attack(escuadronEnemigo.listaNaves.getFirst());
		}
	}
	
	
	@Override
	public void move(int posX, int posY)
	{
		for (NaveEspacial naveEspacial : listaNaves) {
			naveEspacial.move(posX, posY);
		}
	}
	
	
}
