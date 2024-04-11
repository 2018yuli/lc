use std::collections::HashMap;

fn main() {
    let mut marks = HashMap::new();

    marks.insert("Rust Programming", 96);
    marks.insert("Web Development", 96);
    marks.insert("UX Design", 75);
    marks.insert("Rust Programming", 86);

    // find length of hashMap
    println!("How many subjects have you studied? {}", marks.len());
    
    match marks.get("Web Development") {
        Some(mark) => println!("You got {} for Web Dev!", mark),
        None => println!("You don't study Web Development!")
    }

    marks.remove("UX Design");

    for (subject, mark) in &marks {
        println!("For {} you got {}%!", subject, mark);
    }

    println!("Did you study C++? {}", marks.contains_key("C++"));
}
