class Solution {
    public int solution(String binomial) {
        String[] array = binomial.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        String  op = array[1];
        
        switch(op) {
            case "+" :
                return  a + b;
            case "-" :
                return  a - b;
            case "*" :
                return  a * b;
            default:
                return  a + b;
        }
    }
}