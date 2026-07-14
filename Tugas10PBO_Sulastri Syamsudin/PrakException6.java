public class PrakException6 {
    // Method demo yang sengaja melempar error
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        
        // Sengaja memicu error secara manual
        throw t; 
        
        // Baris di bawah ini tidak akan pernah dijalankan (unreachable code)
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo(); // Memanggil method yang melempar error
            System.out.println("Selesai"); // Baris ini akan dilewati
        }
        catch(NullPointerException e) {
            // Menangkap error yang dilempar dari method demo()
            System.out.println("Ada pesan error: " + e);
        }
    }
}