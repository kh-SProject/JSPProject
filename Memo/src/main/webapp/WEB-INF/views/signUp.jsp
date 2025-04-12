<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
   <style>
    body {
        font-family: 'Noto Sans KR', sans-serif;
        background: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .signup-container {
        background: #fff;
        padding: 40px 32px;
        border-radius: 16px;
        box-shadow: 0 8px 24px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
        box-sizing: border-box;
    }

    h1 {
        text-align: center;
        margin-bottom: 32px;
        font-size: 24px;
        font-weight: 600;
        color: #333;
    }

    form {
        display: flex;
        flex-direction: column;
        gap: 16px; /* 🔥 세로 간격을 한 번에 깔끔하게 */
    }

    form input {
        padding: 14px 16px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 16px;
        width: 100%;
        box-sizing: border-box;
    }

    form button {
        padding: 14px;
        background-color: #3f51b5;
        border: none;
        color: white;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
        transition: background-color 0.2s ease-in-out;
    }

    form button:hover {
        background-color: #303f9f;
    }
</style>
</head>
<body>

    <div class="signup-container">
        <h1>회원가입</h1>
        <form action="/signUp" method="post">
            <input type="text" name="memberId" placeholder="아이디" required>
            <input type="password" name="memberPw" placeholder="비밀번호" required>
            <input type="text" name="memberName" placeholder="이름" required>
            <button type="submit">가입하기</button>
        </form>
    </div>

</body>
</html>
