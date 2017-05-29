<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<<style>
<!--
<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/dropzone.css">

-->
</style>
	<script src="../../UnipointWeb/resources/libs/bower/breakpoints.js/dist/dropzone.min.js"></script>
<!-- APP MAIN ==========-->
<main id="app-main" class="app-main">
  <div class="wrap">
	<!-- CONTENT -->
	<section class="app-content">
		<div class="row">
			<div class="col-md-12">
				<h4 class="m-b-lg">Tabs</h4>
			</div><!-- END column -->

			<div class="col-md-12">
				<div class="widget">
					<div class="m-b-lg nav-tabs-horizontal">
						<!-- tabs list -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#tab-1" aria-controls="tab-3" role="tab" data-toggle="tab">Create Offer</a></li>
							
							<li role="presentation"><a href="#tab-3"  aria-controls="tab-2" role="tab" data-toggle="tab">Seasonal</a></li>
							<li role="presentation"><a href="#tab-4"  aria-controls="tab-3" role="tab" data-toggle="tab">Time based</a></li>
							<li role="presentation"><a href="#tab-5"  aria-controls="tab-4" role="tab" data-toggle="tab">Location based</a></li>
							<li role="presentation"><a href="#tab-6"  aria-controls="tab-5" role="tab" data-toggle="tab">Recurring</a></li>
							<li role="presentation"><a href="#tab-7"  aria-controls="tab-6" role="tab" data-toggle="tab">Special Events</a></li>
							<li role="presentation"><a href="#tab-8"  aria-controls="tab-7" role="tab" data-toggle="tab">On purchase</a></li>
							<li role="presentation"><a href="#tab-9"  aria-controls="tab-8" role="tab" data-toggle="tab">On Active/Inactive</a></li>
							<li role="presentation"><a href="#tab-2" aria-controls="tab-1" role="tab" data-toggle="tab">View All</a></li>
						</ul><!-- .nav-tabs -->

						<!-- Tab panes -->
		
						<div class="tab-content p-lg">
							<div role="tabpanel" class="tab-pane in active fade" id="tab-1">
								<h4 class="m-b-md">Select Offer Template</h4>
							<style type="text/css">
   #el08 { /* Change width and height */
