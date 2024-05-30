import java.util.*;
public class javabasics{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter temperature in celcius : ");
    float tempC=sc.nextFloat();
    float tempF = (tempC * 9/5) + 32;
    System.out.print("the temperature in farenhite is " + tempF);
    }
}