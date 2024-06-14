import { test, expect } from "@playwright/test";
import exp from "constants";

//const {test, expect} = require('@playwright/test')

// both above are used to import node package playwright/test modules test and expect which we will use in our test

// test is  imported as above, page is a fixture I am ussing which will be give my all capabilities
test('my assertion test', async ({page})=>{

await page.goto('https://kitchen.applitools.com')

await page.pause()

const kitchenHeader = page.locator('h1')

 expect(kitchenHeader).toBeVisible

 expect(kitchenHeader).toBeEnabled

 expect(kitchenHeader).toBeDisabled

 console.log(kitchenHeader.getAttribute('style'))

// await expect.soft(kitchenHeader).toHaveAttribute('class', '')

// have or not have text
await expect(kitchenHeader).toHaveText('The Kitchen')

//await page.locator('//h3[normalize-space()="Alert"]').click()


await expect(page).toHaveScreenshot()  

// it will not fail till 100 pixel diff
await expect(page).toHaveScreenshot({ maxDiffPixels: 100 });


// this will compare the screenshot, if no screenshot, it will take and compare in next run

// if the screenshot is updated, you can pass it via command
//npx playwright test --update-snapshots






})