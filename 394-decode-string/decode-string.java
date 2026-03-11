class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int ans = 0;
        String curr = "";

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                ans = ans * 10 + ch - '0';
            }

            else if (ch == '[') {
                countStack.push(ans);
                stringStack.push(curr);
                ans = 0;
                curr = "";
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = temp.toString();
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}