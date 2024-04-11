struct Color {
    red: u8,
    green: u8,
    blue: u8
}

fn main() {
    let blue = Color{ red: 0, green: 0, blue: 255 };
    
    // 传递 blue 不能使用第二次，需要传递地址
    // print_color(blue);
    // print_color(blue); // value used here after move（blue has moved and no longer in the scope）
    
    // 传递引用
    print_color2(&blue);
    print_color2(&blue);
}

fn print_color(c: Color) {
    println!("Color - R:{} G:{} B:{}", c.red, c.green, c.blue);
}

fn print_color2(c: &Color) {
    println!("Color - R:{} G:{} B:{}", c.red, c.green, c.blue);
}