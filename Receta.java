import java.util.ArrayList;

public class Receta {

	private String nombre;
	
	ArrayList<Ingredientes>ingredientes = new ArrayList<Ingredientes>();
	ArrayList<String>preparacion = new ArrayList<String>();
	int personas= 4;
	String autor;
	
	Receta() {
		
	}
	
	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas; 
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	Receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion) {
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

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	
	
	public void addIngrediente(Ingredientes ingredientes) {	
		this.ingredientes.add(ingredientes);
	}
	
	public void addPreparacion(String preparacion) {
		this.preparacion.add(preparacion);
	}
	
	public Receta recetaPara(int personas){
		Receta receta = new Receta();
		ArrayList<Ingredientes>ingrediente = new ArrayList<Ingredientes>();;
		double numeroPersona = personas/this.getPersonas();
			for(Ingredientes i:ingrediente) {
				i.setCantidad((float) (i.getCantidad()*numeroPersona));
			}
		receta.setIngredientes(ingrediente);
		return receta;
	}
	
	public String listarIngredientes() {
		String lista="";
		for(Ingredientes i:ingredientes) {
			lista+=i.toString()+"\n";
		}
		return lista;
	}
	public String listarPreparacion() {
		String lista="";
		for(int i=0; i<preparacion.size(); i++) {
			int paso = i+1;
			lista+="Paso "+ paso + " : " +preparacion.get(i)+"\n";
		}
		return lista;
	}
	@Override
	public String toString() {
		return "Receta: " + nombre.toUpperCase() + "\n\nIngredientes\n" + listarIngredientes() + "\nPreparacion\n" + listarPreparacion();
	}
	 public static void main(String[] args) {
		Ingredientes i = new Ingredientes(3, "kg", "tomates");
		Ingredientes i2 = new Ingredientes(3, "kg", "macarrones");
		Receta r = new Receta();
		r.setNombre("Macarrones con tomate");
		r.addIngrediente(i);
		r.addIngrediente(i2);
		r.addPreparacion("Pelar los tomates");
		r.addPreparacion("Poner una olla con agua a hervir");
		r.addPreparacion("Añadir los macarrones");
		System.out.println(r.toString());
	 }
}
