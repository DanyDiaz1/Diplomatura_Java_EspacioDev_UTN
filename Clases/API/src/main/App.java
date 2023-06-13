package main;
import java.util.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://passwordinator.onrender.com/?num=true")).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String responseBody = response.body();

            if (statusCode != 200) {
                throw new RuntimeException("Ocurrio un error en la recepcion de los datos, error : " + statusCode);
            } else {
                 System.out.println("Response Body: " + responseBody);
                 //Procesamiento del archivo JSON
                 JSONObject jsonObject = new JSONObject(responseBody);
                 System.out.println(jsonObject.get("data"));
        
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
