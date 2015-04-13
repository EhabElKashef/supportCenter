<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="AEthemeWrapper">
  <div class="AEthemeContainer">
    <div>
      <form class="AEform">
        <ul class="liMargin_20">
          <li>
            <h2><span><spring:message code="vfe.techical.error.title"/></span></h2>
            
            <p>${errorMessage}</p>
            <br/>
          </li>
        </ul>
      </form>
    </div>
  </div>
</div>
