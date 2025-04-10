<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>메모 상세 보기</title>
  <link rel="stylesheet" href="/resources/css/memoDetail.css">
</head>
<body>
  <div class="memo-detail-container">
    <div class="memo-title">${memo.memoTitle}</div>

    <div class="memo-content">
      ${memo.memoDetail}
    </div>

    <div class="memo-buttons">
      <!-- 수정 -->
      <form action="/memo/update" method="get">
        <input type="hidden" name="no" value="${memo.memoNo}">
        <button type="submit">수정</button>
      </form>

      <!-- 삭제 -->
      <form action="/memo/delete" method="post" onsubmit="return confirmDelete();">
        <input type="hidden" name="no" value="${memo.memoNo}">
        <button type="submit">삭제</button>
      </form>

      <!-- 등록 -->
      <form action="/memo/insert" method="get">
        <button type="submit" class="primary">등록</button>
      </form>
    </div>
  </div>

  <script src="/resources/js/memoDetail.js"></script>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memo detail</title>
</head>
<body>

</body>
</html>