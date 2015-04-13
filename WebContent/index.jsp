<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div style="margin:10px;">
	<h3>Main Page</h3>
	<p>Welcome <sec:authorize var="loggedIn" access="isAuthenticated()" />
<c:choose>
    <c:when test="${loggedIn}">
            <%= request.getUserPrincipal().getName() %>        
    </c:when>
    <c:otherwise>
    </c:otherwise>
</c:choose>
	</p>
</div>