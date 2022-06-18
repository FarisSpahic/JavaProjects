

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD NEW USER</title>
        <style>
            div{
                margin: 10px;
                background-color: #f4f4f4;
                padding: 5px;
            }
            .errors{
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Customer Form</h1>

        <form:form action="addNewUser.htm" commandName="kupac" method="post">
            <div>
                <form:label path="ime">Ime:</form:label>
                <form:input path="ime"></form:input>
                <form:errors path="ime" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="prezime">Prezime: </form:label>
                <form:input path="prezime"></form:input>
                <form:errors path="prezime" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="username">Username:</form:label>
                <form:input path="username"></form:input>
                <form:errors path="username" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="lozinka">Password:</form:label>
                <form:input path="lozinka" type="password"></form:input>
                <form:errors path="lozinka" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="email">E-Mail:</form:label>
                <form:input path="email"></form:input>
                <form:errors path="email" cssClass="errors"></form:errors>
                </div>
              
                <div>
                <form:label path="country">Country:</form:label>
                <form:input path="country"></form:input>
                <form:errors path="country" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="city">City:</form:label>
                <form:input path="city"></form:input>
                <form:errors path="city" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="postal">Postal number:</form:label>
                <form:input path="postal"></form:input>
                <form:errors path="postal" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="stanje">Deposit Money:</form:label>
                <form:input path="stanje"></form:input>
                <form:errors path="stanje" cssClass="errors"></form:errors>
                </div>                
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
        </form:form>
    </body>
</html>
