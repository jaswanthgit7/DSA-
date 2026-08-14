class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length() ; 
        int ans = 0 ; 
        for(int i=0  ;i<n; i++){
            Map<Character , Integer> map = new HashMap<>() ; 
        for(int j=i  ; j<n ; j++){
            char ch = s.charAt(j) ; 
        map.put(ch , map.getOrDefault(ch , 0) +1) ; 
       if(map.get(ch) <= 2)  
        ans = Math.max(ans , j-i+1) ;
       else
        break ; 
        }  
       }
        return ans; 
    }
}