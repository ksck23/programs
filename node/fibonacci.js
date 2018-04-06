/*
 * Exponential fibonacci
 */
var fibonacciExp = function (n) {
    if (n === 0) return 0;
    else if (n === 1) return 1;
    else return fibonacci(n-2) + fibonacci(n-1);
};


/*
 * Polynomial fibonacci
 */
var fibonacciPoly = function (n) {
    var fib = [0, 1];
    for (var i = 2; i <= n; i++) {
        fib[i] = fib[i-2] + fib[i-1];
    }

    return fib[n];
};
