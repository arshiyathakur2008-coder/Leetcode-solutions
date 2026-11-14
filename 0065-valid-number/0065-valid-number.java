
class Solution {
    public boolean isNumber(String s) {

        boolean digit = false;
        boolean decimal = false;
        boolean exponent = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Check digit
            if (ch >= '0' && ch <= '9') {
                digit = true;
            }

            // Check decimal point
            else if (ch == '.') {

                if (decimal || exponent) {
                    return false;
                }

                decimal = true;
            }

            // Check exponent
            else if (ch == 'e' || ch == 'E') {

                if (exponent || !digit) {
                    return false;
                }

                exponent = true;
                digit = false;
            }

            // Check plus or minus sign
            else if (ch == '+' || ch == '-') {

                if (i != 0 && s.charAt(i - 1) != 'e'
                        && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Invalid character
            else {
                return false;
            }
        }

        return digit;
    }
}
