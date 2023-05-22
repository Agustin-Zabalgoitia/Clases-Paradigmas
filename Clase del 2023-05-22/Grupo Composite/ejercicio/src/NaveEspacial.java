
public class NaveEspacial extends UnidadCombate {

	protected int damage;
	protected int fuel;

	public NaveEspacial(int HP, int damage, int fuel, String nombre) {
		this.HP = HP;
		this.Nombre = nombre;
		this.fuel = fuel;
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "NaveEspacial [damage=" + damage + ", fuel=" + fuel + ", posX=" + posX + ", posY=" + posY + ", Nombre="
				+ Nombre + ", alive=" + alive + ", HP=" + HP + "]";
	}

	public void attack(NaveEspacial unit) {
		unit.takeDamage(this.damage);
	}
	public void attack(UnidadCombate unit) {
		unit.takeDamage(this.damage);
	}

	public void takeDamage(int damage) {
		this.HP -= damage;

		if (this.HP <= 0) {
			alive = false;
			System.out.println(this.Nombre + " Nave caida");
		}
	}

	public int mostrarVida() {
		return this.HP;
	}

}
