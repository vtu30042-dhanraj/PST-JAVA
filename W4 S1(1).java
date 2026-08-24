class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int balance = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                if (i < mid) {
                    balance++;
                } else {
                    balance--;
                }
            }
        }

        return balance == 0;
    }
}
