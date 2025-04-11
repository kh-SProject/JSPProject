const updateBtn = document.querySelector("#updateBtn");

updateBtn.addEventListener("click", ()=>{
	location.href = "memo/detail?no=" + no;
});