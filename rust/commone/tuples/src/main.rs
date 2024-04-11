fn main() {
    let tup1:(i32, i8, i32, i64, &str, (i32,i32,i32)) = (20, 25, 30, 35, "Rust", (1, 3 ,5));
    let (a, b, c, d,e, f) = tup1;

    println!("{},{}", tup1.2, (tup1.5).1);
    println!("a={} b={} c={} d={} e={} f.1={}", a, b, c, d, e, f.1);
}
