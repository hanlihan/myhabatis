<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
       <h1>修改界面</h1>
       <form action="updateCar.do" method="post" >
		     <input name="uid" type="hidden" value="${cars.uid }">      
		            车名 :<input name="name" type="text" value="${cars.name }"><br><br>
		            车型:<input name="model" type="text" value="${cars.model }"><br><br>
		            车牌号:<input name="carnumber" type="text" value="${cars.carnumber }"><br><br>
		            电话号码:<input name="number" type="text" value="${cars.number }"><br><br>
		            <input type="submit" value="修改">
        </form>
</body>
</html>