public class Bradutul {
    public static void main(String[] args) {
        int numarRanduri = 6;
        for (int i = 0; i < numarRanduri; i++) {
            for (int j = numarRanduri - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int d =0;d<1;d++){
            System.out.println("     * ");
    }
    }
}
