
public abstract class UnidadCombate {

	protected int posX = 0;
	protected int posY = 0;
	protected String Nombre;
	protected boolean alive = true;
	protected int HP ;

	public void move(int newPosX, int newPosY) {
		this.posX = newPosX;
		this.posY = newPosY;
	}

	public abstract void takeDamage(int damage);

	public void mostrarPosicion() {
		System.out.println("Posicion en x: " + this.posX + "\nPosicion en Y: " + this.posY);
	}
	

}
