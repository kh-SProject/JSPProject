<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>메모 상세</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
      padding: 2rem;
    }
    .memo-box {
      max-width: 600px;
      margin: auto;
      background: #fff;
      padding: 2rem;
      border-radius: 12px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    }
    .memo-title {
      font-weight: bold;
      font-size: 1.5rem;
      margin-bottom: 1.5rem;
      text-align: center;
    }
    .btn-space {
      display: flex;
      justify-content: space-between;
    }
    label {
      font-weight: bold;
    }
    input[type="text"], textarea {
      width: 100%;
      margin-bottom: 1rem;
    }
  </style>
</head>
<body>

<div class="memo-box">
  <div class="memo-title">📝 메모 상세</div>
  
  <div class="mb-3">
    <label for="memoId">번호</label>
    <input type="text" class="form-control" id="memoId" value="${memoList.memoNo}" readonly>
  </div>

  <div class="mb-3">
    <label for="memoTitle">제목</label>
    <input type="text" class="form-control" id="memoTitle" value="${memoList.memoTitle}" >
  </div>

  <div class="mb-3">
    <label for="memoContent">내용</label>
    <textarea class="form-control" id="memoContent" rows="5">${memoList.memoDetail}</textarea>
  </div>

  <div class="mb-3 row">
    <div class="col">
      <label>작성일</label>
      <input type="text" class="form-control" value="${memoList.memoDate}" readonly>
    </div>
    <div class="col">
      <label>수정일</label>
      <input type="text" class="form-control" value="${memoList.memoUpdate}"  readonly>
    </div>
  </div>

  <div class="btn-space mt-4">
    <button class="btn btn-success" id="updateBtn">수정</button>
    <button class="btn btn-danger" id="deleteBtn">삭제</button>
  </div>
</div>

</body>
</html>
