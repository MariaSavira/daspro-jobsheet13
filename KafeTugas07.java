import java.util.Scanner;

public class KafeTugas07 {
    static int i, j, nama;
    static int jumlah[] = new int[5];
    static int rata[] = new int[5];
    static int menu[][] = new int[5][7];

    static int[][] inputMenu(){ // soal A Fungsi Input Menu
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < menu.length; i++) {
            for (j = 0; j < menu[i].length; j++) {
                System.out.print("Masukkan penjualan menu ke-" + (i+1) + " pada hari ke-" + (1+j) + " : ");
                menu[i][j] = scan.nextInt();
                jumlah[i] += menu[i][j];
            }
            System.out.println();
        }
        return menu;
    } 

    static void cetakMenu(){ // Soal B Fungsi Cetak Menu
        for (i = 0; i < menu.length; i++) {
            for (j = 0; j < menu[i].length; j++) {
                System.out.println("Menu " + (i+1) + " hari ke-" + (j+1) + " : " + menu[i][j]);
            }
            System.out.println();
        }  
    }

    static void penjualanTertinggi(){ // Soal C Fungsi Penjualan Tertinggi
        int tertinggi = 0;
        for (i = 0; i < menu.length; i++) {
            if (tertinggi < jumlah[i]){
                tertinggi = jumlah[i];
                nama = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi");
        System.out.println("Menu ke-" + (nama + 1) + " : " + tertinggi);
        return;
    }

    static int[] rataPenjualan(){ // Soal D Fungsi Rata2 tiap penjualan
        for (i = 0; i < jumlah.length; i++) {
            rata[i] = jumlah[i] / menu[i].length;
            System.out.println("Rata-rata menu ke-" + (i+1) + " : " + rata[i]);
        }
        return rata;
    } 

    public static void main(String[] args) {
        inputMenu();
        cetakMenu();
        penjualanTertinggi();
        rataPenjualan();
    }
}
