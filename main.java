import java.util.Scanner;

public class main{

public static void info(String str){

System.out.println("balls");

}

public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

ApiCaller api = new ApiCaller();

System.out.println("please enter your riot ID");
String str = scan.nextLine();

System.out.println("this is your riot id " + str);

info(str);

}



}
