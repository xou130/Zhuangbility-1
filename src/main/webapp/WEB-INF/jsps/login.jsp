<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>学生成绩管理系统</title>
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/login.css"
	rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="container">
		<form class="form-signin" method="POST" action="/acc_sign/">
			<h2 class="form-signin-heading">学生成绩管理系统</h2>
			<label for="inputUsername" class="sr-only">Username</label> 
			<input
				type="username" id="inputUsername" class="form-control"
				placeholder="用户名(学号)" name="username" required autofocus> 
			<label
				for="inputPassword" class="sr-only">Password</label> 
			<input
				type="password" id="inputPassword" class="form-control"
				placeholder="密码" name="password" required>
				
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					记住我
				</label>
			</div>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>

	</div>
</body>
</html>
