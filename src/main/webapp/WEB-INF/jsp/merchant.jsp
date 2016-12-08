<%-- 
    Document   : ListMerchants
    Created on : Aug 14, 2016, 11:26:34 AM
    Author     : MaxExplode
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Merchants</title>

<meta name="description"
	content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h1>Students Data</h1>
				<form:form action="merchant.process" method="POST" commandName="merchant">
					<table>
						<tr>
							<td>merchantName</td>
							<td><form:input path="merchantName" /></td>
						</tr>
						<tr>
							<td>description</td>
							<td><form:input path="description" /></td>
						</tr>
						<tr>
							<td>emailAddress</td>
							<td><form:input path="emailAddress" /></td>
						</tr>
						<tr>
							<td>address</td>
							<td><form:input path="address" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" name="action"
								value="Add" /> <input type="submit" name="action" value="Edit" />
								<input type="submit" name="action" value="Delete" /> <input
								type="submit" name="action" value="Search" /></td>
						</tr>
					</table>
				</form:form>
				<br>
				<h3>All Merchants</h3>
				<table class="table table-condensed table-hover table-bordered">
					<thead>
						<tr>
							
							<th>ID</th>
							<th>NAME</th>
							<th>ADDRESS</th>
							<th>CONTACT NO</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="element" items="${merchants}">
							<tr>
								<td>${element.merchantId}</td>
								<td>${element.merchantName}</td>
								<td>${element.shortAddress}</td>
								<td>${element.phonenumber}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br /> <a class="btn btn-default" href="AddConsumerServlet">Add
					New Consumer</a>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>
