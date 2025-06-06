public class Task3 {
    public static void main(String[] args) {
        int number1 = 1223456789;
        while (number1 > 0) {
            int temp = number1 % 10;
            number1 = number1 / 10;
            int tempNumber = number1;
            while (tempNumber > 0) {
                int i = tempNumber % 10;
                if (i == temp) {
                    System.out.println("True");
                    return;
                }
                tempNumber = tempNumber / 10;
            }
        }
    }
}
