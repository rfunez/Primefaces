<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<c:out value="${initParam.testParam}"/>
	    <h:outputLabel value="#{msg.user_label}:"/>
	 	<h:outputText value="#{pfBean.name}"/>
	 	<br/>
	 	<h:outputLabel value="#{msg.address_label}:"/>
	 	<h:outputText value="#{pfBean.name}"/>
	 	<br/>
	 	<h:outputLabel value="#{msg.postalcode_label}:"/>
	 	<h:outputText value="#{pfBean.cep}"/>
	 	<br/>
	 	<h:outputText value="#{pfBean.email}"/>
	</f:view>
</body>
</html>