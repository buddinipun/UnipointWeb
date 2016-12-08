<%@page import="com.unipoint.model.UnipointCustomerProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

<!-- APP MAIN ==========-->
<main id="app-main" class="app-main">
<div class="wrap">
	<section class="app-content">

		<div class="row">


			<div class="col-md-12">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">Active Inactive Report</h4>
					</header>
					<!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div class="table-responsive">
							<form:form action="activeInactive.process" method="POST"
								commandName="activeInactive">
								<table id="activeInactive" class="table">
									<thead>
										<tr>
											<th><select name="inactivePeriod" id="inactivePeriod"
												onchange="viewActiveInactive();" class="form-control"
												style="width: 200px;">
													<option value="" selected="selected" disabled = "true">Select
														Inactive Period</option>
													<option value="2">2 Months</option>
													<option value="4">4 Months</option>
													<option value="6">6 Months</option>
													<option value="12">1 Year</option>
													<option value="24">2 Year</option>
											</select> <input type="hidden" id="inacvPrd" name="inacvPrd" value="">
											</th>


											<th><input type="radio" name="sltStatus" id="radio_all"
												value="all" onclick="getSelectedRadioVal(this);" /> <label
												for="radio_alle">All<img class="img-responsive"
													src="../../UnipointWeb/resources/img/blueball.png"
													alt="blue"></label></th>
											<th><input type="radio" name="sltStatus"
												id="radio_active" value="active"
												onclick="getSelectedRadioVal(this);" /> <label
												for="radio_active">Active <img
													class="img-responsive"
													src="../../UnipointWeb/resources/img/greenball.png"
													alt="green"></label></th>
											<th><input type="radio" name="sltStatus"
												id="radio_inactive" value="inactive"
												onclick="getSelectedRadioVal(this);" /> <label
												for="radio_inactive">Inactive <img
													class="img-responsive"
													src="../../UnipointWeb/resources/img/redball.png" alt="red"></label></th>

										</tr>

										<script type="text/javascript">
											document.getElementById("radio_all").disabled = true;
											document.getElementById("radio_active").disabled = true;
											document.getElementById("radio_inactive").disabled = true;
										</script>

										<tr>
											<th>First Name</th>
											<th>Last Name</th>
											<th>Gender</th>
											<th>Last Transaction Date</th>
										</tr>
									<tbody>

										<c:forEach var="element" items="${activeInactiveReports}">

											<tr>

												<td>${element.unipointCustomerProfile.customerfirstname}</td>
												<td>${element.unipointCustomerProfile.customerlastname}</td>
												<td>${element.unipointCustomerProfile.gender}</td>
												<td>${element.dateTime}</td>
												<td></td>
											</tr>

										</c:forEach>

									</tbody>
									</thead>

								</table>

							</form:form>
						</div>
					</div>
					<!-- .widget-body -->
				</div>
				<!-- .widget -->
			</div>
			<!-- END column -->
			<script type="text/javascript">
				// var elements = new Array();
				var elements = {};

				function printM() {
					//alert("Print Function");
				}
				function getSelectedRadioVal(sltStatus) {

					//$("#activeInactive").find("tr:not(:first)").remove();
					$("#activeInactive").find('tr').slice(2).remove()

					<c:forEach var="element" items="${activeInactiveReports}">
					elements = {
						"customerfirstname" : "${element.unipointCustomerProfile.customerfirstname}",
						"customerlastname" : "${element.unipointCustomerProfile.customerlastname}",
						"gender" : "${element.unipointCustomerProfile.gender}",
						"dateTime" : "${element.dateTime}"
					};

					var inActivePeriod = document.getElementById("inacvPrd").value;
					//alert("Inside"+inActivePeriod);	
					var users = "";
					var status = "";
					var imgLink = "";

					var q = new Date();
					var m = q.getMonth() + 1;
					var d = q.getDay();
					var y = q.getYear();
					// var date = new Date(y,m,d);
					var currentDate = new Date().toISOString().slice(0, 10);
					// var dateString = date.toISOString().substr(0,10);

					var lastTrDate = elements.dateTime;
					// var statusTd = r.cells[4].innerHTML;

					var dateArray = new Array();

					dateArray = lastTrDate.split(" ");
					var dtOnly = dateArray[0];
					// var dtOnlyFmted = dtOnly.replace("-",",");
					// //alert(dtOnly);
					// //alert(currentDate);

					var date1 = new Date(currentDate);// Remember, months are 0 based in
					// JS
					var date2 = new Date(dtOnly);

					var currentYear = date1.getFullYear();
					var year2 = date2.getFullYear();
					var currentMonth = date1.getMonth();
					var month2 = date2.getMonth();
					if (currentMonth === 0) { // Have to take into account
						currentMonth++;
						month2++;
					}

					var noOfMonths = (currentYear - year2) * 12
							+ (currentMonth - month2);

					//alert(noOfMonths);
					console.log(noOfMonths);
					console.log(elements.dateTime);
					//alert(elements.customerfirstname);

					if (inActivePeriod <= noOfMonths) {

						status = "Inactive";
						imgLink = "../../UnipointWeb/resources/img/redball.png";
						//alert("inside the status inActive");

					} else {
						status = "Active";
						imgLink = "../../UnipointWeb/resources/img/greenball.png";
						//alert("inside the status Active");

					}
					//alert(status);
					switch (sltStatus.value != "") {

					case (sltStatus.value === "all"):

						var activeTblnewAct = document.getElementById(
								'activeInactive').getElementsByTagName('tbody')[0];
						var row = document.createElement("tr");
						// row.id = r.cells[0].innerHTML;
						var col1 = document.createElement("td");
						col1.type = "text";
						col1.value = elements.customerfirstname;
						col1.innerHTML = elements.customerfirstname;

						var col2 = document.createElement("td");
						col2.type = "text";
						col2.value = elements.customerlastname;
						col2.innerHTML = elements.customerlastname;

						var col3 = document.createElement("td");
						col3.type = "text";
						col3.value = elements.gender;
						col3.innerHTML = elements.gender;

						var col4 = document.createElement("td");
						col4.type = "text";
						col4.value = elements.dateTime;
						col4.innerHTML = elements.dateTime;

						var col5 = document.createElement("td");
						col5.type = "text";
						col5.value = status
						col5.innerHTML = status;

						var col5 = document.createElement("td");
						col5.type = "text";
						//col5.value = status
						//col5.innerHTML = status;

						var img = document.createElement('img');
						img.src = imgLink;
						col5.appendChild(img);

						row.appendChild(col1);
						row.appendChild(col2);
						row.appendChild(col3);
						row.appendChild(col4);
						row.appendChild(col5);
						activeTblnewAct.appendChild(row);

						break;

					case (sltStatus.value === "active"):

						//alert("Inside Active");
						if (status === "Active") {

							var activeTblnewAct = document.getElementById(
									'activeInactive').getElementsByTagName(
									'tbody')[0];
							var row = document.createElement("tr");
							// row.id = r.cells[0].innerHTML;
							var col1 = document.createElement("td");
							col1.type = "text";
							col1.value = elements.customerfirstname;
							col1.innerHTML = elements.customerfirstname;

							var col2 = document.createElement("td");
							col2.type = "text";
							col2.value = elements.customerlastname;
							col2.innerHTML = elements.customerlastname;

							var col3 = document.createElement("td");
							col3.type = "text";
							col3.value = elements.gender;
							col3.innerHTML = elements.gender;

							var col4 = document.createElement("td");
							col4.type = "text";
							col4.value = elements.dateTime;
							col4.innerHTML = elements.dateTime;

							//		var col5 = document.createElement("td");
							//		col5.type = "text";
							//		col5.value = status
							//		col5.innerHTML = status;

							row.appendChild(col1);
							row.appendChild(col2);
							row.appendChild(col3);
							row.appendChild(col4);
							//	row.appendChild(col5);
							activeTblnewAct.appendChild(row);
						}
						break;

					case (sltStatus.value === "inactive"):

						if (status === "Inactive") {

							var activeTblnewAct = document.getElementById(
									'activeInactive').getElementsByTagName(
									'tbody')[0];
							var row = document.createElement("tr");
							// row.id = r.cells[0].innerHTML;
							var col1 = document.createElement("td");
							col1.type = "text";
							col1.value = elements.customerfirstname;
							col1.innerHTML = elements.customerfirstname;

							var col2 = document.createElement("td");
							col2.type = "text";
							col2.value = elements.customerlastname;
							col2.innerHTML = elements.customerlastname;

							var col3 = document.createElement("td");
							col3.type = "text";
							col3.value = elements.gender;
							col3.innerHTML = elements.gender;

							var col4 = document.createElement("td");
							col4.type = "text";
							col4.value = elements.dateTime;
							col4.innerHTML = elements.dateTime;

							//	var col5 = document.createElement("td");
							//	col5.type = "text";
							//	col5.value = status
							//	col5.innerHTML = status;

							row.appendChild(col1);
							row.appendChild(col2);
							row.appendChild(col3);
							row.appendChild(col4);
							//	row.appendChild(col5);
							activeTblnewAct.appendChild(row);
						}
						break;

					// //alert(elements.customerfirstname);
					}
					</c:forEach>

				}
			</script>
			<script
				src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
			<spring:url value="/custom/js/activeInactive.js" var="activeInactive" />
			<script type="text/javascript" src="${activeInactive}"></script>

			<%@include file="../../resources/include/footer.jsp"%>