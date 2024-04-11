extern crate rand;
use rand::Rng;

fn main() {
    // [1, 10]
    let random_number = rand::thread_rng().gen_range(1..11);
    println!("Random number: {}", random_number);

    // Flip a coin
    let random_bool = rand::thread_rng().gen_bool(1.0 / 3.0);
    println!("Random Boolean: {}", random_bool);
}
