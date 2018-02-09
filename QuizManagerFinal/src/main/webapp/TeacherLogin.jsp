<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TeacherLogin</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center">Welcome to Teacher Login</h1>
<div class="container">
<form name="authenticationForm" action="Authenticate" method="post">			
  <div class="form-row">
    <div class="form-group ">
      <label for="inputEmail4">Email</label>
      <input type="email" name="email" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group ">
      <label for="inputPassword4">Password</label>
      <input type="password" name ="password"class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
		</div>
		</div>

</body>
</html>