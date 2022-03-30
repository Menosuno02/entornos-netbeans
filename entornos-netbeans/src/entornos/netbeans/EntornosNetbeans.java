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
        int numIntroducido, sizeArray, numTotal = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce tamaño array (max 10)");
            sizeArray = sc.nextInt();
        } while (sizeArray < 1 || sizeArray > 10);
        int[] num = new int[sizeArray];
        for (int i = 0; i <= num.length - 1; i++) {
            do {
                System.out.println("Introduce número " + (i + 1));
                numIntroducido = sc.nextInt();
            } while (inArray(numIntroducido, num, numTotal));
            num[i] = numIntroducido;
            numTotal++;
        }
        Arrays.sort(num);
    }

    public static boolean inArray(int num, int[] arr, int total) {
        if (total == 0) {
            return false;
        }
        for (int i = 0; i <= total - 1; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
