<%@ include file ="common/header.jspf" %>
<%@ include file="common/navigationbar.jspf" %>
<div class="container">

	<h1>Enter Todos Details</h1>
	<form:form method="post" modelAttribute="todo">
	
		<fieldset class ="mb-3">
		<form:label path="description">Description</form:label>
		<form:input type="text" path="description" required="required"/> 
		<form:errors path="description" cssClass="text-warning"/><br>
		</fieldset>
		
		
		<fieldset class ="mb-3">
		<form:label path="targetdate">Target Date</form:label>
		<form:input type="text" path="targetdate" required="required"/> 
		<form:errors path="targetdate" cssClass="text-warning"/><br>
		</fieldset>
		
		<form:input type="hidden" path="id" /> 
		<form:input type="hidden" path="done" /> 
		 <input type="Submit" class ="btn btn-success">
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>
<script type="text/javascript">

$("#targetdate").datepicker({
    format: 'dd-mm-yyyy',
    startDate: '-3d'

});
</script>

