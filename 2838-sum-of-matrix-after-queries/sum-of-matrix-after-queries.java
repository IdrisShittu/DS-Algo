class Solution {
    public long matrixSumQueries(int n, int[][] q) {
        long totalSum = 0, rowCount = 0, colCount = 0;
        HashSet<Integer> updatedRows = new HashSet<>();
        HashSet<Integer> updatedCols = new HashSet<>();

        for (int indx = q.length - 1; indx >= 0; indx--) {
            var query = q[indx];
            int operationType = query[0];
            int index = query[1];
            int value = query[2];

            if (operationType == 0 && !updatedRows.contains(index)) {
                updatedRows.add(index);
                rowCount++;
                totalSum += (value * (n - colCount));
            } else if (operationType == 1 && !updatedCols.contains(index)) {
                updatedCols.add(index);
                colCount++;
                totalSum += (value * (n - rowCount));
            }
        }

        return totalSum;
    }
}
