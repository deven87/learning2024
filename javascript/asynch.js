/*

asnyc  functions execute in parallely and not on by one

so to make something wait and then only proceed with next statement, we can use wait

*/



const devd = async ()=> {

    console.log("i am waiting  for anyone")
}



const dev = async ()=> {

    console.log("i am not waiting for anyone")
}


setTimeout(devd, 5000)
dev()

