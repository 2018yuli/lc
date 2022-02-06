use std::env;

fn main() {
    let args: Vec<String> = env::args().collect();

    // 项目根目录执行 cargo run arg1 arg2
    for argument in args.iter() {
        println!("{}", argument);
    }
}
