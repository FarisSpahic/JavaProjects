
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DELETE USER</title>
    </head>
    <body>

        <form:form method="post" action="deleteUser.htm" commandName="user">
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
                <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
