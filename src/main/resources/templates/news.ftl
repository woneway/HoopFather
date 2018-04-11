<#-- 引入布局指令的命名空间 -->
<#import "layout/news.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<#list newsList as news>  
				<div class="container news">
					<div class="newsTitle text-center article-title">${news.newsTitle}</div>
					
					<div class="newsContent newsContentShort">
										&nbsp;&nbsp; ${news.newsContent}	
					</div>
					<div class="newsMore text-center">
						<a href="/news/${news.newsId}">查看更多</a>
					</div>
				</div>
			</#list>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
</@defaultLayout.layout>