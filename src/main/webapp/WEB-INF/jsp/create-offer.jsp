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
							<li role="presentation"><a href="#tab-2" aria-controls="tab-1" role="tab" data-toggle="tab">View All</a></li>
							<li role="presentation"><a href="#tab-3"  aria-controls="tab-2" role="tab" data-toggle="tab">Seasonal</a></li>
							<li role="presentation"><a href="#tab-4"  aria-controls="tab-3" role="tab" data-toggle="tab">Time based</a></li>
							<li role="presentation"><a href="#tab-5"  aria-controls="tab-4" role="tab" data-toggle="tab">Location based</a></li>
							<li role="presentation"><a href="#tab-6"  aria-controls="tab-5" role="tab" data-toggle="tab">Recurring</a></li>
							<li role="presentation"><a href="#tab-7"  aria-controls="tab-6" role="tab" data-toggle="tab">Special Events</a></li>
							<li role="presentation"><a href="#tab-8"  aria-controls="tab-7" role="tab" data-toggle="tab">On purchase</a></li>
							<li role="presentation"><a href="#tab-9"  aria-controls="tab-8" role="tab" data-toggle="tab">On Active/Inactive</a></li>
						</ul><!-- .nav-tabs -->

						<!-- Tab panes -->
		
						<div class="tab-content p-lg">
							<div role="tabpanel" class="tab-pane in active fade" id="tab-1">
								<h4 class="m-b-md">Select Offer type</h4>
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
    $('input[type="radio"]').click(function(){
        if($(this).attr("value")=="red"){
            $(".box").not(".red").hide();
            $(".red").show();
        }
        if($(this).attr("value")=="green"){
            $(".box").not(".green").hide();
            $(".green").show();
        }
        if($(this).attr("value")=="blue"){
            $(".box").not(".blue").hide();
            $(".blue").show();
        }
    });
});
</script>
</head>
<body>
    <div>
        <label><input type="radio" name="colorRadio" value="red" id="el08"> General</label>
        <label><input type="radio" name="colorRadio" value="green" id="el08"> Gallery</label>
        <label><input type="radio" name="colorRadio" value="blue" id="el08"> Video</label>
    </div>

								<div class="widget">
								


								
						<div class="tab-content p-h-md p-r-md">
				<div class="col-md-12">
					
				<div class="panel-group accordion" id="accordion" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default red box">
						<div class="panel-heading" role="tab" id="heading-1">
							
								<h4 class="panel-title">General</h4>
							
							
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
							
								<h4 class="panel-title">Gallery</h4>
							
							
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
							<div role="tabpanel" class="tab-pane fade" id="tab-4">
							<div class="row">

												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">
															<strong>Time based</strong>
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

			

			
		</div><!-- .row -->
	</section><!-- .app-content -->
</div><!-- .wrap -->
  <!-- APP FOOTER -->
<%@include file="../../resources/include/footer.jsp" %>