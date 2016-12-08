<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

<title>Upload file</title>


<form:form action="upload.process" method="POST" commandName="loyalty_schema">
                                    
                                  <form:input path="imageUrl"  name="file" type="file" class="form-control normtxtin"/>
                                  <form:input path="imageUrl"  name="file" type="file" class="form-control normtxtin"/>
                                  <form:input path="imageUrl"  name="file" type="file" class="form-control normtxtin"/>
                                  
                                  
                                  <form:input path="imageUrl" type="text" class="form-control normtxtin"/>
                                  
                                  <input type="submit" name="action" value="Add" class="btn"/>
                                    
                                </form:form>