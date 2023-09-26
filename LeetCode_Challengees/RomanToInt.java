class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
               num = 1;
            }
            if(s.charAt(i) == 'V') {
                num = 5;
            }
            if(s.charAt(i) == 'X') {
                num = 10;
            }
            if(s.charAt(i) == 'L') {
              num = 50;
            }
            if(s.charAt(i) == 'C') {
               num = 100;
            }
            if(s.charAt(i) == 'D') {
                num = 500;
            }
            if(s.charAt(i) == 'M') {
              num = 1000;
            }
            
            if(i + 1 < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                answer -= num;
            } else {
                answer += num;
            }
        }
        
        return answer;
    }
    
    private int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
