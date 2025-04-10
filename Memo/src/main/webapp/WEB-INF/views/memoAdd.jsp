<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>게시글 작성</title>
  <link rel="stylesheet" href="/resources/css/memoAdd.css">
</head>
<body>
  <div class="container">
    <label for="title">제목</label>
    <input type="text" id="title" name="title">

    <label for="content">내용</label>
    <textarea id="content" name="content"></textarea>

	<form action="/memo/add" method="post">
	 <button class="submit-btn">등록</button>
	</form>
   
  </div>
</body>
</html>