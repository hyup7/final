
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param name="title" value="안녕 스프링"/>
</jsp:include>
	
		<section id="content">
			<h2 align="center" style="margin-top:200px;">안녕하세요,MVC입니다</h2>
		</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
