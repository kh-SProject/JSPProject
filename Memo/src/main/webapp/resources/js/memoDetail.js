const deleteBtn = document.querySelector("#deleteBtn");
deleteBtn.addEventListener("click", () => {
	
	console.log("나와");

  if(! confirm("정말 삭제하시겠습니까?")) return;

  location.href = "/memo/delete?no=" + no;
  
});