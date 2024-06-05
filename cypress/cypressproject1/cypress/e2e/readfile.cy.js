///<reference types='cypress'/>



before('access data file in all tests', function(){

    cy.fixture('example.json').as('test_data')


}
)


describe('Read Write file tests', function(){



    it('read file', function(){

        cy.fixture('example.json').then((data)=>{


            cy.log(data.name)
            cy.log(this.test_data.email)

        })


        cy.readFile('./cypress/fixtures/example.json').then((data)=>{

            cy.log(data.name)
        })

        cy.writeFile('./cypress/fixtures/example.txt', 'hellois', {flag: 'a+'})


    })





}


)