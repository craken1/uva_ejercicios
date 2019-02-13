
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, a, b;
        int v[] = new int[2];
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        for (int i = v[0]; i <= v[1]; i++) {
            if (i % 13 != 0) {
                c += i;
            }
        }
        System.out.println(c);
    }

}
