<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="resources/css/theme-default.css"/> 
        <link href="style.css" rel="stylesheet">            
        <!-- EOF CSS INCLUDE -->

        <!-- Load c3.css -->
        <link href="resources/assets/charts/c3/c3.css" rel="stylesheet" type="text/css">

        <!-- Load d3.js and c3.js -->
        <script src="resources/assets/charts/d3/d3.min.js" charset="utf-8"></script>
        <script src="resources/assets/charts/c3/c3.min.js"></script>
                  
           <!-- START X-NAVIGATION VERTICAL -->
                                <ul class="breadcrumb">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Reports</a></li>
                    <li class="active">Campaings ROI report</li>
                </ul>
                <!-- END BREADCRUMB -->
                
                <!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2 style="margin-right:10px;"> Campaings ROI report</h2> 

                    

                </div>
                <!-- END PAGE TITLE -->                
                
                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                
                    
                    
                    <div class="row">
                        <div class="col-md-12">
                            
                            <!-- START DATATABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Campaign Results Overview</h3>
                                </div>
                                <div class="panel-body">
                                     
                                    <div class="row">
                                        <div class="col-md-3">
                                            
                                            <div id="chart" style="margin-top:20px;">
                                                <script>
                                                    var chart = c3.generate({
                                                        bindto: '#chart',
                                                        data: {
                                                            // iris data from R
                                                            columns: [
                                                                ['Investments', 30],
                                                                ['Proifit', 120],
                                                            ],
                                                            type : 'pie',
                                                            onclick: function (d, i) { console.log("onclick", d, i); },
                                                            onmouseover: function (d, i) { console.log("onmouseover", d, i); },
                                                            onmouseout: function (d, i) { console.log("onmouseout", d, i); }
                                                        }
                                                    });
                                                </script>
                                            </div>

                                        </div>




                                        <div class="col-md-9">
                                            
                                            <div class="panel panel-default">
                                                <div class="panel-heading">
                                                    <h3 class="panel-title">Up and Running Campaigns</h3>
                                                </div>
                                                <div class="panel-body">

                                                <div class="col-md-4">
                                            
                                           <div class="widget widget-info widget-padding-sm"> 

                                            <div class="widget-item-left">
                                                <input class="knob" data-width="100" data-height="100" data-min="0" data-max="100" data-displayInput=false data-bgColor="#d6f4ff" data-fgColor="#FFF" value="30%" data-readOnly="true" data-thickness=".2"/>
                                            </div>

                                            <div class="widget-data">
                                                <div class="widget-big-int"><span class="num-count">30</span>%</div>
                                                <div class="widget-title">Campaign Name </div>
                                                <div class="widget-subtitle">End Date: 2016 - 08 - 09</div>

                                            </div>                            
                                                                     
                                        </div>  

                                        </div>




                                        <div class="col-md-4">
                                            
                                           <div class="widget widget-info widget-padding-sm"> 

                                            <div class="widget-item-left">
                                                <input class="knob" data-width="100" data-height="100" data-min="0" data-max="100" data-displayInput=false data-bgColor="#d6f4ff" data-fgColor="#FFF" value="40%" data-readOnly="true" data-thickness=".2"/>
                                            </div>

                                            <div class="widget-data">
                                                <div class="widget-big-int"><span class="num-count">40</span>%</div>
                                                <div class="widget-title">Campaign Name </div>
                                                <div class="widget-subtitle">End Date: 2016 - 08 - 09</div>

                                            </div>                             
                                                                 
                                        </div>  

                                        </div>




                                        <div class="col-md-4">
                                            
                                           <div class="widget widget-info widget-padding-sm"> 

                                            <div class="widget-item-left">
                                                <input class="knob" data-width="100" data-height="100" data-min="0" data-max="100" data-displayInput=false data-bgColor="#d6f4ff" data-fgColor="#FFF" value="25%" data-readOnly="true" data-thickness=".2"/>
                                            </div>

                                            <div class="widget-data">
                                                <div class="widget-big-int"><span class="num-count">25</span>%</div>
                                                <div class="widget-title">Campaign Name </div>
                                                <div class="widget-subtitle">End Date: 2016 - 08 - 09</div>

                                            </div>                            
                                                                      
                                        </div>  

                                        </div>




                                        <div class="col-md-4">
                                            
                                           <div class="widget widget-warning widget-padding-sm"> 

                                            <div class="widget-item-left">
                                                <input class="knob" data-width="100" data-height="100" data-min="0" data-max="100" data-displayInput=false data-bgColor="#d6f4ff" data-fgColor="#FFF" value="70%" data-readOnly="true" data-thickness=".2"/>
                                            </div>

                                            <div class="widget-data">
                                                <div class="widget-big-int"><span class="num-count">70</span>%</div>
                                                <div class="widget-title">Campaign Name </div>
                                                <div class="widget-subtitle">End Date: 2016 - 08 - 09</div>

                                            </div>                             
                                                                   
                                        </div>  

                                        </div>



                                        <div class="col-md-4">
                                            
                                           <div class="widget widget-danger widget-padding-sm"> 

                                            <div class="widget-item-left">
                                                <input class="knob" data-width="100" data-height="100" data-min="0" data-max="100" data-displayInput=false data-bgColor="#d6f4ff" data-fgColor="#FFF" value="95%" data-readOnly="true" data-thickness=".2"/>
                                            </div>

                                            <div class="widget-data">
                                                <div class="widget-big-int"><span class="num-count">95</span>%</div>
                                                <div class="widget-title">Campaign Name </div>
                                                <div class="widget-subtitle">End Date: 2016 - 08 - 17</div>

                                            </div>                             
                                                                      
                                        </div>  

                                        </div>

                                                </div>
                                            </div>

                                        </div>


                                        




                                    </div>                                 
                                    
                                </div>
                            </div>
                            <!-- END DATATABLE EXPORT -->  




                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Current Profit vs Investments</h3>
                                </div>
                                <div class="panel-body">

                                    <div id="campbar">
                                        <script>
                                            var chart = c3.generate({
                                                bindto: '#campbar',
                                                data: {
                                                        columns: [
                                                            ['Profit', 30, 200, 100, 400, 150],
                                                            ['Investments', 130, 100, 140, 200, 150]
                                                        ],
                                                        type: 'bar'
                                                    },
                                                    bar: {
                                                        width: {
                                                            ratio: 0.3 // this makes bar width 50% of length between ticks
                                                        }
                                                        // or
                                                        //width: 100 // this makes bar width 100px
                                                    },axis: {
        x: {
            type: 'category',
            categories: ['Campaign Name 1', 'Campaign Name 2', 'Campaign Name 3', 'Campaign Name 4', 'Campaign Name 5']
        }
    }
});
                                        </script>
                                    </div>

                                </div>

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
        <div class="message-box animated fadeIn" data-sound="alert" id="mb-remove-row">
            <div class="mb-container">
                <div class="mb-middle">
                    <div class="mb-title"><span class="fa fa-times"></span> Remove <strong>Data</strong> ?</div>
                    <div class="mb-content">
                        <p>Are you sure you want to remove this row?</p>                    
                        <p>Press Yes if you sure.</p>
                    </div>
                    <div class="mb-footer">
                        <div class="pull-right">
                            <button class="btn btn-success btn-lg mb-control-yes">Yes</button>
                            <button class="btn btn-default btn-lg mb-control-close">No</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END MESSAGE BOX-->        
        
        <!-- MESSAGE BOX-->
        <div class="message-box animated fadeIn" data-sound="alert" id="mb-signout">
            <div class="mb-container">
                <div class="mb-middle">
                    <div class="mb-title"><span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?</div>
                    <div class="mb-content">
                        <p>Are you sure you want to log out?</p>                    
                        <p>Press No if youwant to continue work. Press Yes to logout current user.</p>
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
    <%@include file="../../resources/include/footer.jsp" %>
