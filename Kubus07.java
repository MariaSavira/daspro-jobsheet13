
import java.util.Scanner;

public class Kubus07 {
    static int s, lp, v;
    static Scanner input = new Scanner(System.in);

    static int LuasPermukaan(int s){
        lp = 6*s*s;   
        return lp;
    }

    static int Volume(int s){
        v = s*s*s;   
        return v;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan sisi : ");
        s = input.nextInt();

        lp = LuasPermukaan(s);
        v = Volume(s);

        System.out.println("Volume Kubus         : " + v);
        System.out.println("Luas Permukaan Kubus : " + lp);
    }
}
