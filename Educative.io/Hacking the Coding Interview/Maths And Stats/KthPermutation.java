class KthPermutation {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void findKthPermutation(List<Character> v, int k, StringBuilder result) {

        if (v.isEmpty()) {
            return;
        }

        int n = v.size();
        int count = factorial(n - 1);
        int selected = (k - 1)/count;
        result.append(v.get(selected));
        v.remove(selected);
        k = k - (count * selected);
        findKthPermutation(v, k, result);
    }

    private static String getPermutations(int n, int k) {
        List<Character> v = new ArrayList<Character>();
        char c = '1';
        for (int i=1; i<=n; i++) {
            v.add(c);
            c++;
        }

        StringBuilder result = new StringBuilder();
        findKthPermutation(v, k, result);
        return result.toString();
    }
}