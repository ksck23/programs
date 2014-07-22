/*
 * basic.js : Basic prototype example
 */

// class declaration
function Person (p) {
    this.name        = p.name;
    this.age         = p.age;
    this.designation = p.designation;
}

Person.prototype = {
    // getter functions
    getName: function () {
        return this.name;
    },
    getAge: function () {
        return this.age;
    },
    getDesignation: function () {
        return this.designation;
    },
    // setter functions
    setName: function (name) {
        this.name = name;
    },
    setAge: function (age) {
        this.age = age;
    },
    setDesignation: function (designation) {
        this.designation = designation;
    }
};

// instantiating a new object to the class
var shiva = new Person({
    name : "Shiva K",
    age  : "24",
    designation : "Software Engineer"
});

console.log("\nretrieving details for shiva.....\n");
console.log("Name        : ", shiva.getName());
console.log("Age         : ", shiva.getAge());
console.log("Designation : ", shiva.getDesignation());

console.log("\nupdating name...");
shiva.setName("Shiva Chandra Kumar K");
console.log("updated name to :", shiva.getName());

console.log("\nupdating designation...");
shiva.setDesignation("Senior Software Engineer");
console.log("updated designation to :", shiva.getDesignation());