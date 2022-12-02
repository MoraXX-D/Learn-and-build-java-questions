 
public class recursion {
    int count=0;
    public int p(){
        count++;
        if(count<=5){
            System.out.println(count);
            p();
        }
        return 0;
    }
    public static void main(String[] args) {
        recursion obj=new recursion();
        obj.p();
    }
}
