import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını (N) giriniz : ");
        int n = input.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman : ");
            dizi[i] = input.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[i]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = temp;
                }
            }
        }
        System.out.println("Sıralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i]+ " ");
        }
    }
}
