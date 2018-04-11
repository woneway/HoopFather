<!-- 导航栏 -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://localhost:8080">篮球教程</a>
		</div>
		<div>
		<ul class="nav navbar-nav navbar-left">
				<li id="header_skill"><a href="http://localhost:8080/skill">肆虐球场小技巧</a></li>
				<li id="header_news"><a href="http://localhost:8080/news">周边新闻</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<#if user?exists>
				<li><a href="http://localhost:8080/usr/userInfo"><span class="glyphicon glyphicon-user"></span>${user.userEmail!}</a></li>
		        <li><a id="logout"><span class="glyphicon glyphicon-log-in"></span> 注销</a></li>
			<#else>
		      <li><a href="http://localhost:8080/usr/register"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
		      <li><a href="http://localhost:8080/usr/login"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
		     </#if>
 	   </ul>
 	   </div>
	</div>
</nav>