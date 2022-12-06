import java.util.Scanner;
public class Calculator{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    float a=sc.nextFloat();
    System.out.println("Enter the second number");
    Float b=sc.nextFloat();
    System.out.println("Enter 1,2,3,4 to get addition,substraction,multiplication,divition of the two numbers respectively:");
  int button=sc.nextInt();
    switch(button){
        case 1:
        System.out.println("The addition of the two numbers is: ");
        System.out.println(a+b);
        break;
        case 2:
        System.out.println("The substraction of the two numbers is: ");
        if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
        break;
        case 3:
        System.out.println("The multiplication of the two numbers is: ");
        System.out.println(a*b);
        break;
        case 4:
        float d =a/b;
        System.out.println("The division of the two numbers is: ");
        System.out.println( d);
        break;
    }
}
}
