package Implemenatacion;

import java.util.HashMap;

import Interface.Metodos;
import Model.Muebles;

public class LogicaMetodos implements Metodos {

	// Para pasar el tipo de tado en el HashMap especialmente la llave debe estar
	// parseado
	// Que tipos de datos se parsean --- tipos de datos primitivos
	HashMap<String, Muebles> hashMapMuebles = new HashMap<String, Muebles>();

	@Override
	public void guardar(Muebles mueble) {
		// TODO Auto-generated method stub
		hashMapMuebles.put(mueble.getNombre(), mueble);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapMuebles);
	}

	@Override
	public Muebles buscar(String nombre) {
		// TODO Auto-generated method stub
		return hashMapMuebles.get(nombre);
	}

	@Override
	public void editar(Muebles mueble) {
		// TODO Auto-generated method stub
		hashMapMuebles.put(mueble.getNombre(), mueble);
	}

	@Override
	public void eliminar(Muebles mueble) {
		// TODO Auto-generated method stub
		hashMapMuebles.remove(mueble.getNombre());
	}

}
