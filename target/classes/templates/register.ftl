<#-- 引入布局指令的命名空间 -->
<#import "layout/register.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-6 column">
			<form class="form-horizontal" role="form" id="registerForm" action="/usr/doRegister">
				<div class="form-group">
					 <label for="userName" class="col-sm-4 control-label">用户名</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="userName" name="userName"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="userEmail" class="col-sm-4 control-label">邮箱：</label>
					<div class="col-sm-6">
						<input type="email" class="form-control" id="userEmail" name="userEmail"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="userAddr" class="col-sm-4 control-label">地址：</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="userAddr" name="userAddr" />
					</div>
				</div>
				<div class="form-group">
					 <label for="userPwd" class="col-sm-4 control-label">密码：</label>
					<div class="col-sm-6">
						<input type="password" class="form-control" id="userPwd" name="userPwd" />
					</div>
				</div>
				<div class="form-group">
					<label for="userPwd2" class="col-sm-4 control-label">确认密码：</label>
					<div class="col-sm-6">
						<input type="password" class="form-control" id="userPwd2" name="userPwd2" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-8 col-sm-10">
						 <button type="button" class="btn btn-default" id="register">注册</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
</@defaultLayout.layout>