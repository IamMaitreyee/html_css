public class simple {
    public static void main(String[] args) {

        for (int i = 2; i <= 4; i++) {
            System.out.println(i);

            for (int j = 1; j <= i;  j++) {
                System.out.print(i * (j + 1) + " ");
            }

            System.out.println();
        }
    }
}