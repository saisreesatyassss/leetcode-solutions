// Last updated: 10/22/2025, 2:57:07 PM
class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder res = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        String cleaned = res.toString().replace("-", "");
        try {
            int number = Integer.parseInt(cleaned);
            return x < 0 ? -number : number;
        } catch (NumberFormatException e) {
            // Overflow case
            return 0;
        }
    }
}
