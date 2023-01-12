import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, r, totalN = 1, totalR = 1, totalK = 1;

        System.out.println("N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.");
        System.out.print("n değeri : ");
        n = scanner.nextInt();

        System.out.print("r değeri : ");
        r = scanner.nextInt();

        for (int i = 1;i <= n; i++){
            totalN *= i;
        }

        for (int j = 1;j <= r; j++){
            totalR *= j;
        }

        for (int k = 1; k <= (n-r); k++){
            totalK *= k;
        }

        System.out.println("Kombinasyon sonucu : " + (totalN / (totalR*totalK)));

    }
}
