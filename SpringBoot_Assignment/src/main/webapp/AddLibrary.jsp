<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add library</title>
</head>
<body>
<div align="center">

	<h2>Add New Library</h2>	
		
	<form action = "addLib" method="post" >
  <div>
    <label>Enter Library Name : </label>
    <input type="text"id="libName" name= "libraryName">
  </div>
  	<br>
  <div>
  	<button type = "submit">ADD</button>
  </div>
  </form>
  
</div>

</body>
</html>