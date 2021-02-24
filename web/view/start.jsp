<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.lang.String" %>
<%--directive--%>
<html>
<head>
    <title>Start</title>
</head>
<body>
<h1>This is a JSP page</h1>

<%! //declaration  -> outside service method
    int num=10;
%>

<% // scriptlet  -> inside service method
    for (int i=1;i<=10;i++) {
        num = num+1;
        out.println("Number is " + num+"<br>");
    }
%>
<p>After the loop number is = <%= num %></p>
</body>
</html>
