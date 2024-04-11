
enum Direction {
    Up,
    Down,
    Left,
    Right
}

fn main() {
    let player_direction: Direction = Direction::Up;

    match player_direction {
        Direction::Up => println!("We are heading up!"),
        Direction::Down => println!("We are heading down!"),
        Direction::Left => println!("We are heading left!"),
        Direction::Right => println!("We are heading right!"),
    }

}
