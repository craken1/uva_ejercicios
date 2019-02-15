
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a, b, pos = 0, k = 1;
        a = sc.nextInt();
        b = sc.nextInt();
        while (a != 0 && b != 0) {

            int va[] = new int[a];
            int vb[] = new int[b];
            for (int i = 0; i < va.length; i++) {
                va[i] = sc.nextInt();
            }
            for (int i = 0; i < vb.length; i++) {
                vb[i] = sc.nextInt();
            }
            Arrays.sort(va);

            System.out.println("CASE# " + k + ":");
            for (int i = 0; i < vb.length; i++) {
                pos = Arrays.binarySearch(va, vb[i]);
                pos = pos++;

                if (pos <= 0) {
                    System.out.println(vb[i] + " not found");
                } else {
                    System.out.println((vb[i] + " found at " + pos));
                }
                pos = 0;

            }
            a = sc.nextInt();
            b = sc.nextInt();
            k++;
        }
    }
}
