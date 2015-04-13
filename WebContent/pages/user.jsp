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
 
<c:url var="addAction" value="/user/users/add" ></c:url>
 
<form:form action="${addAction}" commandName="manager">
<table>
    <c:if test="${!empty manager.name}">
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
            <form:label path="name">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="name" maxlength="40"/>
        </td>
        <td align="left">
						<form:errors path="name" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    <tr>
        <td>
            <form:label path="email">
               Email
            </form:label>
        </td>
        <td>
            <form:input path="email" maxlength="100"/>
        </td>
        <td align="left">
						<form:errors path="email" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    <tr>
        <td>
            <form:label path="user_id">
               Employee ID
            </form:label>
        </td>
        <td>
            <form:input path="user_id" maxlength="6" />
        </td>
        <td align="left">
						<form:errors path="user_id" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
     <tr>
        <td>
            <form:label path="username">
               Username
            </form:label>
        </td>
        <td>
            <form:input path="username" maxlength="10" />
        </td>
        <td align="left">
						<form:errors path="username" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
 
     <tr>
        <td>
            <form:label path="userType">
               Manager/User
            </form:label>
        </td>
        <td>
            <form:select path="userType">
   <form:option value="NONE" label="--- Select ---"/>
  <form:option value="U" label="Normal User"/>
  <form:option value="M" label="Manager"/>
</form:select>


        </td>
<td align="left">
						<form:errors path="userType" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
  
  
   <tr>
        <td>
            <form:label path="roles">
               Authorizatity 
            </form:label>
        </td>
        <td>
            <form:select path="roles" multiple="multiple" size="4" items="${roleList}">
   </form:select>


        </td>
<td align="left">
						<form:errors path="userType" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
   
    <tr>
        <td colspan="2">
            <c:if test="${!empty manager.name}">
                <input type="submit"
                    value="Edit User" />
            </c:if>
            <c:if test="${empty manager.name}">
                <input type="submit"
                    value="Add User" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>Users List</h3>
<c:if test="${!empty listManagers}">
    <table class="tg">
    <tr>
        <th width="80">User ID</th>
        <th width="120">User Name</th>
        <th width="120">Email</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listManagers}" var="manager">
        <tr>
            <td>${manager.user_id}</td>
            <td>${manager.name}</td>
            <td>${manager.email}</td>
            <td><a href="<c:url value='/edit/${manager.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${manager.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
