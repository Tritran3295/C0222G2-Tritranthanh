function fibonnacci(n: number): number {
    if(n == 0){
        return 0;
    }
    if (n == 1){
        return 1;
    }
    return fibonnacci(n -1) + fibonnacci(n -2);
}

let m = 10;
let sum  = 0;
for (let i = 0;i < m;i++){
    sum += fibonnacci(i);
    console.log(`số fibo thứ  ` + i + ` là  ` + fibonnacci(i));
}
console.log(`tổng` + sum )
