<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Users Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Phase
</h1>
 
<c:url var="addPhaseAction" value="/user/projectPhase/add" ></c:url>
 
<form:form action="${addPhaseAction}" commandName="phase">
<table>
    <c:if test="${!empty phase.phaseName}">
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
            <form:label path="phaseName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="phaseName" />
        </td>
    </tr>
       <tr>
        <td colspan="2">
            <c:if test="${!empty phase.phaseName}">
                <input type="submit"
                    value="Edit Phase" />
            </c:if>
            <c:if test="${empty phase.phaseName}">
                <input type="submit"
                    value="Add Phase" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>Phases List</h3>
<c:if test="${!empty listProjectPhases}">
    <table class="tg">
    <tr>
        <th width="120">Name</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listProjectPhases}" var="phase">
        <tr>
            <td>${phase.phaseName}</td>
            <td><a href="<c:url value='/edit/${phase.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${phase.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>


<h1>
    Add a Comment Types
</h1>
 
<c:url var="addAction" value="/user/srCommentType/add" ></c:url>
 
<form:form action="${addAction}" commandName="srCommentsType">
<table>
    <c:if test="${!empty srCommentsType.typeName}">
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
            <form:label path="typeName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="typeName" />
        </td>
    </tr>
       <tr>
        <td colspan="2">
            <c:if test="${!empty srCommentsType.typeName}">
                <input type="submit"
                    value="Edit Phase" />
            </c:if>
            <c:if test="${empty srCommentsType.typeName}">
                <input type="submit"
                    value="Add Phase" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>SR Comments Types</h3>
<c:if test="${!empty listSrCommentsType}">
    <table class="tg">
    <tr>
        <th width="120">typeName</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listSrCommentsType}" var="srCommentsType">
        <tr>
            <td>${srCommentsType.typeName}</td>
            <td><a href="<c:url value='/edit/${srCommentsType.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${srCommentsType.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>


<h1>
    Add a Status
</h1>
 
<c:url var="addStatusAction" value="/user/projectStaus/add" ></c:url>
 
<form:form action="${addStatusAction}" commandName="status">
<table>
    <c:if test="${!empty status.statusName}">
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
            <form:label path="statusName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="statusName" />
        </td>
    </tr>
       <tr>
        <td colspan="2">
            <c:if test="${!empty status.statusName}">
                <input type="submit"
                    value="Edit Phase" />
            </c:if>
            <c:if test="${empty status.statusName}">
                <input type="submit"
                    value="Add Phase" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>Phases List</h3>
<c:if test="${!empty listProjectStatus}">
    <table class="tg">
    <tr>
        <th width="120">Name</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listProjectStatus}" var="status">
        <tr>
            <td>${status.statusName}</td>
            <td><a href="<c:url value='/edit/${phase.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${phase.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>


<h1>
    Add a Status
</h1>
 
<c:url var="addDesitationAction" value="/user/Desitation/add" ></c:url>
 
<form:form action="${addDesitationAction}" commandName="desitation">
<table>
    <c:if test="${!empty desitation.destinationName}">
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
            <form:label path="destinationName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="destinationName" />
        </td>
    </tr>
    <tr>
        <td>
            <form:label path="destinationPeriduim">
               Periduim Value
            </form:label>
        </td>
        <td>
            <form:input path="destinationPeriduim" />
        </td>
    </tr>
    
       <tr>
        <td colspan="2">
            <c:if test="${!empty desitation.destinationName}">
                <input type="submit"
                    value="Edit Phase" />
            </c:if>
            <c:if test="${empty desitation.destinationName}">
                <input type="submit"
                    value="Add Phase" />
            </c:if>
        </td>
    </tr>
    
    
</table> 
</form:form>
<br>
<h3>Phases List</h3>
<c:if test="${!empty listProjectStatus}">
    <table class="tg">
    <tr>
        <th width="120">Name</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listDesitation}" var="desitation">
        <tr>
            <td>${desitation.destinationName}</td>
            <td><a href="<c:url value='/edit/${desitation.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${desitation.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>


</body>
</html>