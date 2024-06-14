const prompt = require("prompt-sync")({ sigint: true });
let a = prompt("enter your age")

a = Number.parseInt(a)

if (a >= 70) {
    console.log('you are a super senior citizen')
} else if (a >= 60) {

    console.log('you are a senior citizen')
} else {

    console.log("you are not a senior citizen")
}

const day = "Wednesday"

switch (day) {

    case "Sunday": 
        console.log("Sunday")
        break;

    case "Monday":
        console.log("Monday")
        break;

    case "Tuesday":
        console.log("Tuesday")
        break;

    default:
        console.log("No Day")
        break;


}

console.log("you can ",a>=18?"drive":"not drive")