import Connection.ConsultaApi;
import models.Pelicula;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
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
                Pelicula one = ConsultaApi.searchPelicula(1);
                System.out.println(one);
                break;
            case 2:
                Pelicula two = ConsultaApi.searchPelicula(2);
                System.out.println(two);
                break;
            case 3:
                Pelicula three = ConsultaApi.searchPelicula(3);
                System.out.println(three);
                break;
            case 4:
                Pelicula four = ConsultaApi.searchPelicula(4);
                System.out.println(four);
                break;
            case 5:
                Pelicula five = ConsultaApi.searchPelicula(5);
                System.out.println(five);
                break;
            case 6:
                Pelicula six = ConsultaApi.searchPelicula(6);
                System.out.println(six);
                break;
            default: System.out.println("No se encuentra la pelicula");
        }

    }
}