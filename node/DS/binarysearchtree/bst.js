/*
 * Node: A class to define a node in the BST
 */

function Node (data) {
    this.data = data;
    this.left = null;
    this.right = null;
};

Node.prototype.show = function () {
    return this.data;
};

/*
 * BST: Binary Search Tree Class
 */

function BST () {
    this.root = null;
};

BST.prototype.insert = function (data) {

    var n = new Node(data, null, null);

    if (this.root === null) {
        this.root = n;
    } else {
        var pointer = this.root;
        var parent;

        while (1) {
            parent = pointer;
            if (data < pointer.data) {
                pointer = pointer.left;
                if (pointer === null) {
                    parent.left = n;
                    break;
                }
            } else {
                pointer = pointer.right;
                if (pointer === null) {
                    parent.right = n;
                    break;
                }
            }
        }
    }
};

BST.prototype.inorder = function (pointer) {
    if (pointer) {
        this.inorder(pointer.left);
        console.log(pointer.show());
        this.inorder(pointer.right);
    }
};

BST.prototype.preorder = function (pointer) {
    if (pointer) {
        console.log(pointer.show());
        this.inorder(pointer.left);
        this.inorder(pointer.right);
    }
};

BST.prototype.postorder = function (pointer) {
    if (pointer) {
        this.inorder(pointer.left);
        this.inorder(pointer.right);
        console.log(pointer.show());
    }
};

/*
 * Example
 */

var bst = new BST();

bst.insert(23);
bst.insert(3);
bst.insert(2);
bst.insert(13);
bst.insert(22);
bst.insert(43);
bst.insert(11);
bst.insert(29);
bst.insert(18);
bst.insert(87);

console.log("\n============ INORDER ==============");
bst.inorder(bst.root);
console.log("============ PREORDER ==============");
bst.preorder(bst.root);
console.log("============ POSTORDER ==============");
bst.postorder(bst.root);