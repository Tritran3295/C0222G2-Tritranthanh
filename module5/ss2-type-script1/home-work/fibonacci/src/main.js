function fibonnacci(n) {
    if (n <= 1) {
        return n;
    }
    return fibonnacci(n - 1) + fibonnacci(n - 2);
}
var m = 10;
var sum = 0;
for (var i = 0; i < m; i++) {
    sum += fibonnacci(i);
    console.log("s\u1ED1 fibo th\u1EE9  " + i + " l\u00E0  " + fibonnacci(i));
}
console.log("t\u1ED5ng c\u00E1c s\u1ED1 fibo l\u00E0 : " + sum);
