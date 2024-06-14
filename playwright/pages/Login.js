exports.LoginPage = class LoginPage {

    constructor(page) {

        this.page = page
        this.login_username_textbox = page.locator('#user-name');
        this.login_password_textbox = page.locator('#password');
        this.login_login_button = page.locator('#login-button');

    }

    async openLoginUrl() {

        await this.page.goto('https://www.saucedemo.com/')
        await this.page.pause()
    }

    async enterUserName(userName) {

        await this.login_username_textbox.fill(userName)

    }

    async enterPassword(password) {

        await this.login_password_textbox.fill(password)

    }

    async clickLogin() {

        await this.login_login_button.click()

    }



}