public class Task1 {
    public static void main(String[] args) {
    int n = 123456789;
    do {
        System.out.println(n % 10);
        n = n / 10;
        }while (n / 10 != 0);
    System.out.println(n);
    }
}

