const addBtn = document.querySelector("#addBtn") 

addBtn.addEventListener("click", ()=>{
  location.href = "/memo/add?memoNo=" + memoNo;
});