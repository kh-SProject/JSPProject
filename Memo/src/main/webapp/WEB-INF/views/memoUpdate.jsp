<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>게시글 작성</title>
  <link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>

	<form action="/todo/update" method="post" id="updateForm">
	  <div class="container">
	    <label for="title">제목</label>
	    <input type="text" id="title" name="title" value="${todo.todoTitle}">
	
	    <label for="content">내용</label>
	    <textarea id="content" name="content" rows="3" cols="50" placeholder="상세 내용"></textarea>
	
	    <button class="submit-btn">등록</button>
	  </div>
	</form>
	
</body>
</html>
