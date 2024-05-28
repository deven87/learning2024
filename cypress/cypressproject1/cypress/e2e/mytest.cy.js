///<reference types='cypress'/>

it('my own test', function() {


cy.visit("https://www.intelligent.com")


 cy.get('.toggle-btn.new-toggle').click()

})