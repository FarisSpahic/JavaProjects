
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE PRODUCT</title>
    </head>
    <body>
        <form:form action="updateProizvod.htm" method="post" commandName="product">
            <div style="background-color: #f4f4f4; margin: 5px; padding: 5px;">
                <form:label path="id">ID proizvoda kojeg mijenjate:</form:label>
                <form:input path="id"></form:input>
                <form:errors path="id" cssClass="errors"></form:errors>
                </div>
                <p>*Sva polja moraju biti izmjenjena*</p>
                <div>
                <form:label path="naziv">Naziv</form:label>
                <form:input path="naziv"></form:input>
                <form:errors path="naziv" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="qty">Kolicina:</form:label>
                <form:input path="qty"></form:input>
                <form:errors path="qty" cssClass="errors"></form:errors>
                </div>
                <div>
                <form:label path="opis">Opis:</form:label>
                <form:input path="opis"></form:input>
                <form:errors path="opis" cssClass="errors"></form:errors>
                    <div>
                    <form:label path="cijena">Nova cijena:</form:label>
                    <form:input path="cijena"></form:input>
                    <form:errors path="cijena" cssClass="errors"></form:errors>
                    </div>
                    <input type="submit" value="Submit" />
            </form:form>
    </body>
</html>
