
<%-- 
    Document   : editOutlet
    Created on : Sep 12, 2016, 4:52:37 PM
    Author     : Ramesh
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <div class="panel panel-default">
                                <div class="panel-heading" id="addplace">
                                    <h3 class="panel-title">Edit outlet </h3>

                                </div>
                                <div class="panel-body" id="exportTable" style="display: none;">

                                </div>
                                <div class="panel-body panel-body-table">

                                    <div class="col-md-6">

                                        <form  method="post" style="margin-top:15px;">

                                        
                                            
                                     <div class="form-group">
                                                <label for="new-location-name">Outlet Name</label>
                                                <input type="text" value="${outletName}" class="form-control normtxtin" id="outletName" name="outletName" placeholder="Outlet Name">
                                            </div>
                                            <div class="form-group">
                                                <label for="new-location-name">Address Line 1</label>
                                                <input type="text" value="${address1}" class="form-control normtxtin" id="Addresss" name="Addresss" placeholder="Address Line 1">
                                            </div>
                                            <div class="form-group col-md-8" style="padding-left:0px;">
                                                <label for="new-location-name">Address Line 2</label>
                                                <input type="text" value="${address2}"class="form-control normtxtin" id="exampleInputPassword1" placeholder="Address Line 2">
                                            </div>

                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Postal Code</label>
                                                <input type="text" value="${postalCode}" class="form-control normtxtin" id="postalCode" name="postalCode" placeholder="Postal Code">
                                            </div>

                                            <div class="form-group col-md-4" style="padding-left:0px;">
                                                <label for="new-location-name">Phone Number 1</label>
                                                <input type="text" value="${phone1}" class="form-control normtxtin" id="phoneNumber1" name="phoneNumber1" placeholder="Phone Number 1" >
                                            </div>

                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Phone Number 2</label>
                                                <input type="text" value="${phone2}" class="form-control normtxtin" id="phoneNumber2" name="phoneNumber2" placeholder="Phone Number 2">
                                            </div>
                                            <div class="form-group col-md-4">
                                                <label for="new-location-name">Fax Number</label>
                                                <input type="text" value="${fax}" class="form-control normtxtin" id="faxNumber" name="faxNumber" placeholder="Fax Number">
                                            </div>

                                            <div class="form-group col-md-6" style="padding-left:0px;">
                                                <label for="new-location-name">Lattitude</label>
                                                <input type="text" value="${lattitude}" class="form-control normtxtin" id="lattitudeID" name="lattitude" placeholder="Lattitude" >
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label for="new-location-name">Longitude</label>
                                                <input type="text" value="${longitude}" class="form-control normtxtin" id="longitudeID" name="longitude" placeholder="Longitude">
                                            </div>

                                            <div class="form-group">
                                                <label for="new-location-name">Email Address</label>
                                                <input type="text" value="${emailAddress}" class="form-control normtxtin" id="emailAdderss" name="emailAdderss" placeholder="Email Address">
                                            </div>


                                            <div class="form-group">
                                                <label for="new-location-name">Category</label>
                                                <input type="text" value="${category}" class="form-control normtxtin" id="category" name="category" placeholder="Category">
                                            </div>

                                            <div class="form-group col-md-6" style="padding-left:0px;">
                                                <label for="new-location-name">Opening Time</label>
                                                <input type="time"  value="${openTime}" class="form-control normtxtin" id="openingTime" name="openingTime" placeholder="Open Hours" >
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label for="new-location-name">Closing Time</label>
                                                <input type="time"  value="${closeTime}" class="form-control normtxtin" id="closingTime" name="closingTime" placeholder="Closing Hours">
                                            </div>

                                            <div class="form-group">
                                                <label for="new-location-name">Web Site Address</label>
                                                <input type="text"  value="${webSite}" class="form-control normtxtin" id="webSite" name="webSite" placeholder="Web Site Address">
                                            </div>

                                            <div class="form-group">
                                                <label for="new-location-name">Description</label>
                                                <textarea value="${description}" class="form-control normtxtin" rows="3" placeholder="Description"></textarea>
                                            </div>

                                        <div class="form-group">
                                         <div class="col-sm-offset-2 col-sm-10">
                                          <button class="btn btn-default" type="submit" >Save</button>
                                           </div>
                                        </div>
                                            
                                         
                                      
                                        </form>
                                    </div>
 <%@include file="../../resources/include/footer.jsp" %>
    </body>
</html>
