
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prodaja</title>
    </head>
    <body>
        <h1>Add sale: </h1>
        <form:form action="prodajaMain.htm" method="post" commandName="prodaja">

            <div>
                <form:label path="idKupac">ID kupca: </form:label>
                <form:input path="idKupac"></form:input>
                </div>
                <div>
                <form:label path="idProizvod">ID proizvoda: </form:label>
                <form:input path="idProizvod"></form:input>                
                </div>
                <div>
                <form:label path="qty">Kolicina:</form:label>
                <form:input path="qty"></form:input>
                </div><br/>
                <p>${logError}</p>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
