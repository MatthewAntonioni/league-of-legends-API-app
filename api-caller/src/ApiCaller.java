import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiCaller {
    
    public String getAccountData(String gameName, String tagLine){

        String apikey = System.getenv("RIOT_API_KEY");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create( "https://americas.api.riotgames.com/riot/account/v1/accounts/by-riot-id/" + gameName + "/" + tagLine))
        .header("Accept", "application/json")
        .header("X-Riot-Token", apikey)
        .GET()
        .build();

        

        try{

           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

           
        System.out.println("status code" + response.statusCode());

        System.out.println("reponse body" + response.body());

        }catch (IOException | InterruptedException e){

            e.printStackTrace();



        }
        return null;

    }

}
