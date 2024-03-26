from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def welcome():
    return "Welcome to the Flask App!"

@app.route('/vulnerable', methods=['GET'])
def vulnerable():
    param = request.args.get('param', 'not set')
    return f'You set the parameter to: {param}'

if __name__ == '__main__':
    app.run()