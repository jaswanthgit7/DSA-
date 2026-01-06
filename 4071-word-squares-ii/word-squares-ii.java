class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i< words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < words.length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    for (int l = 0; l < words.length; l++) {
                        if (i == l || j == l || k == l) {
                            continue;
                        }
                        String top = words[i];
                        String left = words[j];
                        String right = words[k];
                        String bottom = words[l];
                        if (top.charAt(0) == left.charAt(0) && 
                            top.charAt(3) == right.charAt(0) && 
                            bottom.charAt(0) == left.charAt(3) &&
                            bottom.charAt(3) == right.charAt(3)) {
                                result.add(Arrays.asList(top, left, right, bottom));
                            }
                    }
                }
            }
        }   
        result.sort((a, b) -> a.toString().compareTo(b.toString()));
        return result;
    }
}