class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aa = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int bb = (a*b)*2;            
        return  answer = Math.max(aa, bb);
    }
}