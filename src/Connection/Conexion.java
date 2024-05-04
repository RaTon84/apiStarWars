package Connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {
    public static String returnJson(String input) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/films/?search="+input))
                .build();
        HttpResponse<String> respuesta = client
                .send(request, HttpResponse
                        .BodyHandlers
                        .ofString());
        String json=respuesta.body();
        return json;
    }

}
