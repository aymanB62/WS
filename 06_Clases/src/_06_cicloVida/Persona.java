package _06_cicloVida;

public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean casado;

	
	//String direccion;
	
	//Trabajar con direcciones de tipo String es complicado y engorroso
	//ya que la informacion de dentro no esta normalizada y nos cuesta 
	//mucho 
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", casado=" + casado + "]";
	}
}
