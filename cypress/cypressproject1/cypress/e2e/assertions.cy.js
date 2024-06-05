///<reference types='cypress'/>


describe('all assertion test', function(){


    it('should contain', ()=>{


        cy.visit('https://example.cypress.io/')

        cy.get(':nth-child(4) > .row > .col-xs-12 > .home-list > :nth-child(1) > ul > :nth-child(1) > a').click()
        cy.get('#query-btn').should('contain', 'Button')
        .should('have.class', 'btn-primary')
        .should('be.enabled')
        .should('be.visible').and('contain', 'Button')

        cy.get('#query-btn').invoke('attr', 'id').should('equal', 'query-btn')


       // expect(true).to.be.true

      //  var name = 'devendra'

       // expect(name).to.be.equal('devendra')

       // assert.equal(2,2,"not equal")

        //assert.strictEqual(2,'2', "not equal")


    })


})
