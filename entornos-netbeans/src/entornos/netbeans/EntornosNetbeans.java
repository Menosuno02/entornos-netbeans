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
        int numIntroducido, sizeArray;
        boolean introducido;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce tamaño array (max 10)");
            sizeArray = sc.nextInt();
        } while (!valSizeArray(sizeArray));
        int[] num = new int[sizeArray];
        for (int i = 0; i <= num.length - 1; i++) {
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

    public static boolean valSizeArray(int sizeArray) {
        return (sizeArray >= 1 && sizeArray <= 10);
    }
}
