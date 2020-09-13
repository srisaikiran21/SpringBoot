<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
</head>
<body>
<div>
	<h3>Update Book</h3>	
		
<form action = "editBook" method="post" >
  <div>
    <label for="Book id">Book Id : </label>
    <input type="text" name= "bookId" value="${b.bookId}" readonly="readonly">
  </div>
  	
  <div>
    <label for="Book name">Book Name : </label>
    <input type="text" name= "bookName" value= "${b.bookName}">
  </div>
  	
  <div>
    <label for="Book author name">Book Author Name : </label>
    <input type="text" name= "Author" value= "${b.author}">
  </div>
  
  <div>
    <label for="Book publisher name">Book Publisher Name : </label>
    <input type="text" name= "publisher" value= "${b.publisher}">
  </div>
  	
  <div>
  	<button type = "submit">Update</button>
  </div>
 </form>
	
</div>
</body>
</html>