struct Person {
    name: String,
    age: u8
}

// impl Person {
//     fn to_string(&self) -> String {
//         return format!("My name is {} and my age is {}", self.name, self.age);
//     }
// }

// 一个Trait描述了一种抽象接口
/*
Trait只能由三部分组成
functions（方法）
types（类型）
constants（常量）
*/
// trait ToString 是一个系统库提供的 trait
impl ToString for Person {
    fn to_string(&self) -> String {
        return format!("My name is {} and my age is {}", self.name, self.age);
    }
}

fn main() {
    let dom = Person { name: String::from("Domenic"), age: 21};

    println!("{}", dom.to_string()); // My name is Domenic and my age is 21.
}
