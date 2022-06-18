<%@page import="models.Kupac"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Store</title>
        <style>
            *{
                font-family: sans-serif;
            }
            body{
                background-color: #f4f4f4;
                margin: 5px 10px 5px 10px;
                padding: 5px;
            }
        </style>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head>
    <body>
        <h1>Main Page</h1>
        <p>${currentUser}</p>
        <form action="kupacMain.htm">
            <input type="submit" value="Kupac" />
        </form><br/>
        <form action="proizvodiMain.htm">
            <input type="submit" value="Proizvodi" />
        </form><br/>
        <form action="prodajaMain.htm">
            <input type="submit" value="Prodaja" />
        </form>
    </body>
</html>
