
try {

    throw new Error("my error")
} catch(error) {
   // console.log(error)

    console.log(error.name) // only the namne of the error
   console.log(error.message) // only the error message

    console.log(error.stack) // full error stack with name message and location


}
finally {

console.log("this block will always run regardless of error occurs or not")
}
// console.log(rahul)
