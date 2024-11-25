package Model;

public class Muebles {
	private String nombre; // Este sera nuestra llave
	private float precio;
	private String dimensiones;
	private int existencia;

	public Muebles() {
	}

	// Constructor con la llave
	public Muebles(String nombre) {
		this.nombre = nombre;
	}

	public Muebles(String nombre, float precio, String dimensiones, int existencia) {
		this.nombre = nombre;
		this.precio = precio;
		this.dimensiones = dimensiones;
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Muebles [nombre=" + nombre + ", precio=" + precio + ", dimensiones=" + dimensiones + ", existencia="
				+ existencia + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

}
