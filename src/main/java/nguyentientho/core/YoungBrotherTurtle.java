package nguyentientho.core;

public class YoungBrotherTurtle {
    public static void main(String[] args) {
        deQuyMethod(2);
    }

    private static void deQuyMethod(int n) {
        if (n == 0) {
            System.out.println("Bum Bum Bum");
        } else {
            System.out.println(n);
            deQuyMethod(n-1);
        }
    }
}
