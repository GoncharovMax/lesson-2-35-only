public class Task2 {
    public static void main(String[] args) {
        int a = 189345;
        int max = 0;
        int min = 9;
        while (a>0){
            int b = a % 10;
            if(b>max){
                max = b;
            }
            if(b<min){
                min = b;
            }
            a = a / 10;
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
