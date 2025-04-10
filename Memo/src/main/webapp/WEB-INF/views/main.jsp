<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
         <h2>
            순간의 생각을 붙잡는<br>가장 부드러운 방법
         </h2>
         <p>
            잊지 말고, <span class="highlight">적어보세요.</span><br> 당신의 순간은 메모로 오래
            남습니다.
         </p>
      </div>
     
         <button id="addBtn">글쓰기</button>
     
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

					<td>${memo.memoNo}</td>
					<td>
					  <c:choose>
					    <c:when test="${not empty sessionScope.member}">
					      <a href="memo/detail?no=${memo.memoNo}" target="_blank">${memo.memoTitle}</a>
					    </c:when>
					    <c:otherwise>
					      ${memo.memoTitle}
					    </c:otherwise>
					  </c:choose>
					</td>
					
					<td>
					  <c:choose>
					    <c:when test="${not empty sessionScope.member}">
					      ${memo.memoDetail}
					    </c:when>
					    <c:otherwise>-</c:otherwise>
					  </c:choose>
					</td>
					
					<td>
					  <c:choose>
					    <c:when test="${not empty sessionScope.member}">
					      ${memo.memoDate}
					    </c:when>
					    <c:otherwise>-</c:otherwise>
					  </c:choose>
					</td>
					
					<td>
					  <c:choose>
					    <c:when test="${not empty sessionScope.member}">
					      ${memo.memoUpdate}
					    </c:when>
					    <c:otherwise>-</c:otherwise>
					  </c:choose></td>
               </tr>
            </c:forEach>
         </tbody>
      </table>

      <!-- 로그인 / 환영 메시지 -->
      <div id="authSection" class="login-area">

         <c:if test="${empty sessionScope.member}">
            <div id="loginForm">

               <form action="/login" method="post">
                  <input type="text" name="memberId" placeholder="아이디" required />
                  <input type="password" name="memberPw" placeholder="비밀번호" required />
                  <button type="submit" id="loginBtn">로그인</button>

               </form>

               <button onclick="location.href='/signup'">회원가입</button>

            </div>
         </c:if>

         <c:if test="${not empty sessionScope.member}">

            <div id="welcomeMessage">

					<p class="welcome">${sessionScope.member.memberName}님,환영합니다!</p>
					<p>즐겁고 행복한 순간이 있다면 메모로 남겨보세요 :)</p>
					<form action="/logout" method="post">
						<button type="submit">로그아웃</button>
					</form>

					<form action="/member/update">					
						<button type="submit">회원정보수정</button>
					</form>
				</div>
         </c:if>
      </div>
   </div>


   <%-- session 범위에 message가 있을 경우 --%>
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

   <script src="/resources/js/main.js"></script>
</body>
</html>