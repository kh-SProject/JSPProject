<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>회원정보 수정</title>
  <link rel="stylesheet" href="../../resources/css/memoUpdate.css">
</head>
<body>
  <div class="container">
    <h2>회원정보 수정</h2>
    <form action="/update-profile" method="post">
      <label for="username">아이디</label>
      <input type="text" id="username" name="username" value="이서준" readonly>

      <label for="password">새 비밀번호</label>
      <input type="password" id="password" name="password" required>

      <label for="confirm-password">비밀번호 확인</label>
      <input type="password" id="confirm-password" name="confirm-password" required>

      <div class="buttons">
        <button type="submit">수정하기</button>
        <a href="/main"><button type="button">취소</button></a>
      </div>
    </form>
  </div>
</body>
</html>
