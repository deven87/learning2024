const{test, expect} = require('@playwright/test')

test('my first test', async ({page})=>{


await page.goto('https://www.intelligent.com')

await expect(page).toHaveTitle('Intelligent')

await expect(page.locator('.toggle-btn.new-toggles')).toHaveClass('toggle-btn new-toggle')

await page.locator('.toggle-btn.new-toggle').click()

})