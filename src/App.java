import java.util.Scanner;
public class App{
    public static void main(String [] args){
        System.out.println("=====Calculator=====");
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Select the operation to Perform : ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter number 1 : ");
        int Num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int Num2 = sc.nextInt();
        
        
        switch (choice) {
            case 1:
                System.out.println("Addition result : "+(Num1+Num2));
                break;
            case 2:
                System.out.println("Substraction result : "+(Num1-Num2));
                break;
            case 3:
                System.out.println("Multiplication result : "+(Num1*Num2));
                break;
            case 4:
                System.out.println("Division result : "+(Num1%Num2));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        sc.close();
    }
}