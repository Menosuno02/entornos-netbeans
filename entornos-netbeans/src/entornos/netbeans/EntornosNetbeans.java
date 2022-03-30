package entornos.netbeans;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author administrador
 */
public class EntornosNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[10];
        int numIntroducido;
        boolean introducido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println("Introduce número");
            num[i] = sc.nextInt();
            do {
                introducido = false;
                System.out.println("Introduce número " + (i + 1));
                numIntroducido = sc.nextInt();
                for (int j = 0; j <= i - 1; j++) {
                    if (numIntroducido == num[j]) {
                        introducido = true;
                    }
                }
            } while (introducido);
            num[i] = numIntroducido;
        }
        Arrays.sort(num);
    }
}
