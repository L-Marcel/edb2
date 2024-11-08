pub fn sort(arr: &mut Vec<i8>) {
    if !arr.is_sorted() {
        _sort(arr, 0);
    }
}

fn _sort(arr: &mut Vec<i8>, offset: usize) {
    if offset + 1 == arr.len() { return; };
    
    for i in offset..arr.len() {
        arr.swap(offset, i);
        _sort(arr, offset + 1);
        if arr.is_sorted() { break; };
        arr.swap(offset, i);
    }
}