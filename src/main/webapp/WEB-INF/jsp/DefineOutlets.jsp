<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/material-design-iconic-font/dist/css/material-design-iconic-font.css">
	<!-- build:css ../assets/css/app.min.css -->
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/animate.css/animate.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/fullcalendar/dist/fullcalendar.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/perfect-scrollbar/css/perfect-scrollbar.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/bootstrap.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/core.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/app.css">
	<!-- endbuild -->
	
	<script src="../../UnipointWeb/resources/libs/bower/breakpoints.js/dist/breakpoints.min.js"></script>
<script>
		Breakpoints();
	</script>
        


 <!-- PAGE TITLE -->

             
                <!-- END PAGE TITLE --> 
<main id="app-main" class="app-main">
  <div class="wrap">
	<section class="app-content">
	 <div class="wrap">
	<section class="app-content">      
                    <div class="widget-header">           
                    <h2 class="widget-title"> Define Outlets</h2> 
                    </div>

                    <a href="#addplace"><button type="button" class="btn btn-primary"><i class="fa fa-plus" aria-hidden="true"></i> Add New Outlet</button></a>

                    <a href="#"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal"><i class="fa fa-plus" aria-hidden="true"></i> Add Outlet Manager</button></a>
					<hr>
					
					<!-- START DATATABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">All Outlets</h3>
                                                                        

                                </div>
                                <div class="panel-body">
                                    <table id="customers2" class="table table-striped table-hover">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Name</th>
                                                <th>Phone number1</th>
                                                <th>Phone number2</th>
                                                <th>Fax</th>
                                                <th>Address</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                              <c:forEach var="outlets" items="${outlets}">

                                        <tr>
                                            <td>${outlets.outletid}</td>
                                            <td>${outlets.outletname}</td>
                                            <td>${outlets.phone1}</td>
                                            <td>${outlets.phone1}</td>
                                            <td>${outlets.fax}</td>
                                            <td>${outlets.address}</td>
                                           
                                            
                                        </tr>
                                    </c:forEach>
                                        
                                        </tbody>
                                    </table>                                    

                                </div>
                            </div>
                            <!-- END DATATABLE EXPORT --> 
                            
                            
                              <!-- START USER TABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Outlet Managers</h3>
                                                                      

                                </div>
                                <div class="panel-body">
                                    <table id="outletUsers" class="table table-striped table-hover">
                                        <thead>
                                            <tr>
                                                <th>First Name</th>
                                                <th>Last Name</th>
                                                <th>NIC Number</th>
                                                <th>Phone number</th>
                                                <th>E-mail Address</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>

                                            </tr>
                                        </thead>
                                        
                                    </table>                                    

                                </div>
                            </div>
                            <!-- END DATATABLE EXPORT --> 
							
		<div class="row">
			
				<div class="panel panel-default">
                                <div class="panel-heading" id="addplace">
                                    <h3 class="panel-title">Add a Outlet</h3>

                                </div>
                                <div class="panel-body" id="exportTable" style="display: none;">

                                </div>
                                <div class="panel-body panel-body-table">

                                    <div class="col-md-6">

                                        <form:form action="outlet.process" method="POST" commandName="outlet">

                                            <div class="form-group col-md-12" id="new-spot">
                                                <label for="new-location-name">City and Region</label>
                                                <input type="text" class="form-control normtxtin" id="new-location-name" placeholder="Ex. Mount Lavinia, OR" >
                                                
                                            </div>
                                            <div class="form-group">
                                                <label for="new-location-name">Country</label>
                                                <input type="text" class="form-control normtxtin" id="new-country-name" placeholder="Ex. Sri Lanka" >
                                            </div>
                                            <div class="form-group">
                                                <label for="new-location-name">Outlet Name</label>
                                               
                                                 <form:input path="outletname" class="form-control normtxtin" placeholder="Outlet Name" />
                                            </div>
                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Postal Code</label>
                                                
                                                <form:input path="postalcode" class="form-control normtxtin" placeholder="Postal Code" />
                                            </div>
                                            
                                            <div class="form-group col-md-8">
                                                <label for="new-location-name">Address Line 1</label>
                                                
                                                <form:input path="address" class="form-control normtxtin" placeholder="Address Line 1" />
                                            </div>
                                            <div class="form-group col-md-12" style="padding-left:0px;">
                                                <label for="new-location-name">Address Line 2</label>
                                               
                                                <form:input path="address" class="form-control normtxtin" placeholder="Address Line 2" />
                                            </div>
                                            
                                            <div class="form-group col-md-4" style="padding-left:0px;">
                                                <label for="new-location-name">Phone Number 1</label>
                                               
                                                <form:input path="phone1" class="form-control normtxtin" placeholder="Phone Number 1" />
                                            </div>

                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Phone Number 2</label>
                                                
                                                <form:input path="phone2" class="form-control normtxtin" placeholder="Phone Number 2" />
                                            </div>
                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Fax Number</label>
                                                
                                                <form:input path="fax" class="form-control normtxtin" placeholder="Fax Number" />
                                            </div>

                                            <div class="form-group col-md-6" style="padding-left:0px;">
                                                <label for="new-location-name">Latitude</label>
                                                
                                                <form:input path="lattitude" class="form-control normtxtin" placeholder="Lattitude" id="lattitudeID" />
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label for="new-location-name">Longitude</label>
                                                
                                                <form:input path="longitude" class="form-control normtxtin" placeholder="Longitude" id="longitudeID" />
                                            </div>
                                            <div class="form-group">
                                                <label for="new-location-name">Email Address</label>
                                                
                                                <form:input path="emailaddress" class="form-control normtxtin" placeholder="Email Address" />
                                            </div>
                                            <div class="form-group">
                                                <label for="new-location-name">Category</label>
                                               
                                                <form:input path="category" class="form-control normtxtin" placeholder="Category" />
                                            </div>

                                            <div class="form-group col-md-6" style="padding-left:0px;">
                                                <label for="new-location-name">Opening Time</label>
                                               
                                                <form:input path="openinghours" class="form-control normtxtin" placeholder="Open Hours" />
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label for="new-location-name">Closing Time</label>
                                                
                                                <form:input path="closinghours" class="form-control normtxtin" placeholder="Closing Hours" />
                                            </div>

                                            <div class="form-group">
                                                <label for="new-location-name">Web Site Address</label>
                                                
                                                <form:input path="website" class="form-control normtxtin" placeholder="Web Site Address" />
                                            </div>

                                            <div class="form-group">
                                                <label for="new-location-name">Description</label>
                                                <form:textarea id="id" class="form-control normtxtin" path="outletdescription" placeholder="Outlet Description"/>
                                            </div>

                                            <div class="form-group">
                                                <div class="form-group">
                                                    <input type="submit" name="action" value="Add" class="btn" style="float: Right; width: 120px"/>
                                                </div>
                                            </div>

                                        </form:form>
                                    </div>
