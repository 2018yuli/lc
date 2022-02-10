fn main() {
    // 1. 在 rust 中 let s = " hello "; s.trim(); 不会象其他有垃圾收集器的语言一样，重新申请一片内存空间
    //    &str 是 string 的指针
    //      在 rust 中，string 可以位于常量池，位于栈，位于堆

    // 在编译时能确定，string 位于常量池中
    let str = "hello";  // type &str
    // 在编译时不能确定，在堆中动态分配
    let i = 10;
    let str2 = i.to_string();   // type String
    // 2 String 与 &str 的区别
    //  如果需要动态分配堆内存，使用 String 类型
    //  如果需要复用一个已经存在的string，使用 &str 类型
    // 3 相互转化
    let foo = "hello";            // &str
    let bar = foo.to_string();  // String
    let car = &bar;            // &str


    println!("{}{}{}{}", str, str2, bar, car);
}
