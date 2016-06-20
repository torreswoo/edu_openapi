<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.multi.contactweb.biz.vo.*" %>
<%
	List<Contact> list = (List<Contact>)request.getAttribute("list");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	window.onload = function(){
		var insert = document.getElementById("insert");
		var update = document.getElementById("update");
		var del = document.getElementById("delete");
		var no = document.getElementById("no");
		var f1 = document.getElementById("f1");

	
		insert.onclick = function(){
			no.value = "0";
			f1.submit();
		};
		update.onclick = function(){
			f1.action="update.do";
			f1.submit();
		};
		del.onclick = function(){
			f1.action="delete.do";
			f1.submit();
		};
	}
</script>

</head>

<body>
	<div>
		<form id="f1" method="POST" action="insert.do">
			번호 : <input type="text" id="no" name="no" value="0"/><br/>
			이름 : <input type="text" id="name" name="name"/><br/>
			전화 : <input type="text" id="tel" name="tel"/><br/>
			<input id="insert" type="button" value="추가"/>
			<input id="update" type="button" value="수정"/>
			<input id="delete" type="button" value="삭제"/>
		</form>
	</div>


	<div>
<% for(Contact c:list){ %>
	<%= c.getNo() %> :<%=c.getName() %>, <%=c.getTel() %><br/> 
<%} %>
	</div>


</body>
</html>