import java.util.LinkedList;

public class Escuadron extends UnidadCombate {

	protected LinkedList<UnidadCombate> squad = new LinkedList<UnidadCombate>();
	public Escuadron(LinkedList<Object> sq) {
		this.squad.addAll(sq);
	}
	public Escuadron(UnidadCombate sq) {
		this.squad.add(sq);
	}
	@Override
	public void takeDamage(int damage) {
		for (UnidadCombate unidadCombate : squad) {
			unidadCombate.takeDamage(damage);
		}
	}
	@Override
	public void move(int posX, int posY) {
		for (UnidadCombate unidad : squad) {
			unidad.move(posX, posY);
		}
	}
	public void adding(UnidadCombate uni) {
		this.squad.add(uni);
	}
	@Override
	public String toString() {
		return "Escuadron [squad=" + squad + ", posX=" + posX + ", posY=" + posY + ", Nombre=" + Nombre + ", alive="
				+ alive + ", HP=" + HP + "]";
	}
}
