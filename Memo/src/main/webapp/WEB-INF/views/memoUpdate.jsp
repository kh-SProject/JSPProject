<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 메모 수정 페이지 -->

	<h1>${sessionScope.loginMember}</h1>

	<h4>할 일 수정</h4>


	<!-- value 값은 조회서블릿이 완료된 뒤 넣을 수 있음 -->
	<form>
		<div>
			<input type="text" name="memoTitle" value="${memoList.memoTitle}">
		</div>
		<div>
			<textarea rows="3" cols="50" name="memoDetail">${memoList.memoDetail}</textarea>
		</div>
		
		<input type="hidden" name="memoNo" value="${memoList.memoNo}">
		
		<button>수정완료</button>
	</form>
	
		<c:if test="${not empty sessionScope.message}">
		<script>
			// JS 영역
			alert("${message}");
			// JSP 해석순위
			// 1순위 : Java(EL/JSTL)
			// 2순위 : Front(HTML/CSS/JS)
		</script>
		
		<%-- message를 한 번만 출력하고 제거 --%>
		<c:remove var="message" scope="session"></c:remove>
	</c:if>

</body>
</html>