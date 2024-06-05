const{test, expect} = require('@playwright/test')

test('my first test', async ({page, context})=>{

    await context.tracing.start({

        snapshots:true,
        screenshots:true

    }
    )

await page.goto('https://www.intelligent.com')

await page.pause()

await expect(page).toHaveTitle('Intelligent')

await expect(page.locator('.toggle-btn.new-toggle')).toHaveClass('toggle-btn new-toggle')

await page.locator('.toggle-btn.new-toggle').click()

await context.tracing.stop({

    path:'test_trace.zip'

})

})