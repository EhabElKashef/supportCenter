<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Add User</title>  
</head>  
<body>  
 <center>  
  
  <div style="color: teal; font-size: 30px">User</div>  
  
  
  
  <c:url var="userRegistration" value="saveUser.html" />  
  <form:form id="registerForm" modelAttribute="Manager" method="post"  
   action="register">  
   <table width="400px" height="150px">  
    <tr>  
     <td><form:label path="fullUserName">Full Name</form:label>  
     </td>  
     <td><form:input path="fullUserName" />  
     </td>  
    </tr>  
    <tr>  
     <td><form:label path="email">Email</form:label>  
     </td>  
     <td><form:input path="email" />  
     </td>  
    </tr>  
    <tr>  
     <td><form:label path="user_id">userId</form:label>  
     </td>  
     <td><form:input path="user_id" />  
     </td>  
    </tr> 
     <tr>  
     <td><form:label path="userType">User/Manager</form:label>  
     </td>  
     <td><form:input path="userType" />  
     </td>  
    </tr>  
    
    <tr>  
     <td></td>  
     <td><input type="submit" value="Add" /></td>  
    </tr>  
   </table>  
  </form:form>  
  
