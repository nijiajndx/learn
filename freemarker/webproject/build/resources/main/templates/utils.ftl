<#macro mapping map>
    <#list map?keys as key>
    ${key}: ${(map[key])!}
    </#list>
</#macro>

<#macro listing list>
    <#list list as item>
    ${item}
    </#list>
</#macro>

<#macro repeat count>
    <#list 1..count as i>${i}<#nested></#list>
</#macro>
