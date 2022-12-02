import java.util.Scanner;

public class pattern {
    public void pattern1(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public void pattern2(int row,int col){
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
    public void pattern3(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public static void main(String[] args) {
        int row,col;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of row and column ");
        row=sc.nextInt();
        col=sc.nextInt();
        pattern obj=new pattern();
        obj.pattern1(row,col);
        obj.pattern2(row,col);
        obj.pattern3(row,col);
        sc.close();
    }
}
