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
    Add a Cost
</h1>
 
<c:url var="addAction" value="/user/cost/add" ></c:url>
 
<form:form action="${addAction}" commandName="cost">
<table>
    <c:if test="${!empty cost.costName}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            
            <form:hidden path="id" />
        </td>
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="costName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="costName" />
        </td>
        <td align="left">
						<form:errors path="costName" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    <tr>
        <td>
            <form:label path="paidInterval">
               Paid Interval
            </form:label>
        </td>
        <td>
            <form:input path="paidInterval" />
        </td>
        <td align="left">
						<form:errors path="paidInterval" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    <tr>
        <td>
            <form:label path="system_Costcol">
               System Cost
            </form:label>
        </td>
        <td>
            <form:input path="system_Costcol" />
        </td>
         <td align="left">
						<form:errors path="system_Costcol" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    
     <tr>
        <td>
            <form:label path="costValue">
               value
            </form:label>
        </td>
        <td>
            <form:input path="costValue" />
        </td>
         <td align="left">
						<form:errors path="costValue" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
 
     <tr>
        <td>
            <form:label path="costType">
               Cost Type
            </form:label>
        </td>
        <td>
            <form:select path="costType">
   <form:option value="-1" label="--- Select ---"/>
  <form:option value="1" label="Training"/>
  <form:option value="2" label="Traveling"/>
</form:select>


        </td>
    </tr>
   
    <tr>
        <td colspan="2">
            <c:if test="${!empty cost.costName}">
                <input type="submit"
                    value="Edit User" />
            </c:if>
            <c:if test="${empty cost.costName}">
                <input type="submit"
                    value="Add User" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>Cost List</h3>
<c:if test="${!empty listCosts}">
    <table class="tg">
    <tr>
        <th width="80">User ID</th>
        <th width="120">User Name</th>
        <th width="120">Email</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listCosts}" var="cost">
        <tr>
            <td>${cost.costName}</td>
            <td>${cost.costValue}</td>
            <td>${cost.costType}</td>
            <td><a href="<c:url value='/edit/${cost.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${cost.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
