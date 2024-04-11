fn main() {
    let number = 21;

    match number {
        1 => println!("It is one!"),
        2 => println!("It is two!"),
        10 | 11 => println!("It is either 10 or 11!"),
        12..=20 => println!("It is [12, 20]!"),
        _ => println!("It doesn't match!")
    }

    let name = "Domenic";

    match name {
        "Chris" => println!("Nick Name, mate!"),
        "Domenic" => println!("Yeah!"),
        _ => println!("Don't know your name")
    }
}
