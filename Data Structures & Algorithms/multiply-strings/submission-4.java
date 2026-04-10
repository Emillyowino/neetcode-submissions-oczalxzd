class Solution {
    private long digit(String num) {
        long n = 0;
        for (int i = 0, j = (int) Math.pow(10, num.length() - 1); i < num.length(); i++, j /= 10) {
            char c = num.charAt(i);
            n += ((c - '0') * j);           
        }
        return n;
    }
    public String multiply(String num1, String num2) {
       if (num1.charAt(0) == 0 || num2.charAt(0) == 0) {
            return "" + 0;
       }
       long int1 = digit(num1);
       long int2 = digit(num2);
       long ans = int1 * int2;
       return "" + ans;
    }
}
