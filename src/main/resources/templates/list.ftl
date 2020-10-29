<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
</head>
<body>
<table  border="2">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <#list list as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.age}</td>
       <td><#if item.sex==0>
               女
               <#elseif item.sex==1>
               男
              <#else>
               保密
       </#if>
       </td>
    </tr>
    </#list>
</table>
</body>
</html>