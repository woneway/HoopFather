<script>
$(document).ready(function(){
	$("#login").click(function(event){
 			var user = $( "#loginForm" ).serializeArray();
 			jQuery.ajax({
 				type: 'POST',
	 			url: "/usr/doLogin",
	 			data: user,
	 			success:function(msg){
	 				if(msg.code=="0"){
	 					alert("登录成功^v^");
	 					window.location.href="/";
	 				}
	 				else if(msg.code=="400"){
	 					alert(msg.message);
	 					window.location.href="/usr/login";
	 					
	 				}
	 			}
 			})
 			
  		})
	})
</script>