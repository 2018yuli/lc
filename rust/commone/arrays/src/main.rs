fn main() {
    let numbers = [1, 2, 3, 4, 5];
    let numbers2: [i32; 5] = [6, 7, 8, 9, 10];
    let numbers3 = [11; 5];

    for n in numbers.iter() {
        println!("{}", n);
    }
    for i in 0..numbers2.len() {
        println!("{}", numbers2[i]);
    }
    for i in 0..numbers3.len() {
        println!("{}", numbers3[i]);
    }
}
