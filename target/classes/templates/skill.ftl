<#-- 引入布局指令的命名空间 -->
<#import "layout/skill.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<#list skillList as skill>  
				<div class="container skill">
					<div class="skillTitle text-center article-title">${skill.skillTitle}</div>
					
					<div class="skillContent">
						<video id="skill${skill.skillId}" class="video-js vjs-default-skin" controls preload="none" width="640" height="264"
		      				poster=${skill.skillPoster}
		      				data-setup="{}">
		    		<source src=${skill.skillLink}  />
						</video>
					</div>
					<div class="skillMore text-center">
						<a href="/skill/${skill.skillId}">查看更多</a>
					</div>
				</div>
			</#list>
			
		</div>
	</div>
</div>
</@defaultLayout.layout>