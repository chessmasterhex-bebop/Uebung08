public static boolean areOrthogonal(int[] arr1, int[] arr2) {

    int[] multiplied = elementwiseMultiply(arr1, arr2);

    int sum = 0;

    // Skalarprodukt: Summe der Produkte
    for (int i = 0; i < multiplied.length; i++) {
        sum += multiplied[i];
    }

    return sum == 0;
}
