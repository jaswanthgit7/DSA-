class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer>  st1= new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*')
                st.push(i);
            else if (s.charAt(i) == '(')
                st1.push(i);
            else {
                if (!st1.isEmpty())
                 st1.pop();
                else if (!st.isEmpty())
                    st.pop();
                else
                    return false;
            }
        }
        while (!st1.isEmpty()) {
            if (st.isEmpty())
                return false;
            else if (st1.peek() < st.peek()) {
                st1.pop();
                st.pop();
            } else
                return false;
        }
        return true;
    }
}