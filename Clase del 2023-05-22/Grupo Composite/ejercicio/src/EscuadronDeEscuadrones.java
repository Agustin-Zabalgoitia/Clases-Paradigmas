import java.util.LinkedList;

public class EscuadronDeEscuadrones extends EscuadronCazas {

	LinkedList<EscuadronCazas> escuadronCazas = new LinkedList<EscuadronCazas>();

	public EscuadronDeEscuadrones(LinkedList<NaveEspacial> ListaNaves) {
		super(ListaNaves);
		
		this.escuadronCazas.addAll(escuadronCazas);
	}
	

}
