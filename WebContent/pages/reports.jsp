<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page session="false" %>


<script type="text/javascript" src="http://tinymce.cachefly.net/4.1/tinymce.min.js"></script>
<script type="text/javascript">
tinymce.init({
        selector: "textarea",
        plugins: [
                "advlist autolink autosave link image lists charmap print preview hr anchor pagebreak spellchecker",
                "searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking",
                "table contextmenu directionality emoticons template textcolor paste fullpage textcolor colorpicker textpattern"
        ],

        toolbar1: "newdocument fullpage | bold italic underline strikethrough | alignleft aligncenter alignright alignjustify | styleselect formatselect fontselect fontsizeselect",
        toolbar2: "cut copy paste | searchreplace | bullist numlist | outdent indent blockquote | undo redo | link unlink anchor image media code | insertdatetime preview | forecolor backcolor",
        toolbar3: "table | hr removeformat | subscript superscript | charmap emoticons | print fullscreen | ltr rtl | spellchecker | visualchars visualblocks nonbreaking template pagebreak restoredraft",

        menubar: false,
        toolbar_items_size: 'small',

        style_formats: [
                {title: 'Bold text', inline: 'b'},
                {title: 'Red text', inline: 'span', styles: {color: '#ff0000'}},
                {title: 'Red header', block: 'h1', styles: {color: '#ff0000'}},
                {title: 'Example 1', inline: 'span', classes: 'example1'},
                {title: 'Example 2', inline: 'span', classes: 'example2'},
                {title: 'Table styles'},
                {title: 'Table row 1', selector: 'tr', classes: 'tablerow1'}
        ],

        templates: [
                {title: 'Test template 1', content: 'Test 1'},
                {title: 'Test template 2', content: 'Test 2'}
        ]
});</script>

    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>




<h1>
    Add a Project
</h1>
 
<c:url var="addAction" value="/report/add" ></c:url>
 
<form:form action="${addAction}" commandName="reportForm" >
<table>
    <tr>    
        <td>
            <form:label path="projectId">
               Project
            </form:label>
        </td>
        <td>
            <form:select path="projectId">
   <form:option value="-1" label="--- Select ---"/>
  	 <c:forEach items="${listProjects}" var="project">
		 <form:option value="${project.id }" label="${project.projectName }"/>
		
		</c:forEach>			
	
  
</form:select>


        </td>
        <td align="left">
						<form:errors path="projectId" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
    
    
      <tr>
      <td width="75" align="right">
    <form:label path="srEngineerId">
               SR Engineer 
            </form:label></td>
    <td>
    <form:select path="srEngineerId" 
					multiple="multiple" size="4" >
		<c:forEach items="${listUsers}" var="manager">
		 <form:option value="${manager.id }" label="${manager.name }"/>
		
		</c:forEach>			
			 
					</form:select>
    </td>
     <td align="left">
						<form:errors path="srEngineerId" cssStyle="color:red"></form:errors> 
						</td> 
 
    </tr>
     <tr>
     <td>High Lights</td>
      <td><form:textarea name="content" style="width:20%" path="srHighLights"></form:textarea></td>
      </tr>
      
      <tr>
     <td>Comments</td>
      <td><form:textarea name="content" style="width:20%" path="srComments"></form:textarea></td>
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
