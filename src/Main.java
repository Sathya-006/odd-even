import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        Oddeven oddeven=new Oddeven();
        System.out.println(oddeven.func(a));
    }
}
class Oddeven{
    String func(int a){
        if (a%2==0){
            return ("The given number is Even");
        }
        else{
            return ("The given number is Odd");
        }
    }
}
