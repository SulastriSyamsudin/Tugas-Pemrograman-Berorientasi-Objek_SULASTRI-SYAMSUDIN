import java.io.*;

class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }
    
    public void methodB() throws IOException {
        // Memicu ArithmeticException
        System.out.println(20 / 0); 
        System.out.println("Method B");
    }
}

public class PrakException8 {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();
        
        try {
            o.methodB();
        } 
        catch (java.lang.Exception e) {
            System.out.println("Error di Method B");
        } 
        finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}