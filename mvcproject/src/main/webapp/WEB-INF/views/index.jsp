<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring boot 메인화면</title>
</head>
<body>
	<h2>spring boot에 오신걸 환영합니다</h2>
	<form action="${pageContext.request.contextPath }/member/selectOne">
		<input type="text" name="userId">
		<input type="submit" value="찾기">
	</form>
	<button onclick="selectMember();">회원조회</button>
	
	<script>
		function selectMember(){
			$.get("#{pageContext.request.contextPath}/member}"),=>{
				
			}
		}
	</script>
</body>
</html>