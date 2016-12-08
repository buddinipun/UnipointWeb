<%-- 
    Document   : add_organization
    Created on : 12-Sep-2016, 14:11:04
    Author     : unipoint
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

    <!-- START BREADCRUMB -->
    <ul class="breadcrumb">
        <li><a href="#">Home</a></li>
        <li><a href="#">Configurations</a></li>
        <li class="active">Manage Organizations</li>
    </ul>
    <!-- END BREADCRUMB -->                                                

    <!-- PAGE TITLE -->
    <div class="page-title">                    
        <h2><span class="fa fa-arrow-circle-o-left"></span>Manage Organizations</h2>
    </div>
    <!-- END PAGE TITLE -->                

    <!-- PAGE CONTENT WRAPPER -->
    <div class="page-content-wrap">

        <div class="row">

        </div>


        <div class="row">
            <div class="col-md-12">
                <!-- START PANEL WITH STATIC CONTROLS -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Add New Organization</h3>
                    </div>
                    <div class="panel-body">


                        <div class="row">
                            <div class="col-md-12">

                                <form:form action="voucher.process" method="POST" commandName="voucher">
								<div class="form-group" id="new-spot">
                                       <label for=voucherCode>Voucher code</label>
                                        <form:input path="voucherCode" class="form-control normtxtin"/>
                                        
                                         <label for="voucherValue">Voucher value</label>
                                        <form:input path="voucherValue" class="form-control normtxtin"/>
                                        
                                         <label for="new-location-name">Number of Vouchers</label>
                                     
                                        
                                 </div>       
								     
                                   <input type="submit" name="action" value="Add" />
                                </form:form>
                            </div>


                        </div>
                    </div>
                   


                </div>

            </div>
            <!-- END PAGE CONTENT WRAPPER -->                                                 
        </div>  
        
          <div class="row">
            <div class="col-md-12">
                <!-- START PANEL WITH STATIC CONTROLS -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">View All Vouchers</h3>
                    </div>
                    <div class="panel-body">


                        <div class="row">
                            <div class="col-md-12">
                                
                                    <div class="panel-body panelbody tblstripped" style="font-size: 13px;">

                                <table class="table table-striped table-hover" style="margin-bottom: 0px;padding-bottom: 0px;">

                                    <tr>
                                        <th>Voucher code</th>
                                        <th>Voucher value</th>
                                        <th>Remaining amount</th>
                                        <th>Added date</th>
                                        <th>Added by</th>
                                      
                                        
                                    </tr>
                                    <c:forEach var="vouchers" items="${vouchers}">

                                        <tr>
                                            <td>${vouchers.voucherCode}</td>
                                            <td>${vouchers.voucherValue}</td>
                                            <td>Null</td>
                                            <td>${vouchers.createdDateTime}</td>
                                            <td>${vouchers.merchantUserByCreatedByRef}</td>
                                            
                                            
                                        </tr>
                                    </c:forEach>

                                    <tr>
                                        <td class="non-hightlight-tr">
                                            <nav>
                                                <ul class="pagination">
                                                    <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                                                    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                                                    <li><a href="#">2</a></li>
                                                    <li><a href="#">3</a></li>
                                                    <li><a href="#">4</a></li>
                                                    <li><a href="#">5</a></li>
                                                    <li><a href="#">6</a></li>
                                                    <li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                                                </ul>
                                            </nav>
                                        </td>

                                        <td class="non-hightlight-tr"></td>
                                        <td class="non-hightlight-tr"></td>
                                        <td class="non-hightlight-tr"></td>
                                        <td class="non-hightlight-tr"></td>
                                        <td class="non-hightlight-tr"></td>
                                        <td class="non-hightlight-tr"></td>
                                    </tr>

                                </table>

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
          <%@include file="../../resources/include/footer.jsp" %>






