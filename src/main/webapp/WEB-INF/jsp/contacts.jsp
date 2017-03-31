<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>title</title>
</head>
<body>

<a href="<c:url value="/logout"/>">logout</a>

<h2>title</h2>

<form:form method="post" action="add" commandName="contact">

    <table>
        <tr>
            <td><form:label path="firstname">
                firstname
            </form:label></td>
            <td><form:input path="firstname"/></td>
        </tr>
        <tr>
            <td><form:label path="lastname">
                lastname
            </form:label></td>
            <td><form:input path="lastname"/></td>
        </tr>
        <tr>
            <td><form:label path="email">
                email
            </form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="telephone">
                telephone
            </form:label></td>
            <td><form:input path="telephone"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="addcontact"/></td>
        </tr>
    </table>
</form:form>

<h3>contacts</h3>
<c:if test="${!empty contactList}">
    <table class="data">
        <tr>
            <th>firstname</th>
            <th>email</th>
            <th>telephone</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${requestScope.contactList}" var="contact">
            <tr>
                <td>${contact.lastname}, ${contact.firstname}</td>
                <td>${contact.email}</td>
                <td>${contact.telephone}</td>
                <td><a href="delete/${contact.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
