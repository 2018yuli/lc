fn main() {
    let mut x = 10;
    // 可能是设计时出于安全考虑不想让程序员使用很多不同类型的变量名，
    // 造成程序的混乱和复杂，
    // 它允许你在语法上声明使用新变量的同时把原来的变量给干掉。
    // 
    // 不对，上述使用情况很少，shadowing 主要是结合 Code-Block 使用实现备忘录模式
    let mut y = 10;
    
    {
        x = 15;
        // This binding *shadows* the outer one (重定义(遮蔽)一个变量)
        // 不可以作用于 static 变量
        // 不可以作用于 const 常量
        let y = 15;
        // y = 15
        println!("y is {}", y);
    }

    // y = 10
    println!("x is {}, y is back to {}", x, y);

    // This binding also *shadows* the previous binding
    let y = "y is now a String";
    println!("y is {}", y);
    let y = true;
    println!("y is {}", y);

}
