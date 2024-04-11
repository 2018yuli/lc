fn main() {
    let x = 10;
    let mut z = 20;
    println!("x : {}, z : {}", x, z);

    {
        // isolated
        let y = 5;
        z = 25;

        println!("x : {}, y : {}, z : {}", x, y, z);
    }

    println!("x : {}, z : {}", x, z);
}
