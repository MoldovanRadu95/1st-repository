public class DoWhile {
    public static void main(String[] args) {
        int numarRanduri = 5;
        int contorRandCurent = 1;
        int contorStelute;

        while(contorRandCurent<=numarRanduri){
            contorStelute = 1;
            while (contorStelute<=contorRandCurent * 2 - 1){
                System.out.println("*");
                contorStelute ++;
            }
            System.out.println();
            contorRandCurent++;
        }
    }
}

