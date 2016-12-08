<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
      
       <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Active and Inactive Users</h2>
                </div>
      
      <div class="page-content-wrap">
                
                    
                    
                          <div class="row">
                        <div class="col-md-12">
                            
                            <!-- START DATATABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Active Users</h3>
                                    <div class="btn-group pull-right">
                                        <button class="btn btn-danger dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bars"></i> Export</button>
                                        <ul class="dropdown-menu">
                                            <li><a href="#" onClick ="$('#active').tableExport({type:'csv',escape:'false'});"><img src='resources/img/icons/csv.png' width="24"/> CSV</a></li>
                                            <li><a href="#" onClick ="$('#active').tableExport({type:'txt',escape:'false'});"><img src='resources/img/icons/txt.png' width="24"/> TXT</a></li>
                                            <li><a href="#" onClick ="$('#active').tableExport({type:'pdf',escape:'false'});"><img src='resources/img/icons/pdf.png' width="24"/> PDF</a></li>
                                        </ul>
                                    </div>                                    
                            
                                    
                                    
                                </div>
                                <div class="panel-body">
                                    <table id="active" class="table datatable">
                                        <thead>
                                            <tr>
                                                <th>First name</th>
                                                <th>Last name</th>
                                                <th>Card number</th>
                                                <th>Email</th>
                                                <th>Contact number</th>
                                                <th>Total points</th>
                                            </tr>
                                            <tbody>
                                             <c:forEach var="element" items="${merchantcustomerenable}">
                                                <tr>
                                                    <td>${element.customerFirstname}</td>
                                                    <td>${element.customerLastname}</td>
                                                    <td>${element.cardNumber}</td>
                                                    <td>${element.emailAddress}</td>
                                                    <td>${element.contactNumber}</td>
                                                    <td>${element.totalPoints}</td>
                                                </tr>
                                            </c:forEach>
                                </tbody>
                                        </thead>
                                       
                                    </table>                                    
                                    
                                </div>
                            </div>
                            <!-- END DATATABLE EXPORT -->                


                                     <!-- START DATATABLE EXPORT -->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Inactive Users</h3>
                                    <div class="btn-group pull-right">
                                        <button class="btn btn-danger dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bars"></i> Export</button>
                                        <ul class="dropdown-menu">
                                           <li><a href="#" onClick ="$('#inactive').tableExport({type:'csv',escape:'false'});"><img src='resources/img/icons/csv.png' width="24"/> CSV</a></li>
                                           <li><a href="#" onClick ="$('#inactive').tableExport({type:'txt',escape:'false'});"><img src='resources/img/icons/txt.png' width="24"/> TXT</a></li>
                                           <li><a href="#" onClick ="$('#inactive').tableExport({type:'pdf',escape:'false'});"><img src='resources/img/icons/pdf.png' width="24"/> PDF</a></li>
                                        </ul>
                                    </div>                                    
                                    
                                </div>
                                <div class="panel-body">
                                    <table id="inactive" class="table datatable">
                                        <thead>
                                            <tr>
                                                <th>First name</th>
                                                <th>Last name</th>
                                                <th>Card number</th>
                                                <th>Email</th>
                                                <th>Contact number</th>
                                                <th>Total points</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <c:forEach var="element" items="${merchantcustomerdisable}">
                                                <tr>
                                                    <td>${element.customerFirstname}</td>
                                                    <td>${element.customerLastname}</td>
                                                    <td>${element.cardNumber}</td>
                                                    <td>${element.emailAddress}</td>
                                                    <td>${element.contactNumber}</td>
                                                    <td>${element.totalPoints}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>                                    
                                    
                                </div>
                            </div>

                            <!-- END DATATABLE EXPORT -->                  
                            
                         

                        </div>
                    </div>
                     


                </div> 
      
  
  </div>
  <%@include file="../../resources/include/footer.jsp" %>
     
        
              
          