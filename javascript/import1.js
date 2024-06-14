

const myFunctionForExport1 = ()=>{


    console.log("I am a function for export")


}

const myFunctionForExport2 = ()=>{


    console.log("I am a function for export")


}


// have to export the module using export
// use {} for more than 1 module export


module.exports = {myFunctionForExport1, myFunctionForExport2}


// another way is es6 module export import



export const myFunctionForExport3 = ()=>{


    console.log("I am a function for export")


}