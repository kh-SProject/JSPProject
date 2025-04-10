<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>메모 상세 보기</title>
  <link rel="stylesheet" href="/resources/css/memoDetail.css">
</head>
<body>

  <div class="detail-container">
    <h2>📄 메모 상세</h2>

    <table class="memo-table">
      <tr><th>번호</th><td>${memo.memoNo}</td></tr>
      <tr><th>제목</th><td>${memo.memoTitle}</td></tr>
      <tr><th>내용</th><td>${memo.memoDetail}</td></tr>
      <tr><th>작성일</th><td>${memo.memoDate}</td></tr>
      <tr><th>수정일</th><td>${memo.memoUpdate}</td></tr>
    </table>

    <div class="button-box">
      <form action="/memo/edit" method="get">
        <input type="hidden" name="no" value="${memo.memoNo}">
        <button type="submit" class="edit-btn">✏ 수정</button>
      </form>

        <button id="deleteBtn">🗑 삭제</button>
    </div>
  </div>

  <script src="/resources/js/memoDetail.js"></script>
</body>
</html>
