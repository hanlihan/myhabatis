<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加车辆</title>
</head>
<body>
        <h1>添加车辆</h1>
        <form action="cars/add.do" method="post">
		            姓名:<input name="name" type="text"><br><br>
		            车型:<input name="model" type="text"><br><br>
		          车牌号:<input name="carnumber" type="text"><br><br>
		            电话号码:<input name="number" type="text"><br><br>${error}
		            <input type="submit" value="添加">
        </form>
</body>
</html>