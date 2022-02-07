use std::io;

fn main() {
    let mut input = String::new();

    println!("Hey mate! Say something:");

    match io::stdin().read_line(&mut input) {
        Ok(_) => println!("Success! you said: {}", input),
        Err(e) => println!("Oops! Something went wrong: {}", e)
    }
}
