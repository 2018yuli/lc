struct Rectangle {
    width: u8,
    height: u8
}

impl Rectangle {
    fn is_square(&self) -> bool {
        self.width == self.height
    }
}

fn main() {
    
}

fn give_two() -> i32{
    2
}

#[cfg(test)]
mod dcode_test {
    
    #[test]
    fn test_1() {
        assert!(1 == 1);
    }

    #[test]
    #[should_panic]
    fn test_basic() {
        assert!(1 == 1);

        panic!("Oh no");
    }

    #[test]
    fn test_equals() {
        assert_eq!(2, 1 + 1);
        assert_ne!(2, 1 + 2);
    }

    #[test]
    #[ignore = "use too much time"]
    fn test_ignore() {
        for i in 1..1000 {
            assert_eq!(2, i + 1)
        }
    }

    #[test]
    fn test_call_method() {
        assert_eq!(super::give_two(), 1 + 1)
    }

    #[test]
    fn test_structs() {
        let r = super::Rectangle {
            width: 30,
            height: 30
        };
        assert!(r.is_square());
    }
}