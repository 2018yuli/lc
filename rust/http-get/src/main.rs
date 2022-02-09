extern crate reqwest;


fn main() {

    let response_text = reqwest::get("https://www.baidu.com")
        .expect("Couldn't make request")
        .text().expect("Couldn't read response text!");

    println!("Response text: {}", response_text);

    // match reqwest::get("https://www.baidu.com") {
    //     Ok(mut response) => {
    //         if response.status() == reqwest::StatusCode::Ok {
    //             match response.text() {
    //                 Ok(text) => println!("Response Text: {}", text),
    //                 Err(_) => println!("Could not read response text!")
    //             }
    //         } else {
    //             println!("Response was not OK!");
    //         }
    //     },
    //     Err(_) => println!("Could not make the request!")
    // }
}