<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>欢迎</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link id="mainCSS" rel="stylesheet" type="text/css" href="include.htm?type=css&files=/styles/easyui/default/easyui.css;">
<script type="text/javascript" src="include.htm?type=javascript&files=/scripts/jquery.min.js;/scripts/jquery.easyui.min.js;/scripts/easyui-lang-zh_CN.js;"></script>
</head>
<body id="indexPage" class="easyui-layout">
	<div region="north" style="height:100px;" border="false">
		<button id="testBtn">测试</button>
	</div>
	<div region="center">
		<iframe id="testFrame" style="width: 100%;height: 100%;" src="http://localhost:8080/eSystem/xiaoliuyu/index.htm?logflag=2c2c83b04476d01e014476d80d320009"></iframe>
	</div>
</body>
</html>