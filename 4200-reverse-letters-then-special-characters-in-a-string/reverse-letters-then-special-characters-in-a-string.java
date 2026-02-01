class Solution {
    public String reverseByType(String s) {
        int n = s.length();
        ArrayList<Character> li1= new ArrayList<>();
        ArrayList<Character>  li2 = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                li1.add(c);
            else
                li2.add(c);
        }

        StringBuilder sb = new StringBuilder();
        int l = li1.size() - 1, m = li2.size() - 1;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                sb.append(li1.get(l--));
            else
                sb.append(li2.get(m--));
        }

        return sb.toString();
    }
}