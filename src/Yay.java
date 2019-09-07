public class Yay {
    public static void main(String[] args) {
        byte[] num = {12, 3, 7};
        printByteArray(num);
        printByteArray(new byte[]{1, 4, 7});

    }

    private static void printByteArray(byte[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}