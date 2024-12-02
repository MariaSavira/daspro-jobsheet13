import java.util.Scanner;

public class hitungTotalHarga07ModifikasiNomor2 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = (hargaItem[pilihanMenu - 1] - (hargaItem[pilihanMenu - 1] * 50 / 100)) * banyakItem;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = (hargaItem[pilihanMenu - 1] - (hargaItem[pilihanMenu - 1] * 30 / 100)) * banyakItem;
        } else {
            hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        }

        return hargaTotal;
    }

    public static void tampilkanMenu(String namaPelanggan) {
        System.out.println("Selamat datang, " + namaPelanggan + "!\n");
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        tampilkanMenu("Andi");

        int totalKeseluruhan = 0;
        System.out.print("Masukkan kode promo Anda: ");
        String kodePromo = sc.nextLine();

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (atau 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            if (pilihanMenu >= 1 && pilihanMenu <= 6) {
                int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
                totalKeseluruhan += totalHarga;

                System.out.println("Harga untuk pesanan ini: Rp" + totalHarga);
            } else {
                System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }

        System.out.println("\nTotal keseluruhan harga untuk pesanan Anda: Rp" + totalKeseluruhan);
        sc.close();
    }
}