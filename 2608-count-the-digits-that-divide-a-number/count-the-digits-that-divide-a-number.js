/**
 * @param {number} num
 * @return {number}
 */
var countDigits = function(num) {
    let count = 0;
    let digits = getDigit(num);
    let result = digits.next();
    while (!result.done) {
        if (num % result.value === 0) count++;
        result = digits.next();
    }
    return count;
};

function *getDigit(num) {
    while (num > 0) {
        yield num % 10;
        num = Math.floor(num / 10);
    }
}
