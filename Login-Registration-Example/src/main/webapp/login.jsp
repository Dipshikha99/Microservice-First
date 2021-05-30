<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div style="color: black;font-weight: bold;" align="center">
	 <h2>LOGIN</h2>
	 </div>
	 <form action="login" method="post">
<div align="center">
	 <table>
           <tr>
              <th> USERNAME:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</th>
              <td><input type="text" name="username"></td>
           </tr>
               <tr>
              <th><br/></th>
              <td><br/></td>
           </tr>    
           <tr>
              <th> USER PASSWORD :</th>
              <td><input type="password" name="password"></td>
           </tr>
           <tr>
              <th><br/></th>
              <td><br/></td>
           </tr>
           <tr>
              <td><br/></td>
              <td><br/><input type="submit" value="LOGIN" style="color: snow;background-color: blueviolet;width:100px;height:50px;font-size:25px" ></td>
           </tr>
        	<tr>
              <th><br/></th>
              <td><br/></td>
           </tr>
        </table>
       </div> 
</form>
</body>
</html>