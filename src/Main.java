import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int inpNum;

        System.out.print("Sayı giriniz: ");
        inpNum = input.nextInt();


        Integer minNear = null;
        Integer maxNear = null;

        for (int i : list) {
            if (i < inpNum) {
                if (minNear == null || inpNum - i < inpNum - minNear) {
                    minNear = i;
                }
            }
            if (i > inpNum) {
                if (maxNear == null || i - inpNum < maxNear - inpNum) {
                    maxNear = i;
                }
            }
        }

        if (minNear != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNear);
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        }

        if (maxNear != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNear);
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        }
    }
}
