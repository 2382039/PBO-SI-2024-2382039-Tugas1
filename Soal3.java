import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata dalam format cameCase: ");
        String camelCaseString = input.nextLine();

        //Inisialisasi jumlah kata dengan 1, karena kata pertama selalu diawali dengan huruf kecil
        int wordCount = 1;

        //Inisialisasi indeks untuk iterasi string
        int i = 0;

        //Loop untuk mengecek setiap karakter dalam string
        while (i < camelCaseString.length()) {
            //Cek jika karakter saat ini adalah huruf kapital
            if (Character.isUpperCase(camelCaseString.charAt(i))) {
                //Jika huruf kapital, tambahkan 1 ke jumlah kata
                wordCount++;
            }
            //Pindah ke karakter berikiutnya
            i++;
        }

        //Cetak jumlah kata
        System.out.println("Jumlah kata dalam format camelCase: "  + wordCount);

        //Tutup scanner
        input.close();
    }

}
