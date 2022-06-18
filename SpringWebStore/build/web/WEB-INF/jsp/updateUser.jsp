
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .errors{
                color:red;
            }
            .firstDiv{
                margin: 5px;
                padding: 5px;
                background-color: #f4f4f4;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE USER</title>
    </head>
    <body>
        <h1>Select User:</h1>
        <form:form action="updateUser.htm" commandName="user" method="post">
            <div class="firstDiv">
                <form:label path="uUsername">Username:</form:label>
                <form:input path="uUsername"></form:input>
                <form:errors path="uUsername" cssClass="errors"></form:errors>

                <form:label path="uLozinka">Password:</form:label>
                <form:input path="uLozinka"></form:input>
                <form:errors path="uLozinka" cssClass="errors"></form:errors>

                </div>
                <h2>Change Properties:</h2>
                <p>*Sva polja se moraju ponovo unijeti*</p>
                <div>
                <form:label path="ime">Ime: </form:label>
                <form:input path="ime"></form:input>
                <form:errors path="ime" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="prezime">Prezime:</form:label>
                <form:input path="prezime"></form:input>
                <form:errors path="prezime" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="username">Username:</form:label>
                <form:input path="username"></form:input>
                <form:errors path="username" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="lozinka">Lozinka:</form:label>
                <form:input path="lozinka"></form:input>
                <form:errors path="lozinka" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="country">Drzava:</form:label>
                <form:input path="country"></form:input>
                <form:errors path="country" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="city">Grad:</form:label>
                <form:input path="city"></form:input>
                <form:errors path="city" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="postal">Postanski broj:</form:label>
                <form:input path="postal"></form:input>
                <form:errors path="postal" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="email">E-Mail:</form:label>
                <form:input path="email"></form:input>
                <form:errors path="email" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="stanje">Stanje racuna: </form:label>
                <form:input path="stanje"></form:input>
                <form:errors path="stanje" cssClass="errors"></form:errors>
                </div>
                <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
