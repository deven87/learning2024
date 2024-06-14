// for loop
// for in loop to iterate though object keys
// for out loop ot iterate though object values
// while loop
// do while loop

for(let i = 0; i < 30; i++) {
    console.log(i)
}

let a = 20;

while(a<22) {
    console.log(a)
    a++
}

do {
    console.log(a)
    a++
} while (a<25)


const student = {

    "name":"devendra",
    "marks":30

}

for (let obj in student) {

    console.log(student[obj])
}


for (let obj of "devendra") {

    console.log(obj) // works only if object is iterable
}