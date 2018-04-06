/*
 * HASH TABLE:
 * Implementing a hash table in javascript using JSON object
 */

/* HASH TABLE */
function HashTable () {
    this.table = {};
};

HashTable.prototype.compute = function (data) {
    var total = 0;
    for (var i = 0; i < data.length; ++i) {
        total += data.charCodeAt(i);
    }
    return total;
};

HashTable.prototype.insert = function (data) {
    var hashKey = this.compute(data);
    this.table[hashKey] = data;
};

HashTable.prototype.count = function () {
    return Object.keys(this.table).length;
};

HashTable.prototype.display = function () {
    console.log('=======================================');
    console.log('            HASH TABLE                 ');
    console.log('=======================================');
    self = this;
    Object.keys(self.table).map(function (key) {
        console.log(key + " -> " + self.table[key]);
    });
    console.log('Total entries = ', self.count());
};

var hash = new HashTable();

hash.insert('Shiva');
hash.insert('Chandra');
hash.insert('Kumar');
hash.insert('Cognizant Technology Solutions');

hash.display();