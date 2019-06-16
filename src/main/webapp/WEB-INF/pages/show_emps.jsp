<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align:center">Employee Details</h1>
<c:choose>
<c:when test="${!empty empdetails}">
<table border="1">
<c:forEach var="dto" items="${empdetails}">
<tr>
<td><c:out value="${dto.empno}"/></td>
<td><c:out value="${dto.empname}"/></td>
<td><c:out value="${dto.job}"/></td>
<td><c:out value="${dto.salary}"/></td>
<td><c:out value="${dto.deptno}"/></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>Records Not Found</c:otherwise>
</c:choose>