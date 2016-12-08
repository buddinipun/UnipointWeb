<%-- 
    Document   : Buzz Me
    Created on : 18-Aug-2016, 00:14:43
    Author     : chinthana
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!-- START X-NAVIGATION VERTICAL -->


<!-- PAGE TITLE -->
<main id="app-main" class="app-main">
<div class="wrap">
	<section class="app-content">

		<!-- END PAGE TITLE -->



		<div class="row"></div>


		<div class="row">
			<div class="col-md-12">
				<!-- START PANEL WITH STATIC CONTROLS -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">BuzzMe Users</h3>

					</div>
					<div class="panel-body">


						<div class="row">

							<div class="panel-body">

								<table id="buzzme" class="table datatable">
									<thead>
										<tr>
											<th>ID</th>
											<th>First name</th>
											<th>Last name</th>
											<th>Mobile Number</th>
											<th>Offer name</th>
											<th>Notes</th>
											<th>Contacted</th>
											<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Actions</th>
											<th></th>
										</tr>
									<tbody>

										<c:forEach var="element" items="${buzzedmes}">
											<form:form action="buzzedme.process" method="POST"
												commandName="buzzedme">
												<tr>
													<td><form:hidden value="${element.buzzedmeid}"
															id="buzzedMeId" path="buzzedmeid" />${element.buzzedmeid}</td>
													<td>${element.unipointCustomerProfile.customerfirstname}</td>
													<td>${element.unipointCustomerProfile.customerlastname}</td>
													<td>${element.unipointCustomerProfile.mobilephonenumberprimary}</td>
													<td>${element.offer.offerHeading}</td>
													
													
													<td>

														<div class="form-control">
															<!-- Trigger the modal with a button -->
															<c:choose>
																<c:when test="${not empty element.description}">
																	<button type="button" class="glyphicon glyphicon-file"
																		data-toggle="modal" data-target="#myModal1">View
																		Notes</button>
																		
																	<script type="text/javascript">
																	
																	var notes = "${element.description}";
																		console.log(notes);
																	</script>

																	<!-- Modal -->
																	<div id="myModal1" class="modal fade" role="dialog">
																		<div class="modal-dialog">
																			<!-- Modal content-->
																			<div class="modal-content">
																				<div class="modal-header">
																					<button type="button" class="close"
																						data-dismiss="modal">&times;</button>
																					<h4 class="modal-title">Contacted Info.</h4>
																				</div>
																				<div class="modal-body">
																					<p>Add Your Notes Here.</p>
																					<form:input type="textarea" class="form-control"
																						rows="8" id="disc" name="disc" path="description"
																						value="${element.description}" />
																				</div>
																				<div class="modal-footer">
																					<button type="button" class="btn btn-default"
																						data-dismiss="modal">Close</button>

																					<input type="submit" name="action" value="Update"
																						class="btn" style="float: Right; width: 120px" />
																				</div>
																			</div>

																		</div>
																	</div>

																</c:when>
																<c:otherwise>
																	<button type="button" class="glyphicon glyphicon-pencil"
																		data-toggle="modal" data-target="#myModal2">Add
																		Notes</button>

																	<!-- Modal -->
																	<div id="myModal2" class="modal fade" role="dialog">
																		<div class="modal-dialog">

																			<!-- Modal content-->
																			<div class="modal-content">
																				<div class="modal-header">
																					<button type="button" class="close"
																						data-dismiss="modal">&times;</button>
																					<h4 class="modal-title">Contacted Info.</h4>
																				</div>
																				<div class="modal-body">
																					<p>Some text in the modal.</p>
																					<form:input type="textarea" class="form-control"
																						rows="8" id="discAdd" name="disc"
																						path="description" value="${element.description}" />
																				</div>
																				<div class="modal-footer">
																					<button type="button" class="btn btn-default"
																						data-dismiss="modal">Close</button>

																					<input type="submit" name="action" value="Update"
																						class="btn" style="float: Right; width: 120px" />
																				</div>
																			</div>
																		</div>
																	</div>
																</c:otherwise>
															</c:choose>
													</td>
													<td><label class="custom-control custom-checkbox">
															<c:choose>
																<c:when test="${element.contacted == 'true'}">
																	<form:checkbox class="custom-control-input" id="status"
																		name="status" path="contacted" value="${element.contacted}"
																		checked="checked" disabled="true" />
																	<span class="custom-control-description"></span>
																	<span class="custom-control-indicator"></span>
																	<span class="custom-control-description"></span>
																</c:when>
																<c:otherwise>
																	<form:checkbox class="custom-control-input"
																		id="status1" name="status1" path="contacted"
																		value="${element.contacted}" />
																	<span class="custom-control-indicator"></span>
																	<span class="custom-control-description"></span>
													</label> </c:otherwise> </c:choose></td>


													<!--<c:if test="${element.contacted == 'true'}">
																<form:checkbox class="custom-control-input" id="status"
																	name="status" path="contacted" value="true"
																	checked="checked" />
															</c:if> <span class="custom-control-indicator"></span> <span
															class="custom-control-description"></span>
													</label> <label class="custom-control custom-checkbox"> 
													<form:checkbox class="custom-control-input" id="status1" name="status1"
																path="contacted" value="true" /> <span
															class="custom-control-indicator"></span> <span
															class="custom-control-description"></span>
													</label></td> -->

													<td><input type="submit" name="action" value="Update"
														class="btn" style="float: Right; width: 120px" /></td>
											</form:form>
											<form:form action="buzzedme.process" method="POST"
												commandName="buzzedme">

												<form:hidden value="${element.buzzedmeid}" id="buzzedMeId"
													path="buzzedmeid" />
												<td><input type="submit" name="action" value="Delete"
													class="btn" style="float: Right; width: 120px"
													onclick="return confirm('Are you sure you want to delete this?')" /></td>
											</form:form>
											</tr>
										</c:forEach>
									</tbody>
									</thead>

								</table>

							</div>


						</div>
					</div>


				</div>

			</div>
			<!-- END PAGE CONTENT WRAPPER -->
		</div>
		<!-- END PAGE CONTENT -->
</div>
<!-- END PAGE CONTAINER --> <!--< -------------------------------------------------START INPUT VALIDATION ----------------------------->


<!--< -------------------------------------------------END INPUT VALIDATION ----------------------------->
<%@include file="../../resources/include/footer.jsp"%>
</html>