<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" 	uri="http://www.springframework.org/tags"%>
	<!-- LoginContents -->
<c:url value="/login" var="loginUrl" />
<form action="${loginUrl}" method="post" id="loginForm">
<c:if test="${param.error != null}">
	<div class="alert alert-error">
		Failed to login.
		<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
			Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
		</c:if>
	</div>
</c:if>
<c:if test="${param.logout != null}">
	<div class="alert alert-success">You have been logged out.</div>
</c:if>
<div class="login">
	<div class="login_title"><s:message code="login.userNameLabel" text="User Name"/>:</div>
	<div class="login_field">
		<input type='text' name='username' value=''
			class="ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all" />
	</div>
	<div class="login_title"><s:message code="login.passwordLabel" text="Password"/>:</div>
	<div class="login_field">
		<input type='password' name='password'
			class="ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all" />
	</div>
	
	<div class="loginButtion">
			<button id="j_idt22" name="j_idt22"
				class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only"
				type="submit">
				<span class="ui-button-text"><s:message code="login.loginLabel" text="Login"/></span>
			</button>
		</div>
	 
		<div class="rememberMe">
			<input id="_spring_security_remember_me" name="_spring_security_remember_me" type="checkbox"/>
			<label for="_spring_security_remember_me"> <s:message code="login.rememberMeLabel"/></label>
		</div>
	
	 
	</div>
</form>
<script>
	$("#loginForm").validate();
</script>