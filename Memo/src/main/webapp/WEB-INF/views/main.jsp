<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Memo is Best</title>
  <link rel="stylesheet" href="/resources/css/main.css" />
</head>
<body>

<header>MEMO IS BEST</header>

<div class="banner">
  <img src="/images/KakaoTalk_20250410_093002517.jpg" alt="펜 이미지" />
  <div class="text-box">
    <h2>순간의 생각을 붙잡는<br>가장 부드러운 방법</h2>
  </div>
</div>

<div class="container">

  <!-- 로그인 / 환영 메시지 -->
  <div id="authSection" class="login-area">
    <c:choose>
      <c:when test="${not empty sessionScope.user}">
        <div id="welcomeMessage">
          <p class="welcome">${sessionScope.user}님, 환영합니다!</p>
          <p>즐겁고 행복한 순간이 있다면 메모로 남겨보세요 :)</p>
          <form action="logout.jsp" method="post">
            <button type="submit">로그아웃</button>
          </form>
        </div>
      </c:when>
      <c:otherwise>
        <div id="loginForm">
          <form action="login.jsp" method="post">
            <input type="text" name="username" placeholder="아이디" required />
            <input type="password" name="password" placeholder="비밀번호" required />
            <button type="submit">로그인</button>
            <button formaction="register.jsp">회원가입</button>
          </form>
        </div>
      </c:otherwise>
    </c:choose>
  </div>
</div>
<script src="/resources/js/main.js"></script>
</body>
