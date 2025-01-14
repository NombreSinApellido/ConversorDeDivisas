import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conection {

    public Convertion coneccion(String base, String target, double amount){
        URI direction = URI.create("https://v6.exchangerate-api.com/v6/2ea2b12ed558746e81e71488/pair/" +
                base + "/" + target + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Convertion.class);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