width:4em;
height:4em;
}
    </div>
	</div>
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
 $(".red").hide();
  $(".green").hide();
   $(".blue").hide();

   $("#single").click(function(){
	   $(".red").show();
	   $(".green").hide();
	   $(".blue").hide();
       
   });
   $("#multy").click(function(){
	   $(".red").hide();
	   $(".green").show();
	   $(".blue").hide();
   });
   $("#video").click(function(){
	   $(".red").hide();
	   $(".green").hide();
	   $(".blue").show();
   });
   
   
});
</script>
</head>
<body>
    <div>
        <input type="button" name="colorRadio" value="Single Image" class="btn rounded mw-md btn-primary" id="single">
        <input type="button" name="colorRadio" value="Image Collection" class="btn rounded mw-md btn-primary" id="multy">
        <input type="button" name="colorRadio" value="Video" class="btn rounded mw-md btn-primary" id="video">
    </div>

								<div class="widget">
								


								
						<div class="tab-content p-h-md p-r-md">
				<div class="col-md-12">
					
				<div class="panel-group accordion" id="accordion" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default red box">
						<div class="panel-heading" role="tab" id="heading-1">
							
								<h4 class="panel-title">Single Image</h4>
							
							
						</div>
						
							<div class="panel-body">
								<p>Upload or drag and drop image of your choice</p>
                                                    <div class="row">
                                                        <div class="col-md-12" style="margin-bottom:20px;width:100%;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data"></form>
                                                        </div>
													</div>

						    
											<form:form action="offer.create" method="POST" commandName="Offer" id="formID" enctype="multipart/form-data"> 
												  <div class="form-group">
												    <label for="exampleInputEmail1">Headline</label>
												   
												     <form:input path="offerHeading" class="form-control normtxtin" />
												  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Sub Heading</label>
                                                     <form:input path="offerSubheading" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Description</label>
                                                     <form:textarea path="offerDescription" rows="5" cols="30" class="form-control normtxtin"/>
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Expiration Date</label>
                                                   <form:input path="expiryDate" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Points Allocated</label>
                                                   
                                                    <form:input path="pointsAllocated" class="form-control normtxtin" placeholder="Points allocated for the Entire offer"/>
                                                  </div>

                                                 

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Available Branches</label>
                                                   
                                                    <form:input path="offerAvailableBranches" class="form-control normtxtin" placeholder="Add branches seperated by a ',' Ex: galle, colombo, Kandy" />
                                                  </div>

                                                    <div class="col-md-6"></div>
                                                    <div class="col-md-6">
                                                        <button type="submit" class="btn btn-primary" style="width:100%;font-size:16px;padding:10px;" name="action" value="Add">Create Offer</button>
                                                    </div>
                                                 </form:form>
						</div>
						</div>
						
						<div class="panel panel-default green box">
						<div class="panel-heading" role="tab" id="heading-1">
							
								<h4 class="panel-title">Image Collection</h4>
							
							
						</div>
						
							<div class="panel-body">
								<p>Upload or drag and drop 5 images of your choice</p>
                                                    <div class="row">
                                                            <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" enctype="multipart/form-data" method="post">
                                                         	
                                                         		
                                                            </form>
												
                                                        </div>
                                                        <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data">
                                                            
                                                            </form>
                                                            
                                                        </div>
                                                        

                                                        <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data"></form>
                                                        </div>

                                                        <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data"></form>
                                                        </div>

                                                        <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data"></form>
                                                        </div>

                                                         <div class="col-md-5" style="margin-bottom:20px;">
                                                            <form action="upload.image1" class="dropzone dropzone-mini" style="width:145px;" method="post" enctype="multipart/form-data"></form>
                                                        </div>
                                                        </div>

						    
											<form:form action="offer.create" method="POST" commandName="Offer" id="formID" enctype="multipart/form-data"> 
												  <div class="form-group">
												    <label for="exampleInputEmail1">Headline</label>
												   
												     <form:input path="offerHeading" class="form-control normtxtin" />
												  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Sub Heading</label>
                                                     <form:input path="offerSubheading" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Description</label>
                                                     <form:textarea path="offerDescription" rows="5" cols="30" class="form-control normtxtin"/>
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Expiration Date</label>
                                                   <form:input path="expiryDate" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Points Allocated</label>
                                                   
                                                    <form:input path="pointsAllocated" class="form-control normtxtin" placeholder="Points allocated for the Entire offer"/>
                                                  </div>

                                                 

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Available Branches</label>
                                                   
                                                    <form:input path="offerAvailableBranches" class="form-control normtxtin" placeholder="Add branches seperated by a ',' Ex: galle, colombo, Kandy" />
                                                  </div>

                                                    <div class="col-md-6"></div>
                                                    <div class="col-md-6">
                                                        <button type="submit" class="btn btn-primary" style="width:100%;font-size:16px;padding:10px;" name="action" value="Add">Create Offer</button>
                                                    </div>
                                                 </form:form>
						</div>
						</div>
						<div class="panel panel-default blue box">
						<div class="panel-heading" role="tab" id="heading-1">
							
								<h4 class="panel-title">Video</h4>
							
							
						</div>
						<form:form action="offer.create" method="POST" commandName="Offer" id="formID" enctype="multipart/form-data"> 
							<div class="panel-body">
								<p>Upload or drag and drop image of your choice</p>
                                                    <div class="row">
                                                        <div class="panel-body">
							 <form:input path="videoUrl" class="form-control normtxtin" />
							</div>
													</div>

						    
											
												  <div class="form-group">
												    <label for="exampleInputEmail1">Headline</label>
												   
												     <form:input path="offerHeading" class="form-control normtxtin" />
												  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Sub Heading</label>
                                                     <form:input path="offerSubheading" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Description</label>
                                                     <form:textarea path="offerDescription" rows="5" cols="30" class="form-control normtxtin"/>
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Expiration Date</label>
                                                   <form:input path="expiryDate" class="form-control normtxtin" />
                                                  </div>

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Points Allocated</label>
                                                   
                                                    <form:input path="pointsAllocated" class="form-control normtxtin" placeholder="Points allocated for the Entire offer"/>
                                                  </div>

                                                 

                                                  <div class="form-group">
                                                    <label for="exampleInputEmail1">Available Branches</label>
                                                   
                                                    <form:input path="offerAvailableBranches" class="form-control normtxtin" placeholder="Add branches seperated by a ',' Ex: galle, colombo, Kandy" />
                                                  </div>

                                                    <div class="col-md-6"></div>
                                                    <div class="col-md-6">
                                                        <button type="submit" class="btn btn-primary" style="width:100%;font-size:16px;padding:10px;" name="action" value="Add">Create Offer</button>
                                                    </div>
                                                 </form:form>
						</div>
						</div>
					
				</div><!-- panel-group -->
			
							
						
						
												  

                                                 

                                                 

                                                 
                                                
												 
												 </div><!-- END column -->
						</div>
					 .nav-tabs-vertical
				</div><!-- .widget -->

			
			</p>
							</div><!-- .tab-pane  -->

							<div role="tabpanel" class="tab-pane fade" id="tab-2">
							
                                     		<div class="panel panel-default">
											  <div class="panel-heading" style="background-color:transparent;">
				                                    <h4>Created Offers</h4>
				                                    <h6 style="color:gray;">Created and ongoing offers</h6>
				                                </div>

											 	<div class="panel-body list-group">
											 		<div class="row">
											 			<div class="col-md-8">
											 				<li class="list-group-item">Dapibus ac facilisis in</li>
											 			</div>
											 			<div class="col-md-2">
											 				<li class="list-group-item">
											 					<span class="label label-default">Completed</span>
											 				</li>
											 			</div>
											 			<div class="col-md-1">
											 				<button type="button" class="btn btn-default" style="padding:5px;padding-left:9px;margin-top:4px;">
											 					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
											 				</button>
											 			</div>

											 			<div class="col-md-1">
											 				<button type="button" class="btn btn-default" style="padding:5px;padding-left:9px;margin-top:4px;">
											 					<i class="fa fa-trash-o" aria-hidden="true"></i>
											 				</button>
											 			</div>
											 		</div>

													
													<div class="row">
											 			<div class="col-md-8">
											 				<li class="list-group-item">Dapibus ac facilisis in</li>
											 			</div>
											 			<div class="col-md-2">
											 				<li class="list-group-item">
											 					<span class="label label-success">Ongoing</span>
											 				</li>
											 			</div>
											 			<div class="col-md-1">
											 				<button type="button" class="btn btn-default" style="padding:5px;padding-left:9px;margin-top:4px;">
											 					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
											 				</button>
											 			</div>

											 			<div class="col-md-1">
											 				<button type="button" class="btn btn-default" style="padding:5px;padding-left:9px;margin-top:4px;">
											 					<i class="fa fa-trash-o" aria-hidden="true"></i>
											 				</button>
											 			</div>
											 		</div>

																					  
												</div>
                                     	</div>
                                
							</div><!-- .tab-pane  -->

							<div role="tabpanel" class="tab-pane fade" id="tab-3">
							<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>seasonal_offers </strong>
														</h3>
													</div>

									<div class="row">
										<div class="row">
											<div class="col-md-12">

												<hr class="widget-separator">
												<div class="widget-body">
													<div class="widget">
														<header class="widget-header">
															<h4 class="widget-title">Select Season</h4>
														</header>
														<!-- .widget-header -->
														<hr class="widget-separator">
														<div class="widget-body">
															<div class="table-responsive">
																<table id="default-datatable" data-plugin="DataTable"
																	class="table table-striped" cellspacing="0"
																	width="100%">
																	<thead>
																		<tr>
																			<th>Season</th>
																			<th>Start date</th>
																			<th>End date</th>
																			<th>Activate Season</th>
																			
																		</tr>
																	</thead>

																	<tbody>
																		<tr>
																			<td>Tiger Nixon</td>
																			<td>System Architect</td>
																			<td>Edinburgh</td>
																			<td><a data-toggle="modal" data-id="ISBN564541" title="Add this item" class="open-AddBookDialog btn btn-info" href="#myModal">Select Offer</a></td>
																		</tr>
																		<tr>
																			<td>Garrett Winters</td>
																			<td>Accountant</td>
																			<td>Tokyo</td>
																			<td><a data-toggle="modal" data-id="ISBN564541" title="Add this item" class="open-AddBookDialog btn btn-info" href="#myModal">Select Offer</a></td>
																		</tr>


																	</tbody>

																</table>
																<div class="col-sm-9 col-sm-offset-10">
																	<button type="submit" class="btn btn-info">Save</button>
																</div>
															</div>
														</div>
														<!-- .widget-body --> 
													</div>
													<!-- .widget -->

												</div>
												<!-- .widget -->
											</div>
											</div>
											<!-- END column -->
											<div class="row">
											<div class="col-md-12">
												<div class="widget">
													<header class="widget-header">
														<h4 class="widget-title">Create Season</h4>
													</header>
													<!-- .widget-header -->
													<hr class="widget-separator">
													<div class="widget-body">

														<form class="form-horizontal">
															
															<div class="form-group">
																<label for="email2" class="col-sm-3 control-label">Starting
																	time:</label>
																<div class="col-sm-9">
																	<input type="text" id="datetimepicker5"
																		class="form-control" data-plugin="datetimepicker"
																		data-options="{ defaultDate: '01/01/2017' }">
																</div>
															</div>
															<div class="form-group">
																<label for="textarea1" class="col-sm-3 control-label">Ending
																	time:</label>
																<div class="col-sm-9">
																	<input type="text" id="datetimepicker5"
																		class="form-control" data-plugin="datetimepicker"
																		data-options="{ defaultDate: '3/01/2017' }">
																</div>
															</div>
															<div class="form-group">
																<label for="textarea1" class="col-sm-3 control-label">Customer message:</label>
																<div class="col-sm-9">
																	<textarea class="form-control" id="textarea1"
																		placeholder="Your comment..."></textarea>
																</div>
															</div>
															<div class="row">
																<div class="col-sm-9 col-sm-offset-3">
																	<button type="submit" class="btn btn-success">Save
																		Season</button>
																</div>
															</div>
														</form>
													</div>
													<!-- .widget-body -->
												</div>
												<!-- .widget -->
											</div>
											<!-- END column -->




										</div>
										<!-- END column -->
										<input id="btn_tab2_next" class="btn btn-primary pull-right"
											type="button" value="Next" onclick="tab2_next()"
											style="margin: 25px;"> <input id="btn_tab2_prev"
											class="btn btn-primary pull-left" type="button"
											value="Previous" onclick="tab0_next()" style="margin: 25px;">

									</div>
								</div>
											</div>
							</div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-4">
							<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Time based</strong>
														</h3>
													</div>

													<div class="row">
										<div class="col-md-12">
											<div class="widget">
												<header class="widget-header">
													<h4 class="widget-title">Time based Offer</h4>
												</header>
												<!-- .widget-header -->
												<hr class="widget-separator">
												<div class="widget-body">
													<form class="form-horizontal">

														<div class="form-group">
															<label for="email2" class="col-sm-3 control-label">Starting
																time:</label>
															<div class="col-sm-9">
																<input type="text" id="datetimepicker5"
																	class="form-control" data-plugin="datetimepicker"
																	data-options="{ defaultDate: '01/01/2017' }">
															</div>
														</div>
														<div class="form-group">
															<label for="textarea1" class="col-sm-3 control-label">Ending
																time:</label>
															<div class="col-sm-9">
																<input type="text" id="datetimepicker5"
																	class="form-control" data-plugin="datetimepicker"
																	data-options="{ defaultDate: '3/01/2017' }">
															</div>
														</div>
														<div class="form-group">
															<label for="textarea1" class="col-sm-3 control-label">Comment:</label>
															<div class="col-sm-9">
																<textarea class="form-control" id="textarea1"
																	placeholder="Your comment..."></textarea>
															</div>
														</div>
														<div class="row">
															<div class="col-sm-9 col-sm-offset-3">
																<button type="submit" class="btn btn-success">Save
																	Offer</button>
															</div>
														</div>
													</form>
												</div>
												<!-- .widget-body -->
											</div>
											<!-- .widget -->
										</div>
										<!-- END column -->
										<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
												</div>
											</div>
							</div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-5">
								<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Location based </strong>
														</h3>
													</div>

													<div class="row">
													<form class="form-horizontal">

														<div class="form-group">
															<label for="email2" class="col-sm-3 control-label">Starting
																time:</label>
															<div class="col-sm-9">
																<input type="text" id="datetimepicker5"
																	class="form-control" data-plugin="datetimepicker"
																	data-options="{ defaultDate: '01/01/2017' }">
															</div>
														</div>
														<div class="form-group">
															<label for="textarea1" class="col-sm-3 control-label">Ending
																time:</label>
															<div class="col-sm-9">
																<input type="text" id="datetimepicker5"
																	class="form-control" data-plugin="datetimepicker"
																	data-options="{ defaultDate: '3/01/2017' }">
															</div>
														</div>
														<div class="form-group">
															<label for="textarea1" class="col-sm-3 control-label">Comment:</label>
															<div class="col-sm-9">
																<textarea class="form-control" id="textarea1"
																	placeholder="Your comment..."></textarea>
															</div>
														</div>
											<div class="col-md-12">
												<div class="widget p-lg">
													<h4 class="m-b-lg">Select Avaiable Outlets</h4>
													

													<table class="table">
														<tr>
															<th>#</th>
															<th>Outlet Name</th>
															<th>Address</th>
															<th>Longitude</th>
															<th>Latitude</th>
															<th>Select Outlet</th>
														</tr>
														<tr>
															<td>1</td>
															<td>Mark</td>
															<td>Otto</td>
															<td>@mdo</td>
															<td>@mdo</td>
															<th>
															<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" checked> <label
																		for="cb-10">inline primary</label>
																</div>
															</th>
														</tr>
														<tr>
															<td>2</td>
															<td>Jacob</td>
															<td>Thornton</td>
															<td>@fat</td>
															<td>Thornton</td>
															<td>
															<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" > <label
																		for="cb-10">inline primary</label>
																</div>
															</td>
														</tr>
														<tr>
															<td>3</td>
															<td>Larry</td>
															<td>the Bird</td>
															<td>@twitter</td>
															<td>Thornton</td>
															<td>
															<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" > <label
																		for="cb-10">inline primary</label>
																</div>
															</td>
														</tr>
													</table>
												</div>
												<!-- .widget -->
											</div>
											<!-- END column -->
											<div class="row">
															<div class="col-sm-9 col-sm-offset-10">
																<button type="submit" class="btn btn-success">Save
																	Offer</button>
															</div>
														</div>
													</form>
														<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
												</div>
											</div></div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-6">
								<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Recurring offers </strong>
														</h3>
													</div>
													<div class="widget-body">
													
													<form class="form-horizontal">
													<label for="cb-10">Select Scheam level</label>
													<div class="row">
													<div class="col-sm-9">
													<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" checked="checked"> <label
																		for="cb-10">Schema level 1</label>
																</div>
																</div>
																<div class="col-sm-9">
																<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" checked="checked"> <label
																		for="cb-10">Schema level 2</label>
																</div>
																</div>
																<div class="col-sm-9">
																<div class="checkbox checkbox-primary checkbox-inline">
																	<input type="checkbox" id="cb-10" checked="checked"> <label
																		for="cb-10">Schema level 3</label>
																</div>
																</div>
														<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
													</form>
													</div>
												</div>
											</div></div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-7">
								<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Special offers </strong>
														</h3>
													</div>

													<div class="row">
														<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
												</div>
											</div></div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-8">
								<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>On purchase </strong>
														</h3>
													</div>

													<div class="row">
														<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
												</div>
											</div></div><!-- .tab-pane  -->
							<div role="tabpanel" class="tab-pane fade" id="tab-9">
								<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Active inactive </strong>
														</h3>
													</div>

													<div class="row">
														<input id="btn_tab2_next"
															class="btn btn-primary pull-right" type="button"
															value="Next" onclick="tab2_next()" style="margin: 25px;">
														<input id="btn_tab2_prev"
															class="btn btn-primary pull-left" type="button"
															value="Previous" onclick="tab0_next()"
															style="margin: 25px;">

													</div>
												</div>
											</div></div><!-- .tab-pane  -->
							
						</div><!-- .tab-content  -->
					</div><!-- .nav-tabs-horizontal -->
				</div><!-- .widget -->
			</div><!-- END column -->
			
