class Solution {
    public String convert(String s, int numRows) {
 

        if (numRows == 1 || s.length() <= numRows)
            return s;

        int cycle = 2 * (numRows - 1);
        String result = "";

        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycle) {

                // vertical character
                result = result + s.charAt(j);

                // diagonal character (not for first & last row)
                int diag = j + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 && diag < s.length()) {
                    result = result + s.charAt(diag);
                }
            }
        }

        return result;

    }
}

