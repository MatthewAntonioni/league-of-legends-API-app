import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiCaller {
    
    public static void main(String[] args){

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("/riot/account/v1/accounts/by-riot-id/{gameName}/{tagLine}")).GET().build();

        

        try{

           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

           
        System.out.println("status code" + response.statusCode());

        System.out.println("reponse body" + response.body());

        }catch (IOException | InterruptedException e){

            e.printStackTrace();

        }

    }

}
