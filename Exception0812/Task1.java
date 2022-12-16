package Exception0812;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task1 {
    // clientService
    HttpClient client = HttpClient.newHttpClient(); // позволяет делать http запросы

    public static void main(String[] args) {
        System.out.println(getSize(new int[] { 1, 2 }));
        System.out.println(getSize(new int[] { 1, 2, 3, 4, 5, 6 }));

    }

    public String get(String sourceUrl) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest // объект - запрос
                .newBuilder() // строим запрос
                .uri(new URI(sourceUrl)) // url куда надо сходить
                .GET() // т.е. ни какую информацию в запросе делать не буду
                .build();
        // String fileName = sourceUrl.substring(sourceUrl.lastIndexOf('/') + 1);

        HttpResponse<String> respons;
        try {
            respons = client.send((httpRequest), HttpResponse.BodyHandlers.ofString()); // здесь может произойти много
                                                                                        // ошибок => в try catch
        } catch (Exception e) {
            throw new RuntimeException("Не удалось сделать запрос");
        }

        if (respons.statusCode() != 200) {
            throw new RuntimeException("ошибка скачивания");
        }

        System.out.println(response.body());
        return response.body();

    }
}
