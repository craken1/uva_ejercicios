
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a, n, b, c, s = 0, pos = 0;

        a = sc.nextInt();
        for (int j = 0; j < a; j++) {

            b = sc.nextInt();
            c = sc.nextInt();
            int v[] = new int[b];
            for (int i = 0; i < v.length; i++) {
                v[i] = sc.nextInt();
            }
            Arrays.sort(v);
            for (int i = 0; i < v.length; i++) {
               
                s += v[i];
                if (s > c) {
                    pos = i;
                    break;
                }
            }
            if (pos==0) {
                pos=v.length;
            }
            System.out.println(pos);
            s = 0;
            pos = 0;
        }
    }
}
