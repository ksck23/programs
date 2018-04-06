/*
 *
 * Commonly used ES6 Features
 *
 */

let a = 2;
let b = 5;
let c = 7;

const PI = 3.14;

let square = (x) => x * x;

console.log(`value of a square = ${square(a)}`);
console.log(`value of b square = ${square(b)}`);

let cube = (x=3) => x * x * x;

console.log(`value of c cube = ${cube(c)}`);
console.log(`value of default cube = ${cube()}`);

let args = (x, y, z, a, b) => x + y + z + a + b;

// Pass each elem of array as argument
console.log(`value of sum = ${args(...[1,2,3,4,5])}`);

h = { "a": "A", "b": "B", "c": "C" };
list = ["A", "B", "C"];

// Sets
var s = new Set();
s.add("A").add("B").add("C");

console.log(`size of s = ${s.size}`);
console.log(`s has 'B' in it -> ${s.has("B")}`);
console.log(s);

// Maps
var m = new Map();
m.set("hello", "world");
m.set("good", "morning");
console.log(`should contain 'world' -> ${m.get("hello")}`);
