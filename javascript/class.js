class MyClass{

   constructor(name, rollnumber) {

    this.name = name
    this.rollnumber = rollnumber

   }

    submit() {
console.log(this.name + "my method submit")
   }

   cancel() {
    console.log(this.rollnumber + "my method cancel")
       }



}

let mybObj = new MyClass("devendra", 123)
let mybObj1 = new MyClass("sing", 3456)

mybObj.submit()

mybObj1.submit()
mybObj1.cancel()
