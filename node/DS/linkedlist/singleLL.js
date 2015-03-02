/*
 * SINGLE LINKEDLIST:
 * Implementing a linked list in javascript
 */

/* NODE */
function Node (element) {
    this.element = element;
    this.next = null;
};

/* LINKED LIST */
function LList () {
    this.head = new Node('head');
};

LList.prototype.find = function (value) {
    var currentNode = this.head;
    while (currentNode.element != value) {
        currentNode = currentNode.next;
    }
    return currentNode;
};

LList.prototype.findPrevious = function (value) {
    var currentNode = this.head;
    while (!(currentNode.next == null) && (currentNode.next.element != value)) {
        currentNode = currentNode.next;
    }
    return currentNode;
};

LList.prototype.insert = function (newValue, refValue) {
    var newNode = new Node(newValue);
    var currentNode = this.find(refValue);
    newNode.next = currentNode.next;
    currentNode.next = newNode;
};

LList.prototype.remove = function (value) {
    var previousNode = this.findPrevious(value);
    if (previousNode.next) {
        previousNode.next = previousNode.next.next;
        console.log('Node: ', value, 'has been removed.');
    } else {
        console.log('Node not found');
    }
};

LList.prototype.display = function () {
    console.log('=======================================');
    console.log('            LINKED LIST                ');
    console.log('=======================================');
    var currentNode = this.head;
    while (currentNode.next) {
        console.log(currentNode.next.element);
        currentNode = currentNode.next;
    }
};

var LL = new LList();
LL.insert(23, 'head');
LL.insert(11, 23);
LL.insert(8, 11);
LL.insert(56, 8);
LL.insert(21, 23);
LL.insert(2, 21);
LL.insert(99, 2);

LL.display();

console.log('Finding node with value: 21 =>', LL.find(21).element);

LL.remove(99);
LL.display();