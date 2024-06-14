class Animal{

   static mystaticVar = "hello"

   eat() {
      console.log('eat')

   }

   bark() {
      console.log('bark animal')
      
         }
      }


class Dog extends Animal{

   bark() {
console.log('bark')

   }
}


let d = new Dog()
d.bark()
d.eat()
console.log(Dog.mystaticVar)

let e = new Animal()
e.eat()
e.bark()


// hoisting in java script which allow to use the variables and function before defining them,



console.log(l) // will not give error due to hoisting, print undefined

var l  


console.log(k) // will not give error due to hoisting, print undefined

var k = 20 // only the declaration is hoisted to top, but not initialization so for the statemenet above this, it is still undefined