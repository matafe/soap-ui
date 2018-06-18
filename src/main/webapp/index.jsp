<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sample JAX-WS Project</title>
	<style type="text/css">
		p.line {
    		font-family: Arial, Helvetica, sans-serif;
		}
	</style>
</head>
<body>
	<c:set var="serviceNames" value="${fn:split('Calculator,PersonService',',')}" scope="page"/>
	<c:forEach var="serviceName" items="${serviceNames}">
	<p class="line"> 
		<a href="http://localhost:8080<%=request.getContextPath()%>/${serviceName}">${serviceName}</a>
		&nbsp;
		<a href="http://localhost:8080<%=request.getContextPath()%>/${serviceName}?wsdl">WSDL</a>
		&nbsp;
		<a href="http://localhost:8080<%=request.getContextPath()%>/${serviceName}?xsd=1">XSD</a>
	</p>	
	</c:forEach>
</body>
</html>