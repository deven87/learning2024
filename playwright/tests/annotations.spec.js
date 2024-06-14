const {test, expect}  = require('@playwright/test')

test.only('run only this test outside descript', ()=>{

    console.log('run it')

})

test.describe('my describe block', ()=>{

//  test.only('run only this test', ()=>{

//     console.log('run it')

// })

test.skip('do not run this test', ()=>{
    
    console.log('do not run it')


})

test.fixme('need to fix it, this will not run', ()=> {

    console.log('need to fix')

})

test.fail('expect this test to fail, but if it passed the result will be failure', async ({page})=>{
    
await page.goto('https://www.saucedemo.com/')

// this below condition is true so the result will fail, if the condition was false
// the resule will be passed as we have added test.fail annotation
await expect(page.locator('#login-button')).toHaveAttribute('value','Login')
   
})

test.only('run only this test inside describer', ()=>{

    console.log('run it')

})


})



test.slow('run slow  test by 3 times timeout in config', ()=>{

    console.log('run it')

})