<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Memo is Best</title>
  <link rel="stylesheet" href="/resources/css/main.css"/>
</head>
<body>

<header>MEMO IS BEST</header>

<div class="banner">
  <img src="/images/KakaoTalk_20250410_093002517.jpg" alt="펜 이미지" />
  <div class="text-box">
    <h2>순간의 생각을 붙잡는<br>가장 부드러운 방법</h2>
    <p>잊지 말고, <span class="highlight">적어보세요.</span><br>
       당신의 순간은 메모로 오래 남습니다.</p>
  </div>
  
  <form action="/memo/add" method="post">
    <button>글쓰기</button>
  </form>
</div>

<div class="container">

  <!-- 메모 리스트 -->
<table>
  <thead>
    <tr>
      <th>No</th>
      <th>Title</th>
      <th>Detail</th>
      <th>Date</th>
      <th>Date</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="memo" items="${memoList}">
      <tr>
        <td>${memo.no}</td>

        <!-- 제목 -->
        <td>
          <c:choose>
            <c:when test="${not empty sessionScope.loginMember}">
              <a href="memoDetail?no=${memo.no}" target="_blank">${memo.title}</a>
            </c:when>
            <c:otherwise>
              ${memo.title}
            </c:otherwise>
          </c:choose>
        </td>

        <!-- 내용 -->
        <td>
          <c:choose>
            <c:when test="${not empty sessionScope.loginMember}">
              ${memo.detail}
            </c:when>
            <c:otherwise>-</c:otherwise>
          </c:choose>
        </td>

        <!-- 작성일 -->
        <td>
          <c:choose>
            <c:when test="${not empty sessionScope.loginMember}">
              ${memo.date1}
            </c:when>
            <c:otherwise>-</c:otherwise>
          </c:choose>
        </td>

        <!-- 수정일 -->
        <td>
          <c:choose>
            <c:when test="${not empty sessionScope.loginMember}">
              ${memo.date2}
            </c:when>
            <c:otherwise>-</c:otherwise>
          </c:choose>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>

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
</html>
