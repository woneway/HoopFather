<#-- 引入布局指令的命名空间 -->
<#import "layout/login.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
<#-- 将下面这个main content嵌入到layout指令的nested块中 -->
   <div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-6 column">
			<form class="form-horizontal" role="form" id = "loginForm" action="/usr/doLogin">
				<div class="form-group">
					 <label for="userEmail" class="col-sm-4 control-label">邮箱</label>
					<div class="col-sm-6">
						<input type="email" class="form-control" name="userEmail" id="userEmail"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="userPwd" class="col-sm-4 control-label">密码</label>
					<div class="col-sm-6">
						<input type="password" class="form-control" name="userPwd" id="userPwd"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-10">
						<div class="checkbox">
							 <label><input type="checkbox" />记住我</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-8 col-sm-10">
						 <button type="submit" class="btn btn-default" id="login">登录</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
</@defaultLayout.layout>