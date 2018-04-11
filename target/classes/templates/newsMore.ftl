<#-- 引入布局指令的命名空间 -->
<#import "layout/news.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
				<div class="container news">
					<div class="newsTitle text-center article-title">${news.newsTitle}</div>
					
					<div class="newsPhoto"><img class="img-responsive center-block" src="${news.newsPhoto}"/></div>
					
					<div class="newsContent">
						${news.newsContent}	
					</div>
					
					<div class="newsInfo pull-right">
						<span>作者：${news.newsAuthor}</span><br>
						<span>日期：${news.newsDate}</span>
					</div>
					
				</div>
		</div>
	</div>
</div>
</@defaultLayout.layout>