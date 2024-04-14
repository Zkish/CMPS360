from flask import Flask, render_template
app = Flask(__name__)
@app.route('/')
def pointpark():
    return 'pointpark is almost out for the semester.'

if __name__ == '__main__':
    app.run(debug=True)