<div class="col-md-6">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">Map Marker</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div id="google-map-2" style="width: 100%;height: 400px;"></div>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->


                                                                      

                                </div>
                            </div>
			

			<
</div>
			<div class="col-md-12">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">Street View</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div id="google-streetview" style="width: 100%;height: 400px;"></div>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->
		</div><!-- .row -->
	</section><!-- .app-content -->
</div><!-- .wrap -->
 <!--edit outlet details modal start-->
        <div class="modal fade" id="editOutletModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="editOutletModalLabel">Edit Outlet Details</h4>
                    </div>
                     <form  method="post" style="margin-top:15px;" action="EditOutlet" >
                    <div class="modal-body">
                       
                        <div class="form-group">
                           
                            <label for="new-location-name">Outlet Name</label>
                            <input type="text"  class="form-control normtxtin" id="outletName" name="outletName" placeholder="Outlet Name">
                            <input type="hidden" name="outletid">
                        </div>
                        <div class="form-group">
                            <label for="new-location-name">Address Line 1</label>

                            <input type="text"  class="form-control normtxtin" id="Addresss" name="Addresss" placeholder="Address Line 1">
                        </div>
                        <div class="form-group col-md-8" style="padding-left:0px;">
                            <label for="new-location-name">Address Line 2</label>
                            <input type="text" class="form-control normtxtin" id="exampleInputPassword1" placeholder="Address Line 2">
                        </div>

                        <div class="form-group col-md-4">
                            <label for="new-location-name">Postal Code</label>
                            <input type="text" class="form-control normtxtin" id="postalCode" name="postalCode" placeholder="Postal Code">
                        </div>

                        <div class="form-group col-md-4" style="padding-left:0px;">
                            <label for="new-location-name">Phone Number 1</label>
                            <input type="text" class="form-control normtxtin" id="phoneNumber1" name="phoneNumber1" placeholder="Phone Number 1" >
                        </div>

                        <div class="form-group col-md-4">
                            <label for="new-location-name">Phone Number 2</label>
                            <input type="text" class="form-control normtxtin" id="phoneNumber2" name="phoneNumber2" placeholder="Phone Number 2">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="new-location-name">Fax Number</label>
                            <input type="text" class="form-control normtxtin" id="faxNumber" name="faxNumber" placeholder="Fax Number">
                        </div>

                        <div class="form-group col-md-6" style="padding-left:0px;">
                            <label for="new-location-name">Lattitude</label>
                            <input type="text" class="form-control normtxtin" id="lattitudeID" name="lattitude" placeholder="Lattitude" >
                        </div>
                        <div class="form-group col-md-6">
                            <label for="new-location-name">Longitude</label>
                            <input type="text" class="form-control normtxtin" id="longitudeID" name="longitude" placeholder="Longitude">
                        </div>

                        <div class="form-group">
                            <label for="new-location-name">Email Address</label>
                            <input type="text" name="emailAdderss" placeholder="Email Address">
                        </div>


                        <div class="form-group">
                            <label for="new-location-name">Category</label>
                            <input type="text" class="form-control normtxtin" id="category" name="category" placeholder="Category">
                        </div>

                        <div class="form-group col-md-6" style="padding-left:0px;">
                            <label for="new-location-name">Opening Time</label>
                            <input type="time" class="form-control normtxtin" id="openingTime" name="openingTime" placeholder="Open Hours" >
                        </div>
                        <div class="form-group col-md-6">
                            <label for="new-location-name">Closing Time</label>
                            <input type="time" class="form-control normtxtin" id="closingTime" name="closingTime" placeholder="Closing Hours">
                        </div>

                        <div class="form-group">
                            <label for="new-location-name">Web Site Address</label>
                            <input type="text" class="form-control normtxtin" id="webSite" name="webSite" placeholder="Web Site Address">
                        </div>

                        <div class="form-group">
                            <label for="new-location-name">Description</label>
                            <textarea class="form-control normtxtin" rows="3" placeholder="Description"></textarea>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-default">Save</button>
                    </div>
            </form>
                </div>
            </div>
        </div>
                       
        <!-- add new outlet manager modal ends-->
		
		<!--add new outlet manager modal start-->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Add Outlet Manager</h4>
                    </div>
                    <form:form action="manager.define" method="POST" commandName="merchantUser" enctype="multipart/form-data">
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email</label>
                             <form:input path="emailaddress" class="form-control modaltxtinput" placeholder="Organization Name" />
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">First Name</label>
                           	<form:input path="firstname" class="form-control modaltxtinput" placeholder="First Name" />
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Last Name</label>
                             <form:input path="lastname" class="form-control modaltxtinput" placeholder="Last Name" />
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Username</label>
                             <form:input path="username" class="form-control modaltxtinput" placeholder="Username" />
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                             <form:input path="nicNumber" class="form-control modaltxtinput" placeholder="Password" />
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">NIC Number</label>
                             <form:input path="nicNumber" class="form-control modaltxtinput" placeholder="Nic Number" />
                        </div>
				</div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" value="Add">Add Manager</button>
                    </div>
                    </form:form>
                </div>
            </div>
        </div>
        <!-- add new outlet manager modal ends-->
