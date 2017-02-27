<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示车辆信息</title>
</head>
<body>
	<table>
		<tr width="100%" border="0" bgcolor="#cccccc">
			<td>车名</td>
			<td>车牌号</td>
			<td>型号</td>
			<td>电话号码</td>

		</tr>
		<tr>
			<td>${car.name}</td>
			<td>${car.carnumber }</td>
			<td>${car.model }</td>
			<td>${car.number }</td>
			</tr> 
	</table>
</body>
</html>