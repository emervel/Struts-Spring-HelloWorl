<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>

<HTML>
<HEAD>
		<TITLE>Welcome: Tiles Plugin Sturts Tutorial</TITLE>
</HEAD>
<BODY>
		<%
			String message = (String)request.getAttribute("message");
		%>
		Welcome <%= message %>
</BODY>
</HTML>	