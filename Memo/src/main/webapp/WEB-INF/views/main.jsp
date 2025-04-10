<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>MEMO IS BEST</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
      background-color: #fff;
      color: #333;
      text-align: center;
    }

    header {
      background-color: #000;
      color: #fff;
      padding: 10px 0;
      font-size: 1rem;
      font-weight: bold;
      letter-spacing: 2px;
    }

    .hero {
      position: relative;
      width: 100%;
      max-width: 1400px;
      margin: 0 auto;
    }

    .hero img {
      width: 100%;
      height: auto;
    }

    .hero-text {
      position: absolute;
      top: 30%;
      left: 50%;
      transform: translate(-50%, -30%);
      color: #111;
    }

    .hero-text h1 {
      font-size: 2.5rem;
      font-weight: bold;
      line-height: 1.5;
    }

    .hero-text p {
      margin-top: 20px;
      font-size: 1rem;
      color: #333;
    }

    .table-section {
      max-width: 900px;
      margin: 30px auto;
    }

    table {
      width: 100%;
      border-collapse: collapse;
    }

    th, td {
      border: 1px solid #ddd;
      padding: 10px;
      text-align: left;
      font-size: 0.9rem;
    }

    th {
      background-color: #f5f5f5;
    }

    .login-section {
      display: flex;
      justify-content: center;
      align-items: center;
      margin: 20px auto;
      gap: 10px;
      flex-wrap: wrap;
    }

    .login-section input {
      padding: 10px;
      font-size: 0.9rem;
      width: 200px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    .login-section button {
      padding: 10px 20px;
      font-size: 0.9rem;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .login-section .login-btn {
      background-color: #007bff;
      color: #fff;
    }

    .login-section .signup-btn {
      background-color: #0066ff;
      color: #fff;
    }
  </style>
</head>
<body>
  <header>
    MEMO IS BEST
  </header>

  <div class="hero">
    <img src="/img/write-5170938_1920.jpg" alt="Memo Image">
    <div class="hero-text">
      <h1>순간의 생각을 붙잡는<br>가장 부드러운 방법</h1>
      <p>잊지 말고, 적어보세요.<br>당신의 순간은 메모로 오래 남습니다.</p>
    </div>
  </div>

  <div class="table-section">
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
        <tr>
          <td>1</td>
          <td>회의록 정리</td>
          <td>4월 9일 회의 내용 정리: 프로젝트 일정 조율...</td>
          <td>2025-04-09</td>
          <td>2025-04-09</td>
        </tr>
        <tr>
          <td>2</td>
          <td>스터디 계획</td>
          <td>이번 주 스터디 목표는 Git 명령어 복습과 실...</td>
          <td>2025-04-09</td>
          <td>2025-04-09</td>
        </tr>
        <tr>
          <td>3</td>
          <td>업무 일지</td>
          <td>오늘은 DB 설계 및 ERD 작성 업무를 진행하...</td>
          <td>2025-04-09</td>
          <td>2025-04-09</td>
        </tr>
        <tr>
          <td>4</td>
          <td>버그 리포트</td>
          <td>로그인 시 비밀번호 확인 오류 발생 - 수정 요...</td>
          <td>2025-04-09</td>
          <td>2025-04-09</td>
        </tr>
      </tbody>
    </table>
  </div>

  <div class="login-section">
    <input type="text" placeholder="아이디">
    <input type="password" placeholder="비밀번호">
    <button class="login-btn">로그인</button>
    <button class="signup-btn">회원가입</button>
  </div>
</body>
</html>
  <meta charset="UTF-8">