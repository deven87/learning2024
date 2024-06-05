export class LoginPage {

    loginPage_username_textbox = '[name="username"]'

    loginPage_password_textbox = '[name="password"]'

    loginPage_login_button = '[type="submit"]'

    loginPage_loggedinuser_name = '.oxd-userdropdown-name'


     enterUserName(username) {

        cy.get(this.loginPage_username_textbox).type(username)

    }


     enterPassword(password){

        cy.get(this.loginPage_password_textbox).type(password)

    }

    clickLoginButton() {

        cy.get(this.loginPage_login_button).click()

    }

    validateLogIn(username) {
        cy.get(this.loginPage_loggedinuser_name).should('contain.text', username)
        
    } 

    login(username, password) {

        this.enterUserName(username)
        this.enterPassword(password)
        this.clickLoginButton()
    }

}