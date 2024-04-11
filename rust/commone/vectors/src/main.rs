fn main() {
    let mut my_vector: Vec<i32> = Vec::new();
    my_vector.push(49);
    
    for number in my_vector.iter() {
        println!("{}", number);
    }

    let mut my_vector2 = vec![1, 2, 3, 4];

    my_vector2.push(33);
    my_vector2.remove(1);

    for number in my_vector2.iter() {
        println!("{}", number);
    }

}
