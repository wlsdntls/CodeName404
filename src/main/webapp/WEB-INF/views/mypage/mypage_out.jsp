<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴 메시지</title>
</head>
<body>
	<c:if test="${result==1 }">
		<script>
			alert("탈퇴 완료");
			location.href = "main.do";
		</script>
	</c:if>
	<c:if test="${result!=1 }">
		<script>
			alert("탈퇴 실패");
			history.go(-1);
		</script>
	</c:if>


</body>
</html>