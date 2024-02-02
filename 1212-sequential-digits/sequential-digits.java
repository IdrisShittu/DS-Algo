class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for (int start = 1; start <= 9; start++) {
            int num = start;
            int nextDigit = start;
            while (num <= high && nextDigit < 10) {
                if (num >= low) {
                    result.add(num);
                }
                nextDigit++;
                num = num * 10 + nextDigit; // Append the next sequential digit
            }
        }
        result.sort(Integer::compareTo); // Sort the result list
        return result;
    }

}