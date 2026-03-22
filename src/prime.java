import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            System.out.println("Not Prime");
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime==false){
                    System.out.println(num+" Not Prime");
        }else{
            System.out.println(num+" Is Prime");
        }
        sc.close();
    }
}
