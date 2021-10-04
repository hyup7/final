<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<c:set var="path" value="${pageContext.request.contextPath }"/> 
<c:set var="saveId" value="${cookie.saveId.value }"/>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	
	

<link rel="stylesheet" type="text/css" href="${path }/resources/css/style.css">
<script src="${path }/resources/js/jquery-3.6.0.min.js"></script>
<body>
	<div id="container">
		<header>
		
			<h1>Hello MVC</h1>
			<div class="login-container">
		
			<c:if test="${memberlogin ==null }">
				<form id="loginFrm" action="${path }/login" method="post"
					onsubmit="return fn_invalidate();">
					<table>
						<tr>
							<td><input type="text" name="userId" id="userId" placeholder="아이디" value="${saveId==null?"":saveId }"></td>
							<td></td>
						</tr>
							<tr>
							<td><input type="password" name="password" id="password" placeholder="패스워드"></td>
							<td></td>
							<td><input type="submit" value="로그인"></td>
						</tr>
							
							
							
						
						<tr>
						<td colspan="2">
				
						
							<input type="checkbox" name="saveId" id="saveId" ${saveId==null?"":"checked" }>
							
							
							
							<label for="saveId">아이디저장</label>
							<input type="button" value="회원가입" onclick="location.assign('${path}/enrollMember')">
						</tr>
						
					</table>
				
					</form>
					</c:if>
					<c:if test="${memberlogin!=null }">
						<table id="logged-in">
						<tr>
						<td colspan="2">
					${memberlogin.userId} 님,환영합니다.
						</td>
						</tr>
						<tr>
						<td>
						<input type="button" value="내정보보기" onclick="location.assign('${path}/memberView?userId=${memberlogin.userId}')">
						
						</td>
						<td>
						<input type="button" value="로그아웃" onclick="fn_logout();">
						</td>
						</tr>
						</table>
					</c:if>
			</div>
			<nav>
				<ul class="main-nav">
					<li class="home"><a href="">Home</a></li>
					<li id="notice"><a href="<%=request.getContextPath()%>/notice/notice">공지사항</a></li>
					<li id="board"><a href="<%=request.getContextPath()%>/board/boardlist">게시판</a></li>
					
				   <li id="memberManage"><a href="<%=request.getContextPath()%>/admin/memberList">회원관리</a></li>
				
					
				</ul>
			</nav>
		</header>
		<script>
			const fn_invalidate=()=>{
				console.log("안녕");
				const userId=$("#userId").val();
				const pw=$("#password").val();
				if(userId.trim().length<4){
					alert("아이디를 4글자 이상 입력하세요");
					return false;
					
					
					
				}
				if(pw.trim().length==0){
					alert("패스워드를 입력하세요!")
					return false;
				}
				return true;
			}
			const fn_logout=()=>{
				location.replace("<%=request.getContextPath()%>/logout");	
			}
		</script>