/*
 * STACK:
 * Implementing a stack in javascript
 */

function Stack () {
    this.top = 0;
    this.datastore = [];
    console.log("=======================================================");
    console.log("                   NEW STACK CREATED                   ");
    console.log("=======================================================");
};

Stack.prototype.push = function (value) {
    console.log("\n pushing in value: " + value);
    this.datastore[this.top] = value;
    this.top = this.top + 1;
};

Stack.prototype.pop = function () {
    console.log("\n popping out value: " + this.datastore[this.top-1]);
    delete this.datastore[this.top-1];
    this.top = this.top - 1;
};

Stack.prototype.count = function () {
    console.log("\n total number of items in stack = ", this.top);
    return this.top;
};

Stack.prototype.display = function () {
    console.log("\n displaying the stack....");
    for (var i = 0; i < this.top; i++) {
        console.log(" ", this.datastore[i]);
    };
};

var items = new Stack();
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