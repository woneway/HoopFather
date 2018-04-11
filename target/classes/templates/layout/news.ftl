<#macro layout>
<html>
<head>
	<#include "_scripts/common.ftl">
</head>
<body>
    <#include "_custom/header.ftl">
    
    <#-- 在这里嵌入main content -->
    <#nested>
    
    <#include "_custom/footer.ftl">
</body>
	<#include "_scripts/news.ftl">
</html>
</#macro>