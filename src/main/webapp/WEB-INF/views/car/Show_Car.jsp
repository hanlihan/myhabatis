<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示车辆信息</title>
<style type="text/css">
#content {
	text-align: center;
	margin: 0 auto;
	width: 480px;
	height: 200px;
	color: #333;
	background-color: #efefef;
}

td {
	background-color:yellow ;
}
</style>
</head>
<body>
	<form action="<%=request.getContextPath()%>/cars/Find_Car.do"
		method="post">
		<select name="type">
			<option value="carnumber">车牌号</option>
			<option value="model">车型</option>
			<option value="number">电话号码</option>
		</select> <input type="text" name="keyword"> <input type="submit"
			value="查询">
	</form>

		<c:if test="${key==null}">
		<table id="content">
			<tr width="100%" border="0" bgcolor="#cccccc">
				<th>姓名</th>
				<th>车型</th>
				<th>车牌号</th>
				<th>电话号码</th>
				<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${list}" var="car">
				<td><c:out value="${car.name }"></c:out></td>
				<td><c:out value="${car.model }"></c:out></td>
				<td><c:out value="${car.carnumber }"></c:out></td>
				<td><c:out value="${car.number }"></c:out></td>
				<td><a
					href="<%=request.getContextPath()%>/cars/deleta_Car.do?id=${car.uid }">删除</a></td>
				<td><a
					href="<%=request.getContextPath()%>/cars/update_Car.do?id=${car.uid }">修改</a></td>
				</tr>
				</c:forEach>
		</table>
		</c:if>
		<c:if test="${key!=null}">
			<table id="content">
			<tr width="100%" border="0" bgcolor="#cccccc">
				<th>姓名</th>
				<th>车型</th>
				<th>车牌号</th>
				<th>电话号码</th>
				<th colspan="2">操作</th>
			</tr>
				<td><c:out value="${list.name }"></c:out></td>
				<td><c:out value="${list.model }"></c:out></td>
				<td><c:out value="${list.carnumber }"></c:out></td>
				<td><c:out value="${list.number }"></c:out></td>
				<td><a
					href="<%=request.getContextPath()%>/cars/deleta_Car.do?id=${list.uid }">删除</a></td>
				<td><a
					href="<%=request.getContextPath()%>/cars/update_Car.do?id=${list.uid }">修改</a></td>
				</tr>
		</table>
		</c:if>
</body>
</html>