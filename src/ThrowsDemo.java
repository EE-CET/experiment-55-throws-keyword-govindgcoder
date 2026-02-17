import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    
    // Define static method check(int n) that throws IOException
    // If n < 0, throw new IOException()
    // Else, print n
    public static void check(int n) throws IOException{
        if(n<0) throw new IOException();
        else System.out.print(n);
    }
    
    public static void main(String[] args){
        // Read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            check(n);
        } catch (IOException e) {
            System.out.print("Caught: IO Exception");
        }
    }
}
