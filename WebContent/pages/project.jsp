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
    Add a Project
</h1>
 
<c:url var="addAction" value="/user/projects/add" ></c:url>
 
<form:form action="${addAction}" commandName="project">
<table>
    <c:if test="${!empty project.projectName}">
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
            <form:label path="projectName">
               Name
            </form:label>
        </td>
        <td>
            <form:input path="projectName" />
        </td>
        <td align="left">
						<form:errors path="projectName" cssStyle="color:red"></form:errors> 
						</td> 
    </tr>
    <tr>
        <td>
            <form:label path="estimatedTime">
               estimatedTime
            </form:label>
        </td>
        <td>
            <form:input path="estimatedTime" />
        </td>
        <td align="left">
						<form:errors path="estimatedTime" cssStyle="color:red"></form:errors> 
						</td> 
   
    </tr>
    <tr>
    
    <td width="75" align="right"><form:label path="startDate">
               START DATE
            </form:label>
    </td>
						<td><form:input path="startDate" id="demo1" type="text" size="25"/><a href="javascript:NewCal('demo1','ddmmyyyy')"><img src="${pageContext.request.contextPath}/image/cal.gif" width="16" height="16" border="0" alt="Pick a date"></a></td>
    
          <td align="left">
						<form:errors path="startDate" cssStyle="color:red"></form:errors> 
						</td> 
 
           </tr>
     
      <tr>
    
    <td width="75" align="right">
    <form:label path="endDate">
               End DATE
            </form:label></td>
						<td><form:input path="endDate" id="demo2" type="text" size="25"/><a href="javascript:NewCal('demo2','ddmmyyyy')"><img src="${pageContext.request.contextPath}/image/cal.gif" width="16" height="16" border="0" alt="Pick a date"></a></td>
    <td align="left">
						<form:errors path="endDate" cssStyle="color:red"></form:errors> 
						</td> 
 
           </tr>
       <tr>
    
        <td>
            <form:label path="projectStatusId">
               Status
            </form:label>
        </td>
        <td>
            <form:select path="projectStatusId">
   <form:option value="-1" label="--- Select ---"/>
  	 <c:forEach items="${projectStatusList}" var="status">
		 <form:option value="${status.id }" label="${status.statusName }"/>
		
		</c:forEach>			
	
  
</form:select>


        </td>
        <td align="left">
						<form:errors path="projectStatusId" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    
    
      <tr>
      <td width="75" align="right">
    <form:label path="managerId">
               Manager
            </form:label></td>
    <td>
    <form:select path="managerId" 
					multiple="multiple" size="4" >
		<c:forEach items="${listManagers}" var="manager">
		 <form:option value="${manager.id }" label="${manager.name }"/>
		
		</c:forEach>			
			 
					</form:select>
    </td>
     <td align="left">
						<form:errors path="managerId" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    <tr>
      <td width="75" align="right">
    <form:label path="managerId">
               StakeHolder
            </form:label></td>
    <td>
    <form:select path="stakeholders" 
					multiple="multiple" size="4" items="${stakeHolderList}" itemLabel="stakeholder_name" itemValue="id">
			 
					</form:select>
    </td>
     <td align="left">
						<form:errors path="stakeholders" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
 
    <tr>
        <td colspan="2">
            <c:if test="${!empty project.projectName}">
                <input type="submit"
                    value="Edit Project" />
            </c:if>
            <c:if test="${empty project.projectName}">
                <input type="submit"
                    value="Add Project" />
            </c:if>
        </td>
    </tr>
      
</table> 
</form:form>
<br>
<h3>Project List</h3>
<c:if test="${!empty listProject}">
    <table class="tg">
    <tr>
        <th width="80">User ID</th>
        <th width="120">User Name</th>
        <th width="120">Email</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listProject}" var="project">
        <tr>
            <td>${project.projectName}</td>
            <td>${project.startDate}</td>
             <c:forEach items="${projectStatusList}" var="status">
             <c:if test="${project.projectStatusId==status.id}">
            <td>${status.statusName}</td>
            </c:if>
            </c:forEach>
            <td><a href="<c:url value='/edit/${project.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${project.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
   