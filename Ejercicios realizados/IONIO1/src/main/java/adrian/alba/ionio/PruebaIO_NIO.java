/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.alba.ionio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase encargada de probar los diferentes metodos que ofrece la clase Paths del paquete Java-NIO
 * @author Nairda
 */
public class PruebaIO_NIO {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Nairda\\fotos");
        //Devuelve el path como un String
        System.out.format("toString: %s%n", path.toString());
        //Devuelve el nombre de la carpeta a la que accedemos
        System.out.format("getFileName: %s%n", path.getFileName());
        //Devuelve el nombre de la carpeta en la posicion (0) sin contar la raiz
        System.out.format("getName(0) %s%n", path.getName(0));
        //Cuenta la cantidad de nodos por los que llega hasta posicionarse en el final del path
        System.out.format("getNameCount %s%n", path.getNameCount());
        //Devuelve el subpath reclamado empezando a contar desde la posicion (0) y (2) nodos mas
        System.out.format("subPath %s%n", path.subpath(0, 2));
        //Devuelve el path hacia el nodo padre del path recibido por parametro
        System.out.format("getParent %s%n", path.getParent());
        //Devuelve la raiz del path de la cual no hay nodos anteriores
        System.out.format("getRoot %s%n", path.getRoot());
    }
}
