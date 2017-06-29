<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
	
	<div class="container">
		<form:form commandName="UserDetails" method="post" action="storeUser">
			<div class="col-xs-6">
				<div class="form-group">
					<label for="Empid">Employee id:</label>
					<form:errors path="Empid" cssStyle="color: #ff0000" />
					<form:input path="Empid" id="Empid" class="form-Control" />
				</div>

				<div class="form-group">
					<label for="Empname">Employee name:</label>
					<form:errors path="Empname" cssStyle="color: #ff0000" />
					<form:input type="Empname" path="Empname" id="Empname"
						class="form-Control" />
				</div>
				<div class="form-group">
					<label for="dept">departmant:</label>
					<form:errors path="dept" cssStyle="color: #ff0000" />
					<form:input type="dept" path="dept"
						id="dept" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="reason">Reason :</label>
					<form:errors path="reason" cssStyle="color: #ff0000" />
					<form:input path="reason" id="reason" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="sd">Start Date:</label>
					<form:errors path="sd" cssStyle="color: #ff0000" />
					<form:input path="sd" id="sd" class="form-Control" />
				</div>
				</div>

				<div class="form-group">
					<label for="ed">End Date :</label>
					<form:errors path="ed" cssStyle="color: #ff0000" />
					<form:input path="ed" id="ed" class="form-Control" />
				</div>
				
				<button type="button" class="btn btn-danger">REGISTER</button>
				
				</div>
		</form:form>
	</div>

</body>
</html>