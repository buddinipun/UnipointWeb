<%-- 
    Document   : accept_requests
    Created on : 18-Aug-2016, 00:14:43
    Author     : chinthana
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>


<!-- START X-NAVIGATION VERTICAL -->

<!-- END X-NAVIGATION VERTICAL -->

<!-- START BREADCRUMB -->
<ul class="breadcrumb">
	<li><a href="#">Home</a></li>
	<li><a href="#">Configurations</a></li>
	<li class="active">Manage Customers</li>
</ul>
<!-- END BREADCRUMB -->

<!-- PAGE TITLE -->
<div class="page-title">
	<h2>
		<span class="fa fa-arrow-circle-o-left"></span>Manage Customers
	</h2>
</div>
<!-- END PAGE TITLE -->

<!-- PAGE CONTENT WRAPPER -->
<div class="page-content-wrap">

	<div class="row">
		<div class="col-md-12">
			<!-- START PANEL WITH STATIC CONTROLS -->
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Customer Requests</h3>

				</div>
				<div class="panel-body">


					<div class="row">
						<div class="panel-body panelbody tblstripped"
							style="font-size: 13px;">

							<table class="table table-striped table-hover"
								style="margin-bottom: 0px; padding-bottom: 0px;">

								<tr>
									<th>Request ID</th>
									<th>Customer ID</th>
									<th>Date Time</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Mobile Number</th>
									<th>Action</th>
								</tr>

								<c:forEach var="element" items="${acceptrequests}">
									<form:form action="acceptrequest.process" method="POST"
										commandName="acceptrequest">
										<tr>
											<!-- <td><form:input type="text" value="${element.requestid}"
													id="requestId" path="requestid" /></td> -->

											<td><form:hidden value="${element.requestid}"
													id="requestId" path="requestid" />${element.requestid}</td>
											<td><form:hidden value="${element.unipointCustomerProfile.unipointcustomerid}" id="cusId" path="unipointCustomerProfile" />${element.unipointCustomerProfile.unipointcustomerid}</td>
											<td>${element.requestedDateTime}</td>
											<td>${element.unipointCustomerProfile.customerfirstname}</td>
											<td>${element.unipointCustomerProfile.customerlastname}</td>
											<td>${element.unipointCustomerProfile.mobilephonenumberprimary}</td>
											<td><label class="custom-control custom-checkbox">
													<form:checkbox class="custom-control-input" id="status"
														name="status" path="isAccepted" value="true" /> <span
													class="custom-control-indicator"></span> <span
													class="custom-control-description"></span>
											</label></td>

											<td><input type="submit" name="action" value="Update"
												class="btn" style="float: Right; width: 120px" /></td>
										</tr>
									</form:form>
								</c:forEach>

								<tr>
									<td class="non-hightlight-tr">
										<nav>
											<ul class="pagination">
												<li class="disabled"><a href="#" aria-label="Previous"><span
														aria-hidden="true">&laquo;</span></a></li>
												<li class="active"><a href="#">1 <span
														class="sr-only">(current)</span></a></li>
												<li><a href="#">2</a></li>
												<li><a href="#">3</a></li>
												<li><a href="#">4</a></li>
												<li><a href="#">5</a></li>
												<li><a href="#">6</a></li>
												<li><a href="#" aria-label="Next"><span
														aria-hidden="true">&raquo;</span></a></li>
											</ul>
										</nav>
									</td>

									<td class="non-hightlight-tr"></td>
									<td class="non-hightlight-tr"></td>
									<td class="non-hightlight-tr"></td>
									<td class="non-hightlight-tr"></td>
									<td class="non-hightlight-tr"></td>
									<td class="non-hightlight-tr"></td>
								</tr>

							</table>

						</div>
					</div>
				</div>
			</div>
			<!-- END PANEL WITH STATIC CONTROLS -->


		</div>
	</div>





</div>

</div>
<!-- END PAGE CONTENT WRAPPER -->
</div>
<!-- END PAGE CONTENT -->
</div>
<!-- END PAGE CONTAINER -->

<!-- MESSAGE BOX-->
<div class="message-box animated fadeIn" data-sound="alert"
	id="mb-signout">
	<div class="mb-container">
		<div class="mb-middle">
			<div class="mb-title">
				<span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?
			</div>
			<div class="mb-content">
				<p>Are you sure you want to log out?</p>
				<p>Press No if youwant to continue work. Press Yes to logout
					current user.</p>
			</div>
			<div class="mb-footer">
				<div class="pull-right">
					<a href="pages-login.html" class="btn btn-success btn-lg">Yes</a>
					<button class="btn btn-default btn-lg mb-control-close">No</button>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END MESSAGE BOX-->

<!-- START PRELOADS -->
<!--        <audio id="audio-alert" src="audio/alert.mp3" preload="auto"></audio>
        <audio id="audio-fail" src="audio/fail.mp3" preload="auto"></audio>-->
<!-- END PRELOADS -->

<!--<div class="dash_body_cont" id="style-3">-->


<!-- END SCRIPTS -->


<!--< -------------------------------------------------START INPUT VALIDATION (create schema) ----------------------------->




<!--< -------------------------------------------------END INPUT VALIDATION ----------------------------->

<%@include file="../../resources/include/footer.jsp"%>
</html>






