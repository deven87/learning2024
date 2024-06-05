///<reference types='cypress'/>

import { LoginPage } from "./pages/login"

const login = new LoginPage()

describe('All Login Tests', function(){

    this.beforeEach('', function(){

        cy.log('beforeEach')

    })

    this.beforeAll('', function(){

        cy.log('beforeAll')

    })

    this.afterAll('', function(){

        cy.log('afterAll')

    })

    this.afterEach('', function(){

        cy.log('afterEach')

    })



    it('Login Valid', function() {


        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        
        
        //login.enterUserName('Admin')
        //login.enterPassword('admin123')
        //login.clickLoginButton()
        
        login.login('Admin', 'admin123')
        
        })

        it('Login Invalid', function() {


            cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
            
            
            login.enterUserName('Admin')
            login.enterPassword('admin123')
            login.clickLoginButton()
            login.validateLogIn('elizabeth ann')
            
            })


}) 


