public class Soal1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        int sum = 0;
        int i = 0;

        //Menggunakan while loop untuk menjumlahkan elemen array
        while (i < ar.length) {
            sum += ar[i];
            i++;
        }

        //Menampilkan hasil penjumlahan
        System.out.println("Jumlah elemen array adalah: "+ sum);
    }

}
