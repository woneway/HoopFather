<title>HoopFather</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/bootstrap/css/bootstrap.min.css">
<script src="http://localhost:8080/jquery/jquery-3.3.1.min.js"></script>
<script src="http://localhost:8080/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://localhost:8080/css/custom.css">
<script>
$(document).ready(function(){
$("#logout").click(function(){
	var conFlag = confirm("确认注销吗？");
	if(conFlag){
		jQuery.ajax({
			type: 'POST',
		 	url: "/usr/logout",
		 	success: function(){
		 		alert("注销成功！");
		 		window.location.href="/usr/login";
		 	}
		})
	}
})
})
</script>