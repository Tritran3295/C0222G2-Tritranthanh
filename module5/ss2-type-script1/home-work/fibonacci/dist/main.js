function fibonnacci(n) {
    if (n <= 1) {
        return n;
    }
    return fibonnacci(n - 1) + fibonnacci(n - 2);
}
let m = 10;
let sum = 0;
for (let i = 0; i < m; i++) {
    sum += fibonnacci(i);
    console.log(`số fibo thứ  ` + i + ` là  ` + fibonnacci(i));
}
console.log(`tổng` + sum);
//# sourceMappingURL=main.js.map