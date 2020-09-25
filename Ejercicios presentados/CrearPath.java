package transparencias;


import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *  @descrition Clase ejemplo para crear Paths
 *	@author Laura
 *  @date 26/3/2015
 *  @version 1.0
 *  @license GPLv3
 */
public class CrearPath {
	
	public static void main(String[] args) {
		//Paths.get recibe o una URI que transforma en una ruta local en el formato del SO que estemos usando
		//ó una o varias cadenas que concatena para generar una ruta local en el formato del SO que estemos usando
		
		//Cadena: Creamos un path a partir de una cadena
		Path p1 = Paths.get("D:/tmp/foo");
		System.out.println(p1.toString());
		//Cadena o URI según lo que pasemos: Creamos un path a partir de un argumento
		//Botón derecho --> Run as --> Run Configurations --> En argumentos escribir una ruta: C:\Documentos
		Path p2 = Paths.get(args[0]);
		System.out.println(p2.toString());
		//URI: Creamos un path a partir de una URI
		Path p3 = Paths.get(URI.create("file:///D:/NetBeansProjects/DWEC_1.0/public_html/actividad2_4.html"));
		System.out.println(p3.toString());
		//Cadenas: Creamos un path a partir de variables de entorno y concatenando ubicaciones
		Path p4 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");
		System.out.println(p4.toString());
		//Path p5 = Paths.get(System.getProperty("user.dir"),"Programas");
		//System.out.println(p5.toString());

			
	}
}