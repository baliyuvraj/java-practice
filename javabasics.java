import java.util.*;
public class javabasics{
    public static void main(String args[]){
        int ans = sum2();
        System.out.print(ans);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        return sum ;
    }
}