fn main() {
    // 1~10
    for i in 1..11 {
        println!("The number is {}", i);
    }

    let numbers = 30..51;
    for i in numbers {
        println!("The number is {}", i);
    }

    let animals = vec!["Rabbit", "Dog", "Cat"];

    for a in animals.iter() {
        println!("The animal name is {}", a);
    }

    for (index, a) in animals.iter().enumerate() {
        println!("{} : The animal name is {}", index, a);
    }
}
