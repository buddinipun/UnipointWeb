
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
       <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Claimed offers</h2>
                </div>
      
      <div class="page-content-wrap">
                
                    
                    
                    <div class="row">
                        <div class="col-md-12">
                            
                            <!-- START DATATABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Offers List</h3>
                                    <div class="btn-group pull-right">
                                        <button class="btn btn-danger dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bars"></i> Export</button>
                                        <ul class="dropdown-menu">
                                            <li><a href="#" onClick ="$('#offerClaim').tableExport({type:'csv',escape:'false'});"><img src='resources/img/icons/csv.png' width="24"/> CSV</a></li>
                                            <li><a href="#" onClick ="$('#offerClaim').tableExport({type:'txt',escape:'false'});"><img src='resources/img/icons/txt.png' width="24"/> TXT</a></li>
                                            <li><a href="#" onClick ="$('#offerClaim').tableExport({type:'pdf',escape:'false'});"><img src='resources/img/icons/pdf.png' width="24"/> PDF</a></li>
                                        </ul>
                                    </div>                                    
                       
                                </div>
                                <div class="panel-body">
                                    <table id="offerClaim" class="table datatable">
                                        <thead>
                                            <tr>
                                                <th>Offer ref ID</th>
                                                <th>Unipoint customer ref id</th>
                                                <th>Date time claimed</th>
                                                <th>Merchant points added</th>
                                                <th>Quantity claimed</th>
                                               
                                            </tr>
                                            <tbody>
                                            
                                                <tr>
                                                    
                                                </tr>
                                </tbody>
                                        </thead>
                                       
                                    </table>                                    
                                    
                                </div>
                            </div>
                            <!-- END DATATABLE EXPORT -->                


                         

                        </div>
                    </div>
                     


                </div> 
      
  
  </div>
  
       <%@include file="../../resources/include/footer.jsp" %>