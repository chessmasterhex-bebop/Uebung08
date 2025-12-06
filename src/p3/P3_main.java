package p3;

public class P3_main {

    public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return new int[0];
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;
    }

    public static boolean areOrthogonal(int[] arr1, int[] arr2) {
        int[] multiplied = elementwiseMultiply(arr1, arr2);

        int sum = 0;
        for (int i = 0; i < multiplied.length; i++) {
            sum += multiplied[i];
        }

        return sum == 0;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {3, -1, 1};

        // test elementwiseMultiply
        int[] r = elementwiseMultiply(a, b);
        for (int x : r) System.out.print(x + " ");
        System.out.println();

        // test orthogonality
        System.out.println(areOrthogonal(a, b));
    }
}
