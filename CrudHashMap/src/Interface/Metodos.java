package Interface;

import Model.Muebles;

public interface Metodos {
	
	public void guardar(Muebles mueble);

	public void listar();

	public Muebles buscar(String nombre);

	public void editar(Muebles mueble);

	public void eliminar(Muebles mueble);

}
