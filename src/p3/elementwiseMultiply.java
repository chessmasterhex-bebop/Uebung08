public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {

    // Unterschiedliche Längen → leeres Array
    if (arr1.length != arr2.length) {
        return new int[0];
    }

    int[] result = new int[arr1.length];

    // Jede Position multiplizieren
    for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i] * arr2[i];
    }

    return result;
}
