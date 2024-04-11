use std::process::Command;

fn main() {
    // python decode.py
    let mut cmd = Command::new("python");
    cmd.arg("decode.py");

    // Execute the command
    match cmd.output() {
        Ok(o) => {
            unsafe {
                println!("Output: {}", String::from_utf8_unchecked(o.stdout));
            }
        },
        Err(e) => {
            println!("There was an error! {}", e);
        }
    }
}