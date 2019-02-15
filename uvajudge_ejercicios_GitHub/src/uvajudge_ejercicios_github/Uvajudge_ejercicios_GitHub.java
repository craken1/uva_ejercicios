package uvajudge_ejercicios_github;

import java.util.Arrays;
import java.util.Scanner;

public class Uvajudge_ejercicios_GitHub {

    public static void main(String[] args) {
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
                pos = b(va, vb[i]);

            
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

    public static int b(int areglo[], int elemento) {
        int centro, primero, ultimo, valorcentro;
        primero = 0;
        ultimo = areglo.length - 1;
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorcentro = areglo[centro];
            if (elemento == valorcentro) {
                return centro;
            } else if (elemento < valorcentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }

        }
        return -1;
    }
}
