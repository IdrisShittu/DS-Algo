class Solution {
    public boolean checkIfPangram(String sentence) {
        int mask = 0;
        for (char ch : sentence.toCharArray()) {
            int charCode = ch - 'a';
            mask |= (1 << charCode);
        }
        return mask == (1 << 26) - 1;
    }
}