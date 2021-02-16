package ClassPractice;

public class NumberArrangement {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 4; i++) {


            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            for (int l = 1; l <= k + i; l++) {
                System.out.print(i);

            }
            k++;
            System.out.println();

        }
    }
}
