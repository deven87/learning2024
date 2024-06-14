
// var was used before EcmaScript6 and is old, so not used now, it has a global scope and can be redeclared at any time


var name1= "hello"
var name1 = 123;

console.log(name1)

// let is used from es6  and is new, let has block scope

let name = "devd"

//let name = 123; // re declaring will give error

{
    let name = 123; //this is only block scope and not redeclare, so this is allowed
    console.log(name) // inside the block, value is 123

}

console.log(name) // outside the block, so value will be devd



// data types

// null number  undefined string bigint boolean symbol

let a = "123"
let b = 123
let c = null
let d = undefined
let e = true

// var and let are undefined if not initialized
// const has to be initialized when declared

const a1 = 123

// a1 = 244 // value of const can not be changed


// above are premitive data type

// there can be user defined data type as well, e.g. objects

const student = {

    "name":"devendra",
    "rollnumber":123,
    "isEligible":true

}

console.log(student)
console.log(student.name)
console.log(student["name"])

console.log(typeof student)
