public class MinCostCalculate {
    public static void main(String[] args) {

        int result = minMaliyetHesapla(13);
        System.out.println(result);
    }

    public static int minMaliyetHesapla(int n)
    {
        int[] d = new int[n + 1];
        d[0] = 0;

        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            if (i >= 1) min = Math.min(min, d[i - 1] + 5);
            if (i >= 12) min = Math.min(min, d[i - 12] + 50);
            if (i >= 50) min = Math.min(min, d[i - 25] + 100);

            d[i] = min;
        }
        return d[n];
    }
}
