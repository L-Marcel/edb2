pub fn heapfy(arr: &mut Vec<i8>) {
    for i in (0..(arr.len()/2)).rev() {
        max_heap(arr, i, arr.len())
    }
}

fn max_heap(arr: &mut Vec<i8>, node: usize, size: usize) {
    let left: usize = (node * 2) + 1;
    let right: usize = left + 1;

    let mut bigger: usize = node;
    let has_left: bool = left < size;
    let has_right: bool = right < size;

    if !has_left && !has_right { return; };

    if has_left && arr[left] > arr[bigger] {
        bigger = left;
    };

    if has_right && arr[right] > arr[bigger] {
        bigger = right;
    }

    if node != bigger {
        arr.swap(node, bigger);
        max_heap(arr, bigger, size);
    }
}

pub fn sort(arr: &mut Vec<i8>) {
    for i in 0..arr.len() {
        let size: usize = arr.len() - 1 - i;
        arr.swap(0, size);
        max_heap(arr, 0, size);
    }
}