const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.send('Hello World!')
  })
  
app.post('/', (req, res) => {
  res.send('Got a POST request')
})

app.put('/item', (req, res) => {
  res.send('Got a PUT request at /item')
})

app.delete('/item', (req, res) => {
  res.send('Got a DELETE request at /item')
})
  
app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})