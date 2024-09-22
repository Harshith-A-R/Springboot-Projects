<%@ include file ="common/header.jspf" %>
<%@ include file="common/navigationbar.jspf" %>
<div class ="container">
	<h2>Your todo's list</h2>
	
	<table class ="table table-striped ">
		<thead class ="table-dark">
			<tr>
				<th>Description</th>
				<th>TargetDate</th>
				<th>IsDone</th>
				<th></th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetdate}</td>
					<td>${todo.done}</td>
					<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
					<td> <a href="update-todo?id=${todo.id}" class="btn btn-info">UPDATE</a></td>
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href ="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="common/footer.jspf" %>