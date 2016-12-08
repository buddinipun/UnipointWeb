<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!-- APP MAIN ==========-->
<main id="app-main" class="app-main">

<div class="wrap">
	<section class="app-content">

		<div class="widget-header">
			<h2 class="widget-title">Define Loyality Schemes</h2>
		</div>
		<!-- END PAGE TITLE -->

		<!-- PAGE CONTENT WRAPPER -->


		<div class="gallery row">


			<c:forEach var="LoyaltySchemas" items="${LoyaltySchemas}">
				<div class="col-md-3">

					<div class="gallery-item">
						<!-- CONTACT ITEM -->
						<div class="panel panel-default">
							<div class="panel-body profile"
								style="padding: 0px; overflow: hidden;">

								<img
									src="<%=request.getContextPath()%>/${LoyaltySchemas.imageUrl}"
									width="100%" alt="dw">

							</div>
							<div class="panel-body">
								<div class="contact-info">
									
										${LoyaltySchemas.loyaltyPolicy}<br>
										${LoyaltySchemas.updateInterval}<br>
										${LoyaltySchemas.demotingTimePeriod}<br>
										${LoyaltySchemas.minimumPurchaseAmount}

									</p>
								</div>
								<form:form action="schema.define" method="POST"
									commandName="LoyaltyScheme" enctype="multipart/form-data">
									<form:hidden path="schemeId" value="${LoyaltySchemas.schemeId}" id="schemeId" />
									<button type="button" class="btn btn-primary"
										style="width: 49%; margin-top: 10px;" data-toggle="modal"
										data-target="#editcard">Edit Card</button>
									<input type="submit" name="action" value="Delete"
										style="width: 49%; margin-top: 10px;" data-toggle="modal"
										 onclick="return confirm('Are you sure you want to delete this?')">Delete Card</button>
							</div>
							</form:form>
						</div>
						<!-- END CONTACT ITEM -->
					</div>
				</div>

			</c:forEach>

			<div class="col-md-3">
				<div class="gallery-item">
					<!-- CONTACT ITEM -->
					<a href="#" data-toggle="modal" data-target="#newcard">
						<div class="panel panel-default">
							<div class="panel-body" style="height: 325px;">

								<div class="cardicon">
									<i class="fa fa-credit-card fa-5x" aria-hidden="true"></i>
									<div class="cardtxt">Add New Card</div>
								</div>

							</div>
						</div>
					</a>
					<!-- END CONTACT ITEM -->
				</div>

			</div>
		</div>
</div>

<div class="row">
	<div class="col-md-6">
		<!-- START PANEL WITH STATIC CONTROLS -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Points Assign</h3>

			</div>
			<div class="panel-body">


				<div class="row">
					<div class="panel-body panelbody tblstripped"
						style="font-size: 13px;">

						<div class="poinstext">How many points equal to 1 LKR</div>

						<div class="row"
							style="padding-top: 15px; padding-bottom: 15px; padding-left: 20px; padding-right: 20px;">


							<div class="col-md-5">
								<div class="pointbox">+1 Point</div>
							</div>

							<div class="col-md-2">
								<div class="equal">=</div>
							</div>

							<div class="col-md-5">
								<div class="pointbox2">
									<input type="text" class="pointxt" placeholder="01">
									Rupees
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- END PANEL WITH STATIC CONTROLS -->
	</div>



	<div class="col-md-6">
		<!-- START PANEL WITH STATIC CONTROLS -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">General Settings</h3>

			</div>

			<div class="panel-body" style="padding: 0px;">

				<div class="row">
					<div class="col-md-12" style="padding: 10px;">

						<div class="row">
							<div class="col-md-6">
								<p style="font-size: 15px;">Amount of money to be spent to
									earn 1 point</p>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control normtxtin"
									placeholder="Rupees">
							</div>
						</div>

						<div class="row" style="margin-bottom: 20px;">
							<div class="col-md-6">
								<p style="font-size: 15px;">Applicable Merchants</p>
							</div>
							<div class="col-md-6">
								<select class="form-control normtxtin">
									<option>Avirate</option>
									<option>Pizza Hut</option>
									<option>Dominos</option>
									<option>Odel</option>
									<option>Fashion Bug</option>
								</select>
							</div>
						</div>


						<div class="row">
							<div class="col-md-6">
								<p style="font-size: 15px;">Minimum Points to Maintain</p>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control normtxtin"
									placeholder="Points">
							</div>
						</div>

					</div>
				</div>


			</div>
		</div>
		<!-- END PANEL WITH STATIC CONTROLS -->
	</div>
</div>


</div>

