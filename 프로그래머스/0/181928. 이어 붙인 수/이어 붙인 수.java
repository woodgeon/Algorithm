class Solution {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even.append(num_list[i]);
            }
            else {
                odd.append(num_list[i]);
            }
        }
        int evenSum = even.length() > 0 ? Integer.parseInt(even.toString()) : 0;
        int oddSum = odd.length() > 0 ? Integer.parseInt(odd.toString()) : 0;
        
        return evenSum + oddSum;
    }
}