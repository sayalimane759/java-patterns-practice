import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Enter marks : ");
            int marks = sc.nextInt();
        
        if(marks>=90){
            System.out.println("This is Good");
        }else if(marks<=89 && marks>=60){
            System.out.println("This is also Good");
        }else if (marks<=59 && marks>=0){
            System.out.println("This is Good as well");
        }
        System.out.println("Enter 1 to enter marks and 0 to stop");
        choice = sc.nextInt();
        }while(choice==1);
        
        sc.close();
    }
}
