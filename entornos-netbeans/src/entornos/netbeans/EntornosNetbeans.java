package entornos.netbeans;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Menosuno02 (Alejandro López)
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
        } while (!valSizeArray(sizeArray));
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

    /**
     * Checks if a certain number already exists in an array
     *
     * @param num requested number to introduce
     * @param arr array of numbers
     * @param total numbers introduced
     * @return true if the number already exists the array, false if not
     */
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

    /**
     * Checks if the value introduced for the size of the array is valid
     *
     * @param sizeArray wanted size for the array
     * @return true if the size is valid, false if not
     */
    public static boolean valSizeArray(int sizeArray) {
        return (sizeArray >= 1 && sizeArray <= 10);
    }
}
