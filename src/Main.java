import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de la pelicula");
        String input = teclado.nextLine();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/films/?search="+input))
                .build();
        HttpResponse<String> respuesta = client
                .send(request, HttpResponse
                        .BodyHandlers
                        .ofString());
        String json=respuesta.body();
        System.out.println(json);
    }
}