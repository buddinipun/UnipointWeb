

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>UNIPOINT - Dashboard</title>            
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <link rel="icon" href="favicon.ico" type="resources/image/x-icon" />
         

         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    
       
        <link rel="stylesheet" type="text/css" id="theme" href="resources/css/theme-default.css"/> 
        <link rel="stylesheet" type="text/css" id="theme" href="resources/css/bootstrap/bootstrap.min.css"/>
        
         <link rel="stylesheet" type="text/css" id="theme" href="resources/css/bootstrap/bootstrap.min.css"/>
        <link href="resources/css/style.css" rel="stylesheet">            
                     

        
        <script type="text/javascript" src="resources/js/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/jquery/jquery-ui.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/bootstrap/bootstrap.min.js"></script>        
               
        <script type='text/javascript' src='resources/js/plugins/icheck/icheck.min.js'></script>
        <script type="text/javascript" src="resources/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>

        <script type="text/javascript" src="resources/js/plugins/datatables/jquery.dataTables.min.js"></script>
        <!--<script src="/assets/plugins/tableExport-jquery-plugin/tablExport.jquery.json"></script>-->
        <script type="text/javascript" src="resources/js/plugins/tableexport/tableExport.js"></script>
        <script type="text/javascript" src="resources/js/plugins/tableexport/jquery.base64.js"></script>
        <script type="text/javascript" src="resources/js/plugins/tableexport/html2canvas.js"></script>
        <script type="text/javascript" src="resources/js/plugins/tableexport/jspdf/libs/sprintf.js"></script>
        <script type="text/javascript" src="resources/js/plugins/tableexport/jspdf/jspdf.js"></script>
        <script type="text/javascript" src="resources/js/plugins/tableexport/jspdf/libs/base64.js"></script>        
        
        <script type="text/javascript" src="resources/js/settings.js"></script>

        <script type="text/javascript" src="resources/js/plugins.js"></script>        
        <script type="text/javascript" src="resources/js/actions.js"></script>        
        
        <link href="resources/assets/charts/c3/c3.css" rel="stylesheet" type="text/css">

       
        <script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>


        <script src="https://maps.googleapis.com/maps/api/js"></script>
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBTL4TZR392YrhoUdv-OcNfOphrBEM5u-E&callback=initMap"
        type="text/javascript"></script>

        <script type="text/javascript" src="resources/js/jquery-1.11.3.js"></script>
        <script type="text/javascript" src="resources/js/city.js"></script>
        <link href="resources/css/map_adding_style.css" rel="stylesheet" type="text/css">



        <script type="text/javascript" src="resources/assets/charts/d3/d3.min.js" ></script>
        <script type="text/javascript" src="resources/assets/charts/c3/c3.min.js"></script>



  <script type="text/javascript">
    $(document).ready(function(){
      $({property: 0}).animate({property: 100}, {
        duration: 1000,
        step: function() {
          var _percent = Math.round(this.property);
          $("#progress").css("width",  _percent+"%");
          if(_percent == 100) {
            $("#progress").addClass("done");
          }
        },
        complete: function() {
          $("#progress").hide();
        }
      });
    });
  </script>
	<!--loading bar css ends-->


	

  </head>

  <body>

  	<div class="jumbotron login">
  		<div class="container">
  			
  			<div class="row">
  				<div class="col-md-4"></div>

  				<div class="col-md-4">

  				<div class="merchantlogo">
  					UNIPOINT
  				</div>

  					<div class="loginbox">

			  			<p style="color: #ffffff;"><b>Log In</b> to your account</p>
                                                <form action="loginController" method="POST">
                                                    <div class="form-group">
                                                        <input type="text" class="form-control flatbut" id="username" name="username" placeholder="Username" required="Enter valid Username"/>
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="password" class="form-control flatbut" id="password" name="password" placeholder="Password" required="Enter valid password"/>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <button type="submit" name="action" class="btn btn-primary logbut flatbut">Log in</button>
                                                        </div>
                                                    </div>


                                                    <div class="row" style="margin-top: 30px;">
                                                        <div class="col-md-4">
                                                        </div>

                                                        <div class="col-md-4">
                                                            <div class="ortxt">

                                                            </div>
                                                        </div>

                                                        <div class="col-md-4">
                                                        </div>
                                                        <div class="col-md-12">
                                                            <div class="forgetxt" style="margin-top: 15px;">
                                                                Forget your password?
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <!--  
                                                                                                               <div class="row" style="margin-top: 30px;">
                                                                                                                       <div class="col-md-4">
                                                                                                                               <button type="button" class="btn btn-info flatbutlogin"><i class="fa fa-facebook" aria-hidden="true"></i> Twitter</button>
                                                                                                                       </div>
                                               
                                                                                                                       <div class="col-md-4">
                                                                                                                               <button type="button" class="btn btn-primary flatbutlogin"><i class="fa fa-twitter" aria-hidden="true"></i> Facebook</button>
                                                                                                                       </div>
                                               
                                                                                                                       <div class="col-md-4">
                                                                                                                               <button type="button" class="btn btn-danger flatbutlogin"><i class="fa fa-google-plus" aria-hidden="true"></i> Google</button>
                                                                                                                       </div>
                                                    --></form>
									
								 </div> 
								
							
			  			</div>
  				</div>


  				<div class="col-md-4"></div>

  			</div>

  		</div>
  






    <spring:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" var="coreAjax"/>
    <script type="text/javascript" src="${coreAjax}" ></script>

	<spring:url value="/resources/js/bootstrap.min.js" var="coreBootstrap" />
	<script type="text/javascript" src="${coreBootstrap}"></script>


  </body>
</html>