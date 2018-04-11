<#-- 引入布局指令的命名空间 -->
<#import "layout/skill.ftl" as defaultLayout>
 
<#-- 调用布局指令 -->
<@defaultLayout.layout>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
				<div class="container skill">
					<div class="skillTitle text-center article-title">${skill.skillTitle}</div>
					
					<div class="skillContent newsContentShorter">
						<video id="skill${skill.skillId}" class="video-js vjs-default-skin" controls preload="none" width="640" height="264"
		      				poster=${skill.skillPoster}
		      				data-setup="{}">
		    				<source src=${skill.skillLink}  />
						</video>
					</div>
					
					<div class="skillDesc">
						${skill.skillDesc}	
					</div>
					
					<div class="skillInfo pull-right">
						<span>发布日期：${skill.skillDate}</span>
					</div>
					
				</div>
		</div>
	</div>
</div>
</@defaultLayout.layout>