<script>
	// Google maps
	var map1, map2, panorama;
	function initMap() {
		var myLatLng = { lat: 6.916755999999999, lng: 79.86548829999992 };
	
		document.getElementById('lattitudeID').value = myLatLng.lat
		document.getElementById('longitudeID').value = myLatLng.lng
		var sv = new google.maps.StreetViewService();
		panorama = new google.maps.StreetViewPanorama(document.getElementById('google-streetview'));
		 // Set the initial Street View camera to the center of the map.
        sv.getPanorama({location: myLatLng, radius: 50}, processSVData);
		// initialize map1
		map1 = new google.maps.Map(document.getElementById('google-map-2'), {
			center: myLatLng,
			zoom: 16,
			streetViewControl: false
			
		});
		 
		// initialize map2
		map2 = new google.maps.Map(document.getElementById('google-map-2'), {
			center: myLatLng,
			zoom: 12,
			fullscreenControl: true
		});
		
		// the popup pane that appears when the marker is clicked
		var popupContent = '<strong>This is our Location<br>welcome to you</strong>';

		var infoWindow = new google.maps.InfoWindow({
			content: popupContent,
			maxWidth: 300
		});
		
		map2.addListener('click', function(event) {
		  sv.getPanorama({location: event.latLng, radius: 50}, processSVData);
    
  });
		
		
var marker;
function processSVData(data, status) {
  if (status === google.maps.StreetViewStatus.OK) {
	
    if (marker) {
        //if marker already was created change positon
      
       document.getElementById('lattitudeID').value = data.location.latLng.lat();
       document.getElementById('longitudeID').value =data.location.latLng.lng();

       
    } else {
        //create a marker
        marker = new google.maps.Marker({
            position: data.location.latLng,
            map: map2,
            draggable: true,
            title: data.location.description
        });
        
    }
    

    panorama.setPano(data.location.pano);
    panorama.setPov({
    heading: 270,
    pitch: 0
    });
    panorama.setVisible(true);

    marker.addListener('click', function() {
    
    document.getElementById('lattitudeID').value = data.location.latLng;
  	document.getElementById('longitudeID').value = location.lng();
      
      if (results[0]) {
          alert("Location: " + results[0].formatted_address + "\r\nLatitude: " + e.latLng.lat() + "\r\nLongitude: " + e.latLng.lng());
      
      }
   
      var markerPanoID = data.location.pano;
      // Set the Pano to use the passed panoID.
      panorama.setPano(markerPanoID);
      panorama.setPov({
        heading: 270,
        pitch: 0
      });
      panorama.setVisible(true);
    });
  } else {
    console.error('Street View data not found for this location.');
  }
}

var marker;

function codeAddress() {
		
  // Get address from form
  var address = $("input#new-location-name").val();
  geocoder.geocode( { 'address': address}, function(results, status) {
    if (status == google.maps.GeocoderStatus.OK) {
      var location = results[0].geometry.location;
      map.setCenter(location);
      
      	document.getElementById('lattitudeID').value = location.lat()
  	document.getElementById('longitudeID').value = location.lng()
  		
  	
     
      var formattedAddress = results[0].formatted_address;
      var placeId = results[0].place_id;
	

      if (marker) {
          //if marker already was created change position
		  alert(location);
          marker.setPosition(location);
         
      } else {
          //create a marker
          marker = new google.maps.Marker({
              position: location,
              map: map,
              draggable: true
             
          });
      document.getElementById('lattitudeID').value = location.lat();
  	  document.getElementById('longitudeID').value = location.lng();
      }
     

      // Add eventlistner to zoom 8x on click
      
    } else {
       alert("Geocode was not successful for the following reason: " + status);
    }
  });
}
		// the marker shown at myLatLng (map center)
		var marker = new google.maps.Marker({
			position: map2.getCenter(),
			map: map2,
			title: 'Welcome To Cairo',
			draggable: true
		});

		// listen for click events on the marker and open the infoWindow
		marker.addListener('click', function(){
			infoWindow.open(map2, marker);
		});

		

	}; // End initMap()
</script>
<script src="https://maps.googleapis.com/maps/api/js?callback=initMap" async defer></script>
 <%@include file="../../resources/include/footer.jsp" %>





