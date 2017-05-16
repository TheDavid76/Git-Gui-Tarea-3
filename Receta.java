import java.util.ArrayList;

public class Receta {

	private String nombre;
	private String preparacion;
	
	ArrayList<String>ingredientes = new ArrayList<String>();
	
	Receta() {
		
	}
	
	Receta(String nombre, ArrayList<String> ingredientes, String preparacion) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.preparacion=preparacion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	
	
	
}
