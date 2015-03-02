/*
 * DICTIONARY:
 * Implementing a dictionary in javascript using JSON object
 */

/* DICTIONARY */
function Dictionary () {
    this.datastore = {};
};

Dictionary.prototype.insert = function (key, value) {
    this.datastore[key] = value;
};

Dictionary.prototype.find = function (key) {
    return this.datastore[key];
};

Dictionary.prototype.remove = function (key) {
    delete this.datastore[key];
};

Dictionary.prototype.display = function () {
    console.log('=======================================');
    console.log('            DICTIONARY                 ');
    console.log('=======================================');
    self = this;
    Object.keys(this.datastore).map(function (key) {
        console.log(key + " -> " + self.datastore[key]);
    });
};

var dict = new Dictionary();

dict.insert('a', 'A');
dict.insert('b', 'B');
dict.insert('e', 'E');
dict.insert('g', 'G');
dict.insert('q', 'Q');
dict.insert('f', 'F');
dict.insert('m', 'M');
dict.insert('p', 'P');

dict.display();

console.log('\nFinding g =>', dict.find('g'));
dict.remove('q');

dict.display();