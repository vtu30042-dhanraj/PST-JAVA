import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            int n = s.length();
            int[] frequency = new int[26];

            // Count characters from the first half
            for (int i = 0; i < n / 2; i++) {
                frequency[s.charAt(i) - 'a']++;
            }

            // Subtract characters from the second half
            int start = (n + 1) / 2; // skips middle character for odd length
            for (int i = start; i < n; i++) {
                frequency[s.charAt(i) - 'a']--;
            }

            boolean isLapindrome = true;
            for (int count : frequency) {
                if (count != 0) {
                    isLapindrome = false;
                    break;
                }
            }

            result.append(isLapindrome ? "YES" : "NO").append('\n');
        }

        System.out.print(result);
    }
}
