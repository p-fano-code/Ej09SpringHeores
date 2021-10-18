package superheroes;

public class SuperHeroe {

	public int id;
	public String nombre;
	public int poder;
	public String nombrePoder;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public String getNombrePoder() {
		return nombrePoder;
	}
	public void setNombrePoder(String nombrePoder) {
		this.nombrePoder = nombrePoder;
	}
	
	
	@Override
	public String toString() {
		return "SuperHeroe [id=" + id + ", nombre=" + nombre + ", poder=" + poder + ", nombrePoder=" + nombrePoder
				+ "]";
	}
	
	
	
}
