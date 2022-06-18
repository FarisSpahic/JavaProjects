

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head> 
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <style>
            .errors{
                color: red;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NEW PRODUCT</title

    </head>
    <body>
        <h1>Product Form</h1>
        <form:form action="addNewProizvod.htm" commandName="product" method="post">
            <div>
                <form:label path="naziv">Naziv:</form:label>
                <form:input path="naziv"></form:input>
                <form:errors path="naziv" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="qty">Kolicina:</form:label>
                <form:input path="qty"></form:input>
                <form:errors path="qty" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="cijena">Cijena:</form:label>
                <form:input path="cijena"></form:input>
                <form:errors path="cijena" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="opis">Opis:</form:label>
                <form:textarea path="opis"></form:textarea>
                <form:errors path="opis" cssClass="errors"></form:errors>
                </div>
                <p>${msg}</p>
            <input type="submit" value="Submit" />
            <input type="reset" value="Reset" />
        </form:form>
    </body>
</html>
