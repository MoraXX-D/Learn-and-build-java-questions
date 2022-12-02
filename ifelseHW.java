import java.util.Scanner;

public class ifelseHW {
    public static void main(String [] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
        
    }
}
