package p1;

public class P1_main {

    public static int getNumber(int a) {
        return (a > 42) ? 42 : 0;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(50)); // 42
        System.out.println(getNumber(10)); // 0
    }
}
