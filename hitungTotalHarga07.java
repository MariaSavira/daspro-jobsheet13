
import java.util.Scanner;

public class hitungTotalHarga07 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("\nSelamat, Anda mendapatkan diskon 50% untuk setiap pembelian!");
            hargaTotal = (hargaItem[pilihanMenu - 1] - (hargaItem[pilihanMenu - 1] * 50 / 100)) * banyakItem ;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("\nSelamat, Anda mendapatkan diskon 30% untuk setiap pembelian!");
            hargaTotal = (hargaItem[pilihanMenu - 1] - (hargaItem[pilihanMenu - 1] * 30 / 100)) * banyakItem ;
        } else {
            System.out.println("\nKode Invalid, tidak ada pengurangan harga.");
            hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem ;
        }
        
        return hargaTotal;
    }
    
    public static void Menu(String namaPelanggan) {
        System.out.println("Selamat datang, " + namaPelanggan + "!\n");

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo Anda : ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        
        System.out.println("Total harga untuk pesanan Anda : Rp" + totalHarga);
    }
}
