mod dcode {

    fn chicken() {
        println!("Chicken!");
    }

    pub fn print_message() {
        println!("How's it going!");
        chicken();
    }

    pub mod water {
        pub fn print_message() {
            println!("I'm water!");
        }
    }
}

fn main() {
    dcode::print_message();
    dcode::water::print_message();
}
