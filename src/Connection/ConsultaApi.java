package Connection;

import com.google.gson.Gson;
import models.Pelicula;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
     public static Pelicula searchPelicula(int input) throws IOException, InterruptedException {
        URI uri = URI.create("https://swapi.dev/api/films/"+input);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> respuesta = client
                .send(request, HttpResponse
                        .BodyHandlers
                        .ofString());
        String json=respuesta.body();
        return new Gson().fromJson(json, Pelicula.class);
    }

}
