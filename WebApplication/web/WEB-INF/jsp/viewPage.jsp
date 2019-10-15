<%-- 
    Document   : viewPage
    Created on : Oct 15, 2019, 5:52:58 PM
    Author     : A D M I N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Hello World!</h1>
        <table border="1px solid">
            <tr>
                <th>Name</th>
                <th>Id</th>
            </tr>
            <tr>
                <td>${name}</td>
                <td>${id}</td>
            </tr>
        </table>
        <h4>${mess}</h4>
    </center>
    </body>
</html>
