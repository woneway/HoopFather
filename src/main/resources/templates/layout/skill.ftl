<#macro layout>
<html>
<head>
	<#include "_scripts/common.ftl">
	<#include "_scripts/video.ftl">
</head>
<body>
    <#include "_custom/header.ftl">
    
    <#-- 在这里嵌入main content -->
    <#nested>
    
    <#include "_custom/footer.ftl">
</body>

</html>
</#macro>