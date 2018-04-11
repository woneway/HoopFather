<script>
$(document).ready(function(){
	$("#register").click(function(){
 			var user = $( "#registerForm" ).serializeArray();
 			jQuery.ajax({
 				type: 'POST',
	 			url: "/usr/doRegister",
	 			data: user,
	 			success: function(msg){
	 				if(msg.code=="0"){
	 					alert("register "+msg.message+"!登录邮箱进行验证");
	 					window.location.href="/usr/login";
	 				}
	 				else{
	 					alert(msg.message);
	 					window.location.href="/usr/register";
	 				}
	 			}
 			})
 			
  		})
	})
</script>