const {test, expect, chromium} = require('@playwright/test')

test('video launch', async()=>{

     const browser1 = await chromium.launch() //launch new instance of chromium or firefox or edge

     // can set options like


     const browser = await chromium.launch({
            slowmo:1000,
            headless:true
        }
     )


     const context1 = await browser.newContext() // create a new context from browser


     const context = await browser.newContext({
        recordVideo:{
            dir:'videos',
            size:{width:800, height:800}
        }
     }) 


     const page = await context.newPage() // open new page

     await page.goto('https://kitchen.applitools.com/')

     expect(page.locator('text=Alert')).toBeVisible


})