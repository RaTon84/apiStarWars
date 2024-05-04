import Connection.Conexion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        //System.out.println("ingrese el numero de la pelicula");
        //String input = teclado.nextLine();

        System.out.println("Elija la pelicula de StarWars");
        System.out.println("1. A New Hope");
        System.out.println("2. The Empire Strikes Back");
        System.out.println("3. Return of the Jedi");
        System.out.println("4. The Phantom Menace");
        System.out.println("5. Attack of the Clones");
        System.out.println("6. Revenge of the Sith");
        int option= teclado.nextInt();
        switch (option){
            case 1:
                String one = Conexion.returnJson("A+new+Hope");
                System.out.println(one);
                break;
            case 2:
                String two = Conexion.returnJson("The+Empire+Strikes+Back");
                System.out.println(two);
                break;
            case 3:
                String three = Conexion.returnJson("Return+of+the+Jedi");
                System.out.println(three);
                break;
            case 4:
                String four = Conexion.returnJson("The+Phantom+Menace");
                System.out.println(four);
                break;
            case 5:
                String five = Conexion.returnJson("Attack+of+the+Clones");
                System.out.println(five);
                break;
            case 6:
                String six = Conexion.returnJson("Revenge+of+the+Sith");
                System.out.println(six);
                break;
            default: System.out.println("No se encuentra la pelicula");
        }

    }
}