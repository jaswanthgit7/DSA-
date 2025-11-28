class Solution {
    public long sumAndMultiply(int n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '0') sb.append(c);
        }

        if (sb.length() == 0) return 0L;

        long x = Long.parseLong(sb.toString());

        long digitSum = 0;
        long temp = x;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        return x * digitSum;
    }

        
    }
