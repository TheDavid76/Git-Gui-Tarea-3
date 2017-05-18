
public class Ingredientes {

	private String nombre;
	private String unidad;
	private Float cantidad;
	
	
	public Ingredientes(Float cantidad, String nombre, String unidad) {
		this.nombre = nombre;
		this.unidad = unidad;
		this.cantidad = cantidad;
	}


	public Float getCantidad() {
		return cantidad;
	}

	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		unidad = unidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
