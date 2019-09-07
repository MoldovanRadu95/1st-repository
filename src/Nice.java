public class Nice {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 12;
        numbers[2] = 14;
        numbers[3] = 16;
        numbers[4] = 18;
        numbers[5] = 20;
        numbers[6] = 22;
        numbers[7] = 24;
        numbers[8] = 26;
        numbers[9] = 28;


//        System.out.println(numbers[0] + numbers[1]);
//        System.out.println(numbers[2] + numbers[3]);
//        System.out.println(numbers[4] + numbers[5]);
//        System.out.println(numbers[6] + numbers[7]);
//        System.out.println(numbers[8] + numbers[9]);


        for (int i = 0; i < numbers.length/2; i=i+1) {
            System.out.println(numbers[i] + numbers[numbers.length-i-1]);
        }
    }
}

