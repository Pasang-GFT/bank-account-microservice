const express = require('express');
const app = express();

app.get('/', (req, res) => {
    let userInput = req.query.name;
    if (!userInput) {
        userInput = 'Harry Potter';
    }

    res.send(`
        <!DOCTYPE html>
        <html>
        <body>

        <h2>JavaScript XSS Vulnerability</h2>

        <p id="demo">${userInput}</p>

        </body>
        </html>
    `);
});

app.listen(3000, () => console.log('Server running on port 3000'));