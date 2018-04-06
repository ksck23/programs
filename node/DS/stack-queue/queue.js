/*
 * QUEUE:
 * Implementing a queue in javascript
 */

function Queue () {
    this.start = 0;
    this.end = 0;
    this.datastore = [];
    console.log("=======================================================");
    console.log("                   NEW QUEUE CREATED                   ");
    console.log("=======================================================");
};

Queue.prototype.push = function (value) {
    console.log("\n pushing in value: " + value);
    this.datastore[this.end] = value;
    this.end = this.end + 1;
};

Queue.prototype.pop = function () {
    console.log("\n popping out value: " + this.datastore[this.start]);
    delete this.datastore[this.start];
    this.start = this.start + 1;
};

Queue.prototype.count = function () {
    console.log("\n total number of items in queue = ", (this.end - this.start));
    return (this.end - this.start);
};

Queue.prototype.display = function () {
    console.log("\n displaying the queue....");
    for (var i = this.start; i < this.end; i++) {
        console.log(" ", this.datastore[i]);
    };
};

var items = new Queue();
items.push(3);
items.push(1);
items.push(54);
items.push(23);
items.push(11);
items.push(34);
items.push(42);

items.display();
items.count();

items.pop();
items.pop();

items.display();
items.count();

items.push(21);

items.display();
items.count();