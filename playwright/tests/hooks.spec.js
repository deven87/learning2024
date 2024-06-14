const { test, expect } = require('@playwright/test')

let page;

test('login test1', async () => {


    await page.locator('#user-name').click()

    await page.locator('#user-name').fill('standard_user')

    await page.locator('#password').fill('secret_sauce')


    await page.locator('#login-button').click()

})


test.beforeEach('hooks before each', async () => {

    //await expect(page).toHaveURL(new RegExp('https://www.saucedemo.com$'))

})

test.afterEach('hooks after each', async () => {

    await expect(page.locator('text=Products')).toBeVisible()

})

test.afterAll('hook after all', async () => {

    await page.pause()
    await page.close()

})

// before all does not have page and context as they are defined for each test
// we can use browser though and create global page variable which can be used across all tests
test.beforeAll('hooks before all', async ({ browser }) => {

    page = await browser.newPage()
    await page.goto('https://www.saucedemo.com')

})


test('login test2', async () => {

})






test.describe('my all tests inside descript block', ()=>{


    test('first test', async ({page}) => {


        console.log('first test in describe')


    })


     test('second test', async ({page}) => {
        console.log('second test in describe')
        
    })

})