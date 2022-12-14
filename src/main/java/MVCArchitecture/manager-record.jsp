<%@ page import="MVCArchitecture.Managers" %>
<html>
<head>
    <title>Student Record</title>
</head>
<body>
<%
    if (request.getAttribute("managerRecord") != null) {
        Managers managers = (Managers) request.getAttribute("managerRecord");
%>

<h1>Student Record</h1>
<div>ID: <%= managers.getId()%></div>
<div>First Name: <%= managers.getFirstName()%></div>
<div>Last Name: <%= managers.getLastName()%></div>

<%
} else {
%>

<h1>No student record found.</h1>

<% } %>
</body>
</html>