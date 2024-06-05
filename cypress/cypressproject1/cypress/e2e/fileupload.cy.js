///<reference types='cypress'/>
///<reference types='cypress-downloadfile'/>



    it('file upload', function(){

        cy.visit('https://trytestingthis.netlify.app/')

        cy.get('#myfile').attachFile('example.json')

      
    })

    it('download file in mentioned dir', () => {


        cy.downloadFile('https://sample-videos.com/doc/Sample-doc-file-100kb.doc','Downloads','cypress-example.doc')

      //  cy.readFile('./Downloads/cypress-example.doc').should('contain', 'This is Heading1 Textqweqweqwewqe')
      })

