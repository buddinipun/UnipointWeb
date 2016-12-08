/**
 * 
 * JAVASCRIPT
 */

 var geocoder;
 var map;
 var panorama;

function initialize() {
  geocoder = new google.maps.Geocoder();
  var initialPoint= {lat: 6.916755999999999, lng: 79.86548829999992};
  var sv = new google.maps.StreetViewService();
	document.getElementById('lattitudeID').value = initialPoint.lat
	document.getElementById('longitudeID').value = initialPoint.lng
  panorama = new google.maps.StreetViewPanorama(document.getElementById('google-streetview'));
  
  // Set up the map.
  map = new google.maps.Map(document.getElementById('map'), {
    center: initialPoint,
    zoom: 16,
    streetViewControl: false
    
  });

  // Set the initial Street View camera to the center of the map.
  sv.getPanorama({location: initialPoint, radius: 50}, processSVData);

  // Look for a nearby Street View panorama when the map is clicked.
  // getPanoramaByLocation will return the nearest pano when the
  // given radius is 50 meters or less.
  map.addListener('click', function(event) {
    sv.getPanorama({location: event.latLng, radius: 50}, processSVData);
    
  });
}


var marker;
function processSVData(data, status) {
  if (status === google.maps.StreetViewStatus.OK) {
	
    if (marker) {
        //if marker already was created change positon
        marker.setPosition(data.location.latLng);
       
       document.getElementById('lattitudeID').value = data.location.latLng.lat();
       document.getElementById('longitudeID').value =data.location.latLng.lng();

       
    } else {
        //create a marker
        marker = new google.maps.Marker({
            position: data.location.latLng,
            map: map,
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

      var contentString = "<div id='content'><h4>" + formattedAddress + "</h4><img class='streetview' src='https://maps.googleapis.com/maps/api/streetview?size=400x400&location=" + formattedAddress + "&fov=120&heading=235&pitch=10&key=AIzaSyDyoP_3UjpK3YSJT8g6-ngD1WzFv1seqLY'></div>";

      var infowindow = new google.maps.InfoWindow({
        content: contentString
      });

      if (marker) {
          //if marker already was created change position
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
      marker.addListener('click', function() {
        infowindow.open(map, marker);
  
      });
    } else {
       alert("Geocode was not successful for the following reason: " + status);
    }
  });
}


/**
 * JQUERY
 */

$(document).ready(function() {
  $("form#new-spot").submit(function(event) {
    event.preventDefault();

    // Grab input fields
    var inputtedCountryName = $("input#new-country-name").val();
    var inputtedLocationName = $("input#new-location-name").val();
    
   
	
    // Clear input fields after pinning marker on map
    $("input#new-country-name").val("");
    $("input#new-location-name").val("");
   });
 });
