use rand;

mod algorithms;

use algorithms::merge::sort as merge_sort;
use algorithms::heap::heapfy;
use algorithms::heap::sort as heap_sort;
use algorithms::bogo::sort as bogo_sort;

fn main() {
    println!("Testing merge sort...");
    for _ in 0..30 {
        let mut raw: Vec<i8> = generate_array(10);
        merge_sort(&mut raw);
        assert!(raw.is_sorted());
    }

    println!("Testing heap sort...");
    for _ in 0..30 {
        let mut raw: Vec<i8> = generate_array(10);
        heapfy(&mut raw);
        heap_sort(&mut raw);
        assert!(raw.is_sorted());
    }
    
    println!("Testing bogo sort...");
    for _ in 0..30 {
        let mut raw: Vec<i8> = generate_array(10);
        bogo_sort(&mut raw);
        assert!(raw.is_sorted());
    }

    println!("All tests passed!");
}

fn generate_array(size: usize) -> Vec<i8> {
    let mut arr: Vec<i8> = Vec::with_capacity(size);
    for _ in 0..size {
        arr.push(rand::random::<i8>());
    }
    arr
}