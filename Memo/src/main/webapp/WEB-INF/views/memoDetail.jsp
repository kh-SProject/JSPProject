<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>메모 상세 보기</title>
</head>
<body>
  <h2>메모 상세 정보</h2>

  <table border="1" cellpadding="10">
    <tr><th>메모 번호</th><td>${memo.no}</td></tr>
    <tr><th>제목</th><td>${memo.title}</td></tr>
    <tr><th>내용</th><td>${memo.detail}</td></tr>
    <tr><th>작성일</th><td>${memo.date1}</td></tr>
    <tr><th>수정일</th><td>${memo.date2}</td></tr>
    <tr><th>회원 번호</th><td>${memo.memberNo}</td></tr>
  </table>

  <br>
  <form action="memo/edit" method="get">
    <input type="hidden" name="no" value="${memo.no}" />
    <button type="submit">수정</button>
  </form>
</body>
</html>