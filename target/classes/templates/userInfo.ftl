<#import "layout/_layout.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-6 column">
				<div class="container">
					 <div for="userName" class="col-sm-4 control-div">用户名</div>
					<div class="col-sm-6">
						${user.userName!}
					</div>
				</div>
				<div class="container">
					 <div for="userEmail" class="col-sm-4 control-div">邮箱：</div>
					<div class="col-sm-6">
						${user.userEmail!}
					</div>
				</div>
				<div class="container">
					 <div for="userAddr" class="col-sm-4 control-div">地址：</div>
					<div class="col-sm-6">
						${user.userAddr!}
					</div>
				</div>
				<div class="container">
					 <div for="userState" class="col-sm-4 control-div">用户状态：</div>
					<div class="col-sm-6">
							已激活
					</div>
				</div>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
</@defaultLayout.layout>