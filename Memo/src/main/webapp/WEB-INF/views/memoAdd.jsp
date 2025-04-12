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
     <form action="/memo/add" method="post">
       <label for="title">제목</label>
       <input type="text" id="title" name="memoTitle">

       <label for="memoDetail">내용</label>
       <textarea id="memoDetail" name="memoDetail"></textarea>

    <button class="submit-btn">등록</button>
   </form>
   
  </div>
</body>
</html>