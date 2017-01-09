var swap = function (arr) {
    if (arr[0] > arr[1]) return [arr[1], arr[0]];
    else return arr;
};

var mergeArrays = function (arr1, arr2) {
    var marr = [], shift;
    while (arr1.length && arr2.length) {
        if (arr1[0] > arr2[0]) {
            shift = arr2.shift();
            marr.push(shift);
        } else {
            shift = arr1.shift();
            marr.push(shift);
        }
    }

    while (arr1.length) {
        shift = arr1.shift();
        marr.push(shift);
    }

    while (arr2.length) {
        shift = arr2.shift();
        marr.push(shift);
    }

    return marr;
};

var mergeSort = function (arr) {
    if (arr.length === 1) {
        return arr;
    } else if (arr.length === 2) {
        return swap(arr);
    } else {
        var narr = arr.splice(0, (arr.length)/2);
        var arr1 = mergeSort(arr);
        var arr2 = mergeSort(narr);
        return mergeArrays(arr1, arr2);
    }
};

/*
 * Example
 */

var uList = [1, 3, 4, 6, 0, 8, 21, 13, 12, 11, 9];
var mergedList = mergeSort(uList);
console.log(mergedList);
