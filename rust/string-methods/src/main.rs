fn main() {
    {
        let my_string = String::from("Rust is fantastic!");
        println!("After replace: {}", my_string.replace("fantastic", "great"));
    }

    {
        let my_string = String::from("the weather is \nnice \noutside mate!");
        for line in my_string.lines() {
            println!("{}", line);
        }
    }

    {
        let my_string = String::from("Leave+a+like+you+enjoyed!");
        let tokens: Vec<&str> = my_string.split("+").collect();

        println!("At index 2:{}", tokens[2]);
    }

    {
        let my_string = String::from(" My name is Domenic \n\r");

        println!("Before trim: {}", my_string);
        println!("After trim: {}", my_string.trim());
    }

    {
        let my_string = String::from("decode on YouTube");

        match my_string.chars().nth(4) {
            Some(c) => println!("Charactor at index 4: {}", c),
            None => println!("No charactor at index 4.")
        }

    }
}