<!-- View all offers Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog modal-lg">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Select Offer</h4>
      </div>
      <div class="modal-body">
        
        <div class="table-responsive">
							<table id="default-datatable" data-plugin="DataTable" class="table table-striped" cellspacing="0" width="100%">
								<thead>
									<tr>
										<th>ID</th>
										<th>Offer Heading</th>
										<th>Offer sub Heading</th>
										<th>Offer Type</th>
										<th>Offer Issue date</th>
									</tr>
								</thead>
								
								<tbody>
									
						<c:forEach var="element" items="${offers}">
						<form:form action="offer.bind" method="POST" commandName="Offer" id="formID" enctype="multipart/form-data"> 
							<tr>
								
								<td>${element.offerid}</td>
								<td>${element.offerHeading}</td>
								<td>${element.offerSubheading}</td>
								<td>${element.offerType}</td>
								<td>${element.issueDateTime}</td>
								<td><button type="submit" class="btn btn-primary" style="width:100%;font-size:16px;padding:10px;" name="action" value="Add">Select Offer</button></td>
							</tr>
						</form:form>
						</c:forEach>
								</tbody>
							</table>
						</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div> 

  </div>
</div>
			

			
		</div><!-- .row -->
		
	</section><!-- .app-content -->
</div><!-- .wrap -->



  <!-- APP FOOTER -->
  
  <script type="text/javascript">
  $(document).on("click", ".open-AddBookDialog", function () {
	     var myBookId = $(this).data('id');
	     $(".modal-body #bookId").val( myBookId );
	    //$('#myModal').modal('show');
	});
  </script>
<%@include file="../../resources/include/footer.jsp" %>