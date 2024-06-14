const myFunc = require('./import1.js')

// export all the modules of the file and use . operator

myFunc.myFunctionForExport1()

myFunc.myFunctionForExport2()


// or export required module of an file

// here we have exported the given module only
//const {myFunctionForExport1} = require('./import1')


// the exported module can be used directly
//myFunctionForExport1()

// export multiple modules together
const {myFunctionForExport1, myFunctionForExport2} = require('./import1.js')

myFunctionForExport1()
myFunctionForExport2()

import {myFunctionForExport3} from './import1.js'

myFunctionForExport3()