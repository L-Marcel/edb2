pub fn sort(arr: &mut Vec<i8>) {
    if !arr.is_sorted() { 
        _sort(arr, 0,  arr.len() - 1);
    };
}

fn _sort(arr: &mut Vec<i8>, start: usize, end: usize) {
    if start >= end { return; };

    let middle: usize = (end - start + 1) / 2;
    let left_end: usize = start + middle - 1;
    let right_start: usize = start + middle;

    _sort(arr, start, left_end);
    _sort(arr, right_start, end);

    let mut left_index: usize  = start;
    let mut right_index: usize = right_start;

    let capacity: usize = end - start + 1;
    let mut temp: Vec<i8> = Vec::with_capacity(capacity);
    while temp.len() != capacity {
        if left_index > left_end { 
            temp.push(arr[right_index]);
            right_index += 1; 
        } else if right_index > end {
            temp.push(arr[left_index]);
            left_index += 1;
        } else if arr[left_index] < arr[right_index] {
            temp.push(arr[left_index]);
            left_index += 1;
        } else  {
            temp.push(arr[right_index]);
            right_index += 1;
        }
    }

    for i in start..(end + 1) {
        arr[i] = temp[i - start];
    }
}