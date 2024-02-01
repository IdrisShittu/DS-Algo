/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let product=1,sum=0;
    for(let digit of digits(n)){
        product*=digit;
        sum+=digit;
    }
    return product-sum;
    
};

function* digits(n){
    while(n>0){
        yield n%10;
        n=Math.floor(n/=10);
    }
}