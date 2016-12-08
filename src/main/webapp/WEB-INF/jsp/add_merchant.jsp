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
						<h4 class="widget-title">Manage Merchant</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body" class="col-sm-5">
						 <form:form action="merchantuser.process" method="POST" commandName="merchant" name="merchantform" class="form-horizontal">

                                    <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Merchant Name</label>
										<div class="col-sm-5">
                                        <form:select  path="organization" class="form-control normtxtin">
										<form:option value="NONE"> --SELECT--</form:option>
										<c:forEach var="element" items="${organizations}">
    										<form:option value="${element.orgainizationId}">${element.organizationName}</form:option>
										</c:forEach>		
										</form:select>
        								</div>
                                    </div>
									
                                   
                                   <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Description</label>
										<div class="col-sm-5">
                                         <form:textarea id="id" class="form-control normtxtin" path="description" placeholder="Merchant Description"/>
										</div>
                                    </div>
									
									<div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Website</label>
										<div class="col-sm-5">
                                        <form:input path="website" class="form-control normtxtin" />
										</div>
                                    </div>
                                    
                                    <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Phone Number</label>
										<div class="col-sm-5">
                                        <form:input path="phonenumber" class="form-control normtxtin" />
										</div>
                                    </div>
                                    
                                    <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">E-mail Address</label>
										<div class="col-sm-5">
                                        <form:input path="emailAddress" class="form-control normtxtin" />
										</div>
                                    </div>
                                    
                                    <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Location</label>
										<div class="col-sm-5">
                                        <form:input path="shortAddress" class="form-control normtxtin" />
										</div>
                                    </div>
                                    
                                    <div class="form-group" id="new-spot">
                                        <label for="#" class="col-sm-2 col-sm-offset-2 control-label">Country</label>
										<div class="col-sm-5">
                                        <form:input path="country" class="form-control normtxtin" />
										</div>
                                    </div>
									 <div class="form-group" id="new-spot">
                                        
										<div class="col-sm-5">
										<div class="col-sm-2 col-sm-offset-2 control-label">
                                    <button type="submit" class="btn btn-primary btn-md">Submit</button>
										</div>
										</div>
									</div>
                                </form:form>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->
			
			
				<div class="col-md-12">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">View All Merchants</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div class="table-responsive">
						<form:form action="activeInactive.process" method="POST"
						commandName="activeInactive">
						<table id="activeInactive" class="table-responsive">
							<thead>
								
								<tr>
                                        <th>Merchant Name</th>
                                        <th>Description</th>
                                        <th>Merchant Category</th>
                                        <th>Web Address</th>
                                        <th>Phone Number</th>
                                        <th>E-mail Address</th>
                                        <th>Location</th>
                                        <th>Country</th>
                                        
                                    </tr>
							<tbody>

								<c:forEach var="merchant" items="${merchants}">

                                        <tr>
                                            <td>${merchant.merchantName}</td>
                                            <td>${merchant.description}</td>
                                            <td>${merchant.merchantCategoryRefId}</td>
                                            <td>${merchant.website}</td>
                                            <td>${merchant.phonenumber}</td>
                                            <td>${merchant.emailAddress}</td>
                                            <td>${merchant.shortAddress}</td>
                                            <td>${merchant.country}</td>
                                            
                                        </tr>
                                    </c:forEach>

							</tbody>
							</thead>

						</table>
					</form:form>	
						</div>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->
			
  		
  <%@include file="../../resources/include/footer.jsp" %>
