public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99) {
            return false;
        } else {
            String n1 = Integer.toString(number1);
            String n2 = Integer.toString(number2);

            for (int i = 0; i < n1.length(); i++) {
                for (int j = 0; j < n2.length(); j++) {
                    if (n1.charAt(i) == n2.charAt(j)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
