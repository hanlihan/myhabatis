<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>后台管理中心</title>
<link rel="stylesheet" href="<%=basePath %>/resources/css/pintuer.css">
<link rel="stylesheet" href="<%=basePath %>/resources/css/admin.css">
<script src="<%=basePath %>/resources/js/jquery.js"></script>
</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="<%=basePath %>/resources/images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" /> 后台管理中心
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-blue" href="./login.do"><span
				class="icon-power-off"></span> 退出登录</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>基本设置
		</h2>
		<ul style="display: block">
			<li><a href="info.html" target="right"><span
					class="icon-caret-right"></span>用户管理</a></li>
			<li><a href="jsp/user/addUser.jsp" target="right"><span
					class="icon-caret-right"></span>添加用户信息</a></li>
			<li><a href="./user_GetUser.do" target="right"><span
					class="icon-caret-right"></span>显示用户信息</a></li>
			<li><a href="jsp/user/findUser.jsp" target="right"><span
					class="icon-caret-right"></span>查找管理员账户</a></li>

		</ul>
		<h2>
			<span class="icon-pencil-square-o"></span>车辆管理
		</h2>
		<ul>
			<li><a href="./cars/Show_Car.do" target="right"><span
					class="icon-caret-right"></span>车辆信息列表</a></li>
			<li><a href="./addCar.do" target="right"><span
					class="icon-caret-right"></span>添加车辆</a></li>
			<li><a href="./findCar.do" target="right"><span
					class="icon-caret-right"></span>查找车辆</a></li>
		</ul>


	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="info.html" target="right" class="icon-home"> 首页</a>
		</li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="info.html" name="right"
			width="100%" height="100%"></iframe>
	</div>

</body>
</html>