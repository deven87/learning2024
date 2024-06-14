import{test, expect} from '@playwright/test'
import exp from 'constants';

test('API get request', async ({request})=>{

   const response = await request.get('https://reqres.in/api/users/2')

   expect(response.status()).toBe(200);

   const text = await response.text()

   expect(text).toContain('Janet')

   console.log(await response.json())


})

test('API Post request', async ({request})=>{

    const response = await request.post('https://reqres.in/api/users', {

    data:{
        "name":"devendra",
        "job":"engineer"
    }

    })
 
    expect(response.status()).toBe(201);
 
    const text = await response.text()
 
    expect(text).toContain('js')
 
    console.log(await response.json())
 
 
 })

 test.only('API delete request', async ({request})=>{

    const response = await request.delete('https://reqres.in/api/users/2')
 
    expect(response.status()).toBe(204);

 })