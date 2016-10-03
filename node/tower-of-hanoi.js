"use strict";

class TowerOfHanoi {
    move (n, source, target, auxiliary) {
        if (n > 0) {
            // move n-1 disks from source to auxiliary, so they are out of the way
            this.move(n-1, source, auxiliary, target);

            // move the nth disk from source to target
            target[target.length] = source.pop();

            this.print();

            // move the n-1 disks that we left on auxiliary onto target
            this.move(n-1, auxiliary, target, source);
        }
    }

    init () {
        this.move(this.A.length, this.A, this.C, this.B);
    }

    print () {
        console.log("========================================================");
        console.log("A: => ", this.A);
        console.log("B: => ", this.B);
        console.log("C: => ", this.C);
        console.log("========================================================");
    }

    constructor (num) {
        this.A = [];
        this.B = [];
        this.C = [];
        for (var i = num; i > 0; i--) {
            this.A[num-i] = i;
        }
    }
}

/*
 * Example
 */
const t = new TowerOfHanoi(5);
console.log("\n\nTOWER OF HANOI (RECURSIVE) - START\n");
t.print();
t.init();
console.log("\nTOWER OF HANOI (RECURSIVE) - COMPLETE\n");
