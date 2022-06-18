<%-- 
    Document   : proizvodiMain
    Created on : Mar 11, 2021, 5:53:13 PM
    Author     : Faris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proizvodi</title>
    </head>
    <body>
        <h1>Select option: </h1>
        <form action="addNewProizvod.htm">
            <input type="submit" value="Add New Product" />
        </form><br/>
        <form action="deleteProizvod.htm">
            <input type="submit" value="Delete Product" />
        </form><br/>
        <form action="updateProizvod.htm">
            <input type="submit" value="Update Product" />
        </form>
    </body>
</html>
