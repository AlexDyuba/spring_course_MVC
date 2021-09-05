<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h1>WHO ARE YOU???</h1>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    name <form:input path="name"/>
    <br><br>
    surname <form:input path="surname"/>
    <br><br>
    salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>
