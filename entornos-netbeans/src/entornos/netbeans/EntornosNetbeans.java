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
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println("Introduce número");
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
    }
}
