<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add book</title>
</head>

<body>
  <div>
    <h2>Add New Book</h2>
    
  <form action = "addBook" method="post">
  
  Select Library : 
  <select name = "libraryName">
  
  <c:forEach var = "libNames" items="${libNames}">
  	<option>${libNames}</option>
  </c:forEach>
  </select>
  
  
  <div>
    <label>Book Name :</label>
    <input type="text" name = "bookName">
  </div>
     <br>
     
  <div>
    <label>Book Author :</label>
    <input type="text" name = "Author">
  </div>  
   <br>
   <div>
    <label>Publisher Name :</label>
    <input type="text" name = "publisher">
  </div>
   <br>
  <div>
  	<button type = "submit">ADD Book</button>
  </div>
  </form>
    
 </div>   
  </body>
</body>
</html>