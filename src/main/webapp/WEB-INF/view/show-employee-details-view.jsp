<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adyubaicloud.com
  Date: 9/4/21
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>

<body>

Name : ${employee.name}
<br><br>
Surname: ${employee.surname}
<br><br>
Salary: ${employee.salary}
<br><br>
Department: ${employee.department}
<br><br>
Your car: ${employee.brandCar}
<br><br>
Your languages
<ul>
    <c:forEach var="iterator" items="${employee.languages}">

        <li> ${iterator} </li>

    </c:forEach>
</ul>
<br>
Number phone ${employee.phone}
<br><br>
Email ${employee.email}
</body>
</html>
