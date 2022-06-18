
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Console*</title>
    </head>
    <body>
        <h1>Delete product[Admin page]</h1>
        <form:form action="deleteProizvod.htm" method="post" commandName="product">
                <div>
                <form:label path="id">ID of Product: </form:label>
                <form:input path="id"></form:input>
                <form:errors path="id" cssClass="errors"></form:errors>
                </div>
                <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
