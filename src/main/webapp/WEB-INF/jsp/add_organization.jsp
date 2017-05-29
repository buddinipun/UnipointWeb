<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!-- APP MAIN ==========-->
<link rel="stylesheet" href="../../UnipointWeb/resources/libs/misc/datatables/datatables.min.css">
<style>
.input-sm{
width: 1px;
}

</style>
<main id="app-main" class="app-main">
  <div class="wrap">
	<section class="app-content">
		
		<div class="row">
			<div class="col-md-4">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">Add New Organization</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						
						 <form:form action="organization.process" method="POST" commandName="organization">
							<div class="form-group">
								<label for="exampleInputEmail1">Organization Name</label>
								
								<form:input type="text" path="organizationName" class="form-control" placeholder="Organization"/>
							</div>
							
							
							<button type="submit" class="btn btn-primary btn-md" name="action" value="Add">Submit</button>
						</form:form>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->

			<div class="col-md-8">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">All Organizations</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div class="table-responsive">
							<table id="default-datatable" data-plugin="DataTable" class="table table-striped" cellspacing="0" width="100%">
								<thead>
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>Added date</th>
										<th>Added by</th>
									</tr>
								</thead>
								
								<tbody>
									
						<c:forEach var="element" items="${organizations}">
							<tr>
								<td>${element.orgainizationId}</td>
								<td>${element.organizationName}</td>
								<td>${element.addedDateTime}</td>
								<td>${element.merchantUserByAddedByRef}</td>
								
								
							</tr>
						</c:forEach>
								</tbody>
							</table>
						</div>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->

			
		
   <%@include file="../../resources/include/footer.jsp" %>