<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>library</title>
</head>
<body>
  <div>
    <h1 >Book Management </h1>

		<a href= "addNewLibrary">Add New Library</a>&nbsp;
		<a href= "addNewBook">Add New Book</a><br><br>
		
   </div>
<div>	
<div>
	<table>
  <thead>
    <tr>
      <th> Book Id </th>
      <th> Library Name </th>
      <th> Book Name </th>
      <th> Book Author Name </th>
      <th> Book Publisher Name </th>
      <th> Action </th>
    </tr>
  </thead>
  
  <tbody>
  	<c:forEach var="book" items="${books}">
  	
  		<tr>
  			<td>${book.bookId}</td>
  			<td>${book.library.libraryName }</td>
  			<td>${book.bookName}</td>
  			<td>${book.author}</td>   
  			<td>${book.publisher}</td>
  			<td><a href="getEditBook?id=${book.bookId}">Update</a> &nbsp;
				<a href="deleteBook?id=${book.bookId}">Delete</a>
  			</td>
  		</tr>
  	</c:forEach>
  </tbody>
  </table>
</div>

</div>
  </body>
</html>