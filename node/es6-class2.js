'use strict'

class Cat { 
  constructor(name) {
    this.name = name;
  }
  
  speak() {
    console.log(this.name + ' makes a noise.');
  }
}

class Lion extends Cat {
    speak() {
    super.speak();
    console.log(this.name + ' roars.');
  }
}

var lion = new Lion("shiva");

lion.speak();
