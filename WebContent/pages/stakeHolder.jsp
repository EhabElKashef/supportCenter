<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
<h1>
    Add a User
</h1>
 
<c:url var="addAction" value="/user/stakeHolder/add" ></c:url>
 
<form:form action="${addAction}" commandName="stakeHolder">
<table>
    <c:if test="${!empty stakeHolder.stakeholder_name}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            <form:input path="id" readonly="true" size="8"  disabled="true" />
            <form:hidden path="id" />
        </td>
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="stakeholder_name">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="stakeholder_name" />
        </td>
    </tr>
       
    <tr>
        <td colspan="2">
            <c:if test="${!empty stakeHolder.stakeholder_name}">
                <input type="submit"
                    value="Edit User" />
            </c:if>
            <c:if test="${empty stakeHolder.stakeholder_name}">
                <input type="submit"
                    value="Add User" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>StakeHolder List</h3>
<c:if test="${!empty liststakeHolders}">
    <table class="tg">
    <tr>
        
        <th width="120">User Name</th>
       
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${liststakeHolders}" var="manager">
        <tr>
            
            <td>${manager.stakeholder_name}</td>
            
            <td><a href="<c:url value='/edit/${manager.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${manager.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
