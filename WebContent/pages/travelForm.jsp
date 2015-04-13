<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page session="false" %>
<c:url var="findStateCitiesURL" value="/travel/rates" />

    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
    <h1>
    Add a Travel Cost
</h1>
 <script type="text/javascript">
 
 var desination = {
		  <c:forEach items="${listDestination}" var="destination">
		  "${destination.id}": {
		    name:"${destination.destinationPeriduim}",
		    cv:"${destination.currency}",
		  },
		  </c:forEach>
		}

 function changeAll(id){
	 $("#currency").val( desination[ $(id).val()].cv);
	
	 $("#perduim").val( desination[ $(id).val()].name);
 }
 
 function sumTotal(){
	 //alert(parseFloat((desination[ $(id).val()].cv)* parseFloat($("#accomodation").val())));
	 alert($("#flightCost").val());
	// alert((desination[ $(id).val()].cv* $("#accomodation").val())+$("#flightCost").val());
	 $("#total").val( (parseFloat($("#currency").val())* parseFloat($("#accomodation").val()))+parseFloat($("#flightCost").val()));
	
	
 }

    $(document).ready(function() {

    $("#destinationId").change(function(){
    	$.getJSON('${findStateCitiesURL}', {
    		countryId : $(this).val(),
			ajax : 'true'
		}, function(data) {

             $("#currency").val(data);
           });
       });
    });

</script>
 
<c:url var="addAction" value="/travel/add" ></c:url>
 
<form:form action="${addAction}" commandName="travelCostForm">
<table>
    <tr>
        <td>
            <label>
               Name
            </label>
        </td>
        <td>
        <form:input path="empName" readonly="true"   disabled="true" />
        
        </td>
       
    </tr>
     
    <tr>
        <td>
            <label>
               Employee Id
            </label>
        </td>
        <td>
        <form:input path="user_id" readonly="true"   disabled="true" />
        <form:hidden path="user_id" />
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
       
       <tr>
      <td width="75" align="right">
    <form:label path="destinationId">
               Destination
            </form:label></td>
    <td>
    <form:select path="destinationId" 
					onchange="changeAll(this);" >
		<c:forEach items="${listDestination}" var="destination">
		 <form:option value="-1" label="--- Select ---"/>
		 <form:option value="${destination.id }" label="${destination.destinationName }"/>
		
		</c:forEach>			
			 
					</form:select>
    </td>
     <td align="left">
						<form:errors path="destinationId" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
 <tr>
      <td width="75" align="right">
    <form:label path="destinationId">
               Currency
            </form:label></td>
    <td>
    <form:input path="currency" readonly="true"   disabled="true" />
    <form:hidden path="currency" />
   </td>
     <td align="left">
						 
						</td> 
 
    </tr>
 
    <tr>
      <td width="75" align="right">
    <form:label path="perduim">
               perduim
            </form:label></td>
    <td>
    <form:input path="perduim" readonly="true"   disabled="true" />
    <form:hidden path="perduim" />
   </td>
     <td align="left">
						 
						</td> 
 
    </tr>
  <tr>
      <td width="75" align="right">
    <form:label path="flightCost">
               Flight Cost
            </form:label></td>
    <td>
    <form:input path="flightCost" onchange="sumTotal()"/>
   </td>
     <td align="left">
						 
						</td> 
 
    </tr>
 <tr>
      <td width="75" align="right">
    <form:label path="accomodation">
               Flight Cost
            </form:label></td>
    <td>
    <form:input path="accomodation" onchange="sumTotal()"/>
   </td>
     <td align="left">
						 
						</td> 
 
    </tr>
 <tr>
      <td width="75" align="right">
    <form:label path="total">
               total
            </form:label></td>
    <td>
    <form:input path="total" />
   </td>
     <td align="left">
						 
						</td> 
 
    </tr>
 
   
    <tr>
        <td colspan="2">
                <input type="submit"
                    value="Add" />
            
        </td>
    </tr>
       
        
    
</table> 
</form:form>
