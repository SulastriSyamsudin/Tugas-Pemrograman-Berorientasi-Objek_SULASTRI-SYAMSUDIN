public class PrakException7 {
    public static void main(String[] args) {
        try {
            // Melempar exception kustom dengan pesan khusus
            throw new java.lang.Exception("Here's my Exception");
        } 
        catch (java.lang.Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace(): ");
            e.printStackTrace();
        }
    }
}