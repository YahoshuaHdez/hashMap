package Main;

import java.util.Scanner;

import Implemenatacion.LogicaMetodos;
import Model.Muebles;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las varia
		Scanner lectura = null;

		String nombre; // Este sera nuestra llave
		float precio;
		String dimensiones;
		int existencia;

		Muebles mueble = null;

		int menuPrin, subMenu;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch (menuPrin) {
			case 1:
				System.out.println("Ingrese el nombre");
				lectura = new Scanner(System.in);
				nombre=lectura.nextLine();
				
				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio=lectura.nextFloat();
				
				System.out.println("Ingrese dimensiones");
				lectura = new Scanner(System.in);
				dimensiones=lectura.nextLine();
				
				System.out.println("Ingrese la existencia");
				lectura = new Scanner(System.in);
				existencia=lectura.nextInt();
				
				//Crear el objeto
				mueble = new Muebles(nombre, precio, dimensiones, existencia);
				
				//Guardar
				imp.guardar(mueble);
				System.out.println("Se guardo");
				break;
			case 2:
				imp.listar();
				break;
			case 3:
				
				System.out.println("INGRESE EL NOMBRE A BUSCAR");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//buscar
				mueble = imp.buscar(nombre);
				System.out.println("SE ENCONTRO: "+mueble);
				
				
				break;
			case 4:
				
				System.out.println("INGRESE EL NOMBRE A BUSCAR");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//buscar
				mueble = imp.buscar(nombre);
				System.out.println("SE ENCONTRO: "+mueble);
				
				//Editar pecios y dimenciones
				do {
					
					System.out.println("SUBMENU DE EDITAR");
					System.out.println("1 PRECIO");
					System.out.println("2 DIMENSIONES");
					System.out.println("3 REGRESAR A MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					
					switch(subMenu) {
					
					case 1:
					
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						
						//Actualizado
						mueble.setPrecio(precio);
						imp.editar(mueble);
						System.out.println("SE EDITO");
						
					break;
					
					case 2:
						
						System.out.println("INGRESE LAS NUEVAS DIMENSIONES");
						lectura = new Scanner(System.in);
						dimensiones = lectura.nextLine();
						
						//Actualizado
						mueble.setDimensiones(dimensiones);
						imp.editar(mueble);
						System.out.println("SE EDITO");
						
						break;
						
					case 3:
						break;
					
					}
					
				}while(subMenu < 3);
				
				break;
			case 5:
				
				System.out.println("INGRESE EL NOMBRE A ELIMINAR");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//creamos el onjeto con la llave
				mueble = new Muebles(nombre);
				
				//Eliminamos con el onjeto creado
				imp.eliminar(mueble);
				System.out.println("SE ELIMINO CON EXITO");
				
				break;
			case 6:
				break;
			}

		} while (menuPrin < 6);
	}

}
