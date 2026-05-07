import java.util.Scanner;

public class App{

public static void info(String str){

System.out.println("balls");

}

public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 System.out.println(System.getenv("RIOT_API_KEY"));

ApiCaller api = new ApiCaller();

System.out.println("please enter your riot Username");
String gameName = scan.nextLine();

System.out.println("please enter your riot Tagline");
String tagLine = scan.nextLine();

String response = api.getAccountData(gameName, tagLine);

System.out.println(response);


}



}
