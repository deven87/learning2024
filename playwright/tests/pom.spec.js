
import{test, expect} from '@playwright/test'

import {LoginPage} from '../pages/Login'

test('my test1 @smoke', async ({page})=> {

    const loginPage = new LoginPage(page)

    await loginPage.openLoginUrl()

    await loginPage.enterUserName('standard_user')

    await loginPage.enterPassword('secret_sauce')

    await  loginPage.clickLogin()

})
