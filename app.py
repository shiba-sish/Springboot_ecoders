from flask import Flask,render_template,url_for
# naming our app by using the constructor of flask class
app = Flask(__name__)

#opening the first page of the application
@app.route("/")
@app.route("/home")

#naming/defining the first page of the application
def home():
    return render_template("home.html")

#opening the contact page of the application
@app.route("/contact")

#naming/defining the contact page of the application
def contact():
    return render_template("contact.html")

#opening the defect page of the application
@app.route("/defect")

#naming/defining the defect page of the application
def defect():
    return render_template("defect.html")

#opening the testcase page of the application
@app.route("/testcase")

#naming/defining the testcase page of the application
def testcase():
    return render_template("testcase.html")

#opening the employee page of the application
@app.route("/employee")

#naming/defining the employee page of the application
def employee():
    return render_template("employee.html")

@app.route("/dropdown")

#naming/defining the dropdown page of the application
def dropdown():
    return render_template("dropdown.html")

@app.route("/alerts")

#naming/defining the alerts page of the application
def alerts():
    return render_template("alerts.html")

#to start the application from this section/page we use the following code
if __name__==("__main__"):
    app.run(debug = True)