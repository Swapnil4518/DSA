
class Solution {

    public String countAndSay(int n) {

        String str = "1";

        for (int i = 1; i < n; i++) {

            String result = "";
            int count = 1;

            for (int j = 0; j < str.length(); j++) {

                if (j + 1 < str.length()
                        && str.charAt(j) == str.charAt(j + 1)) {
                    count++;
                } else {
                    result = result + count + str.charAt(j);
                    count = 1;
                }
            }

            str = result;
        }

        return str;
    }
}
