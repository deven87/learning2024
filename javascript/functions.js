let a = 3
let b = 4


function averageCalc(a, b) {
    return (a + b)/2
}

console.log("average of 2 and 3 is " + averageCalc(2,3))

console.log("average of 2 and 3 is " + averageCalc("2","3"))


//arrow function

// function can be created by this as well
const sum = (a,b)=>{return a+b}

const print = ()=>{console.log("hello")}


// calling the function
console.log(sum(4,5))
print()
