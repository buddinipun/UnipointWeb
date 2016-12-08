<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<link
	href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css"
	rel="stylesheet">
<script
	src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>

<!-- PAGE CONTENT WRAPPER -->
<main id="app-main" class="app-main">
  <div class="wrap">
	<section class="app-content">
	

	<div class="row">
		<div class="col-md-12">
			<!-- START PANEL WITH STATIC CONTROLS -->
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Customer Requests</h3>

				</div>
				
					<table class="table">

						<tr>
							<th>Subscription ID</th>
							<th>Card Number</th>
							<th>Customer First Name</th>
							<th>Customer Last Name</th>
							<th>Phone No.</th>
							<th>Status</th>
							<th>Last Transaction Date</th>
							<th>Update</th>
							<th></th>
						</tr>
						<c:forEach var="element" items="${enabledisablecustomers}">

							<form:form action="enabledisablecustomer.process" method="POST"
								commandName="enabledisablecustomer">
								<div class="row">
									<div class="panel-body panelbody tblstripped"
										style="font-size: 13px;">

										<tr>
											<!--	<td><form:label path="subscriptionid" value="${element.subscriptionid}" id="subId"></form:label></td>-->
											<td><form:hidden value="${element.subscriptionid}"
													id="subscriptionId" path="subscriptionid" />${element.subscriptionid}</td>
											<td>${element.cardnumber}</td>
											<td>${element.unipointCustomerProfile.customerfirstname}</td>
											<td>${element.unipointCustomerProfile.customerlastname}</td>
											<td>${element.unipointCustomerProfile.mobilephonenumberprimary}</td>
											<td>${element.enabled}</td>
											<td>${element.datetime}</td>
											
											<!-- <td><form:checkbox data-toggle="toggle" 
											
													data-on="Enabled" data-off="Disabled" id="status"
													name="status" path="enabled" value="true" /></td>-->

											<td><form:select name="cusStatus" id="cusStatus" class="form-control"
												style="width: 200px;" path="enabled" >
													<option value="" selected="selected">Enable/Disable</option>
													<option value="true">Enable</option>
													<option value="false">Disable</option>  

											 </form:select> </td>
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






