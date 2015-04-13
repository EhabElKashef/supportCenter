<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<ul style="list-style:none;line-height:28px;">
<sec:authorize ifAllGranted="ROLE_ADMIN,ROLE_ALL">
	
	<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
		<a href="${homeUrl}">Home</a>
	</li>

	<li><spring:url value="/user/users" var="userListUrl" htmlEscape="true" />
		<a href="${userListUrl}">Users List</a>
	</li>
	<li><spring:url value="/user/projects" var="projectListUrl" htmlEscape="true" />
		<a href="${projectListUrl}">Projects List</a>
	</li>
	<li><spring:url value="/user/stakeHolder" var="stackHolderListUrl" htmlEscape="true" />
		<a href="${stackHolderListUrl}">stackHolder List</a>
	</li>
	<li><spring:url value="/user/cost" var="costListUrl" htmlEscape="true" />
		<a href="${costListUrl}">Cost List</a>
	</li>
	
	<li><spring:url value="/user/notification" var="notificationListUrl" htmlEscape="true" />
		<a href="${notificationListUrl}">Notificatin List</a>
	</li>
	
	
	<li><spring:url value="/user/constraints" var="constraintsListUrl" htmlEscape="true" />
		<a href="${constraintsListUrl}">System Constraints</a>
	</li>
	</sec:authorize>
	<sec:authorize ifAllGranted="ROLE_ALL">
	
	<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
		<a href="${homeUrl}">Home</a>
	</li>

	<li><spring:url value="/user/users" var="userListUrl" htmlEscape="true" />
		<a href="${userListUrl}">Users List</a>
	</li>
	<li><spring:url value="/user/projects" var="projectListUrl" htmlEscape="true" />
		<a href="${projectListUrl}">Projects List</a>
	</li>
	<li><spring:url value="/user/stakeHolder" var="stackHolderListUrl" htmlEscape="true" />
		<a href="${stackHolderListUrl}">stackHolder List</a>
	</li>
	<li><spring:url value="/user/cost" var="costListUrl" htmlEscape="true" />
		<a href="${costListUrl}">Cost List</a>
	</li>
	
	<li><spring:url value="/user/notification" var="notificationListUrl" htmlEscape="true" />
		<a href="${notificationListUrl}">Notificatin List</a>
	</li>
	
	
	<li><spring:url value="/user/constraints" var="constraintsListUrl" htmlEscape="true" />
		<a href="${constraintsListUrl}">System Constraints</a>
	</li>
	<li><spring:url value="/travel/view" var="tarvelListUrl" htmlEscape="true" />
		<a href="${tarvelListUrl}">Add Travel</a>
	</li>
	<li><spring:url value="/travel/ListALL" var="tarvelUrl" htmlEscape="true" />
		<a href="${tarvelListUrl}">Travel List</a>
	</li>
	
	</sec:authorize>
	
	<sec:authorize ifAllGranted="ROLE_USER">
	<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
		<a href="${homeUrl}">Home</a>
	</li>
	<li><spring:url value="/travel/view" var="tarvelListUrl" htmlEscape="true" />
		<a href="${tarvelListUrl}">Add Travel</a>
	</li>
	
	<li><spring:url value="/report/view" var="reportListUrl" htmlEscape="true" />
		<a href="${reportListUrl}">Add Report</a>
	</li>
	
	</sec:authorize>	
	
</ul>
