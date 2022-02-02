fn main() {
    print_numbers_to(10);
    
}

fn print_numbers_to(num: u32) {
    for i in 1..num {
        if is_even(i) {
            println!("{} is even", i);
        }
        else {
            println!("{} is odd", i);
        }
    }
}

fn is_even(num: u32) -> bool {
    return num % 2 == 0;
}
