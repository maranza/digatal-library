<%-- 
    Document   : library
    Created on : 20 May 2016, 7:00:20 PM
    Author     : maranza
--%>

<%--Java Code: imports--%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.*;"%>
<% Class.forName("org.sqlite.JDBC");%>
<%@page import="sqlconnection.sqlconnection;"%>
<%@page import="sqlconnection.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--- method to connect,query database ---%>
<%
   
    
      sqlconnection objct = new sqlconnection();
    ResultSet books = objct.getBooks();
    

%>
    <%--- initializing object and using the object to get our books ---%>
<%
  
%>

<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css" />
        <title>Library Catalog</title>
    </head>
    <body>
        <h1>Welcome to Mahikeng Community Library catalog</h1>
    
        
          	<div class="datagrid">
	<table>
		<thead>
			<tr>
                            <th>Id</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Edition</th>
                            <th>Category</th>
                            <th>Date</th>
                            <th>ISBN</th>
			</tr>
		</thead>
		<tfoot>
			<tr><td colspan="7">
					<div id="paging">
						<ul>
							<li>
								<a href="#"><span>Previous</span></a>
							</li>
							<li>
								<a href="#" class="active"><span>1</span></a>
							</li>
							<li>
								<a href="#"><span>2</span></a>
							</li>
							<li>
								<a href="#"><span>3</span></a>
							</li>
							<li>
								<a href="#"><span>4</span></a>
							</li>
							<li>
								<a href="#"><span>5</span></a>
							</li>
							<li>
								<a href="#"><span>Next</span></a>
							</li>
						</ul>
				</div>
			</tr>
		</tfoot>
		<tbody>
                     <% while(books.next()){ %>
			<tr class="alt">
				<td><%= books.getInt("id") %></td>
                                <td><%= books.getString("title") %></td>
                                <td><%= books.getString("author") %></td>
                                <td><%= books.getString("edition") %></td>
                                <td><%= books.getString("category") %></td>
                                <td><%= books.getString("date") %></td>
                                <td><%= books.getInt("isbn") %></td>
			</tr>
                     <% } %>
		</tbody>
	</table>
</div>

        
        
        <%--- books table ---%>
    
   <%--- end of books table ---%>
        
    </body>
</html>
