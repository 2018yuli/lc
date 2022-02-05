fn main() {
    let mut my_string = String::from("How is going, my name is vip.");

    println!("Length: {}", my_string.len());
    println!("String is empty? {}", my_string.is_empty());

    for token in my_string.split_whitespace() {
        println!("{}", token);
    }

    println!("Dose the string contains vip ? {}", my_string.contains("vip"));

    my_string.push_str(" Welcome to your tutorial on Strings!");

    println!("{}", my_string);
}
