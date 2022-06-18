<%-- 
    Document   : successPage
    Created on : Mar 11, 2021, 10:08:02 PM
    Author     : Faris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation</title>
    </head>
    <body>
        <h1>Success! Form is submitted :)</h1>
        <h1>You entered following data:</h1>
        <p>First name: ${ime}</p>
        <p>Last name: ${prezime}</p>
        <p>Email: ${email}</p>
        <p>Country: ${country}</p>
        <p>City ${city}</p>
        <p>Postal ${postal}</p>
    </body>
</html>
