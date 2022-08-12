function fibonnacci(n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    else {
        return fibonnacci(n - 2) + fibonnacci(n - 1);
    }
}
function display() {
    let m = 10;
    let sum = 0;
    for (let i = 0; i < m; i++) {
        console.log("Số thứ " + (i + 1) + " là: " + fibonnacci(i));
        sum += fibonnacci(i);
    }
    console.log(`tổng số fibo là ` + sum);
}
console.log(display());
//# sourceMappingURL=main.js.map