const memos = [
  { no: 1, title: "회의록 정리", detail: "4월 9일 회의 내용 정리: 프로젝트 일정 조율...", date1: "2025-04-09", date2: "2025-04-09" },
  { no: 2, title: "스터디 계획", detail: "이번 주 스터디 목표는 Git 명령어 복습과 실습...", date1: "2025-04-09", date2: "2025-04-09" },
  { no: 3, title: "업무 일지", detail: "오늘은 DB 설계 및 ERD 작성 업무를 진행하였음.", date1: "2025-04-09", date2: "2025-04-09" },
  { no: 4, title: "버그 리포트", detail: "로그인 시 비밀번호 확인 오류 발생 - 수정 요청", date1: "2025-04-09", date2: "2025-04-09" }
];

function loadMemos() {
  const tbody = document.getElementById("memoTable");
  memos.forEach(memo => {
    const row = `<tr>
      <td>${memo.no}</td>
      <td>${memo.title}</td>
      <td>${memo.detail}</td>
      <td>${memo.date1}</td>
      <td>${memo.date2}</td>
    </tr>`;
    tbody.innerHTML += row;
  });
}

window.onload = loadMemos;

const addBtn = document.querySelector("#addBtn") 

addBtn.addEventListener("click", ()=>{
  location.href = "/memo/addForm" ;
});
