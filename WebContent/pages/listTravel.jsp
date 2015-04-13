<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
<h3>Travels List</h3>
<p style="text-align: right;float: right ">	
<a href="/m2m/travel/downloadExcel" >Download:<img src="/m2m/image/Excel-icon.png" 
		width="30px" style="padding-top:10px;" />
</a></p>
<c:if test="${!empty travels}">
    <table class="tg">
    <tr>
        <th width="80">User ID</th>
        <th width="120">User Name</th>
        <th width="120">Start Date</th>
        <th width="60">End Date</th>
        <th width="60">Destination</th>
        <th width="60">Staying period</th>
        <th width="60">Flight Cost</th>
        <th width="60">Accoumadtion</th>
        <th width="60">Currency</th>
        <th width="60">Perduim</th>
        <th width="60">Total</th>
    </tr>
    
    <c:forEach items="${travels}" var="tarvel">
        <tr>
            <td>${tarvel.user_id}</td>
            <td>${tarvel.empName}</td>
            <td><fmt:formatDate type="date"  value="${tarvel.startDate}"/></td>
             <td><fmt:formatDate type="date"  value="${tarvel.endDate}"/></td>
             
             <td>${tarvel.destName}</td>
            
            
            <td>
    ${(tarvel.endDate.time - tarvel.startDate.time) / (1000*60*60*24) }
    </td>
            <td>${tarvel.flightCost}</td>
            <td>${tarvel.accomodation}</td>
             <td>${tarvel.currency}</td>
            <td>${tarvel.perduim}</td>
            
           
            
            <td>${tarvel.total}</td>
            
                  
        </tr>
    </c:forEach>
    </table>
</c:if>
