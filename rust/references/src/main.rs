fn main() {
    // just another way refer to a variable, beside shadowing
    let mut x = 1000000;
    // x 's references
    // let xr = &x;
    /*
    let xxr = &mut x;

    *xxr += 1;

    // println!("x is {}, xxr is {}", xr, xxr);
    println!("xxr is {}", xxr);
    */
    
    

    // cannot borrow `x` as mutable more than once at a time
    // second mutable borrow occurs here
    // let xr = &mut x;

    //  cannot borrow `x` as immutable because it is also borrowed as mutable
    // let xxr = &mut x;
    // *xxr += 1;
    // println!("x is {}{}", x, xxr);

    {
        let xxr = &mut x;
        *xxr += 1;
    }

    // 此处，xxr 的 borrow 会被释放
    println!("x is {}", x);
}
