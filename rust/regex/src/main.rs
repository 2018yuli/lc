extern crate regex;
use regex::Regex;

fn main() {
    
    // let re = Regex::new("\\d");
    let re = Regex::new(r"\w{5}").unwrap();
    let text = "dcode";
    println!("Found match? {}", re.is_match(text));

    let re2 = Regex::new(r"(\w{5})").unwrap();
    let text = "dcode";

    match re2.captures(text) {
        // Some(caps) => println!("Found match: {}", caps.get(0).unwrap().as_str()),
        Some(caps) => println!("Found match: {}", &caps[0]),
        None => println!("Not match!")
    }

}
