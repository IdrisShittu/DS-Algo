#include <iostream>
#include <vector>
#include <unordered_set>

class Solution {
public:
    long matrixSumQueries(int n, std::vector<std::vector<int>>& queries) {
        long totalSum = 0, updatedRowCount = 0, updatedColCount = 0;
        std::unordered_set<int> updatedRows, updatedCols;

        for (int idx = queries.size() - 1; idx >= 0; idx--) {
            auto query = queries[idx];
            int operationType = query[0];
            int index = query[1];
            int value = query[2];

            if (operationType == 0 && updatedRows.find(index) == updatedRows.end()) {
                updatedRows.insert(index);
                updatedRowCount++;
                totalSum += static_cast<long>(value) * (n - updatedColCount);
            } else if (operationType == 1 && updatedCols.find(index) == updatedCols.end()) {
                updatedCols.insert(index);
                updatedColCount++;
                totalSum += static_cast<long>(value) * (n - updatedRowCount);
            }
        }

        return totalSum;
    }
};