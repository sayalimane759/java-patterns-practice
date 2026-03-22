import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