</div>
</section>
</div>
<!-- END PAGE CONTENT WRAPPER -->
</div>
<!-- END PAGE CONTENT -->
</div>
<!-- END PAGE CONTAINER --> <!-- MESSAGE BOX-->
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
<!-- END MESSAGE BOX--> <!--edit card modal start-->
<div class="modal fade" id="editcard" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="exampleModalLabel">Edit Card Info</h4>
			</div>
			<div class="modal-body">
				<form>
					<div class="form-group">
						<input type="text" class="form-control modaltxtinput"
							id="edit_card_name" name="edit_card_name" placeholder="Card Name">
					</div>

					<div class="form-group">
						<input type="text" class="form-control modaltxtinput"
							id="edit_scheme_level" name="edit_scheme_level"
							placeholder="scheme_level">
					</div>

					<div class="form-group">
						<input type="text" class="form-control modaltxtinput"
							id="edit_update_interval" name="edit_update_interval"
							placeholder="update_interval">
					</div>

					<div class="form-group">
						<input type="text" class="form-control modaltxtinput"
							id="edit_demot_time" name="edit_demot_time"
							placeholder="Demoting Time Period">
					</div>

					<div class="form-group">
						<input type="text" class="form-control modaltxtinput"
							id="edit_purchase_limit" name="edit_purchase_limit"
							placeholder="Minimum Purchase Limit to Active">
					</div>

					<label for="exampleInputFile">Upload the Loyality Card
						Image</label>
					<p class="help-block">Only JPG, PNG Images are Compatible</p>
					<input type='file' id="edit_imgInp" name="edit_imgInp" /> <img
						id="blah" src="#" alt="your image" height="100" width="200" />
			</div>
			</form>

		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			<button type="button" class="btn btn-primary"
				onclick="EditSchemas();">Save Schema</button>
		</div>
	</div>
</div>
</div>
<!--edit card modal ends--> <!--delete card modal start-->
<div class="modal fade" id="deletecard" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="exampleModalLabel">Delete Card</h4>
			</div>
			<div class="modal-body">
				<p>Do you really want to delete the Loyality Card?</p>
			</div>
			<form method="POST"
				action="/UnipointWebPortal-war/SchemaController?actionType=DeleteSchemas">
				<div class="modal-footer">
					<button type="submit" class="btn btn-default flatbut"
						data-dismiss="modal">Yes</button>
					<button type="submit" class="btn btn-primary flatbut"
						data-dismiss="modal">No</button>
				</div>
			</form>

		</div>
	</div>
</div>

<div class="modal fade" id="newcard" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">

			<form:form action="schema.define" method="POST"
				commandName="LoyaltyScheme" enctype="multipart/form-data">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">Add New Card
						Info</h4>
				</div>
				<div class="modal-body">

					<div class="form-group">

						<form:input path="schemeName" class="form-control modaltxtinput"
							placeholder="Scheme Name" />
					</div>

					<div class="form-group">
						<form:input path="loyaltyPolicy"
							class="form-control modaltxtinput" placeholder="Loyalty Policy" />
					</div>

					<div class="form-group">
						<form:input path="updateInterval"
							class="form-control modaltxtinput" placeholder="Update Interval" />
					</div>

					<div class="form-grouSAvep">
						<form:input path="demotingTimePeriod"
							class="form-control modaltxtinput"
							placeholder="Demoting TimePeriod" />
					</div>
					<br />
					<div class="form-group">
						<form:input path="minimumPurchaseAmount"
							class="form-control modaltxtinput"
							placeholder="Minimum Purchase Amount" />
					</div>

					<div class="form-group">
						<!--<div class="form-group">-->
						<label for="exampleInputFile">Upload the Loyality Card
							Image</label>
						<p class="help-block">Only JPG, PNG Images are Compatible</p>

						<input type="file" name="file">

						<!--				</div> 
                        <label for="exampleInputFile">Upload the Loyality Card Image</label>
                        <p class="help-block">Only JPG, PNG Images are Compatible</p>
                        <input type='file' id="imgInp" name="imgInp" /> 
                        <img id="blah" src="#" alt="your image" height="100" width="200" />-->

					</div>



				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<input type="submit" name="action" value="Add" class="btn" />
				</div>
			</form:form>
		</div>
	</div>
</div>
<!--add card modal ends--> <!-- APP FOOTER -->
<div class="wrap p-t-0">
	<footer class="app-footer">
		<div class="clearfix">
			<ul class="footer-menu pull-right">
				<li><a href="javascript:void(0)">Careers</a></li>
				<li><a href="javascript:void(0)">Privacy Policy</a></li>
				<li><a href="javascript:void(0)">Feedback <i
						class="fa fa-angle-up m-l-md"></i></a></li>
			</ul>
			<div class="copyright pull-left">Copyright RaThemes 2016 &copy;</div>
		</div>
	</footer>
</div>
<!-- /#app-footer --> </main>
<!--========== END app main -->
<%@include file="../../resources/include/footer.jsp"%>
