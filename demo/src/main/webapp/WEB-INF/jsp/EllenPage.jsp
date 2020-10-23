<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${type.equals('read')}">
<form action="/read" method="post">
	Read
	<br>
	<br>
	<label>Id<input type="text" name="id"></label>
	<br>
	<input type="submit" value="read">
	<br>
	<br>
	<c:if test="${id != null}">
		<div>Id: ${id}</div>
		<div>Name: ${name}</div>
		<div>Email: ${email}</div>
		<div>Level: ${level}</div>
		<div>Primary Skill: ${primarySkill}</div>
	</c:if>
</form>
</c:if>

<c:if test="${type.equals('create')}">
<form action="/create" method="post">
	Create
	<br>
	<br>
	<label>Name<input type="text" name="name"></label>
	<br>
	<label>Email<input type="text" name="email"></label>
	<br>
	<label>Level<input type="text" name="level"></label>
	<br>
	<label>Primary skill<input type="text" name="primarySkill"></label>
	<br>
	<input type="submit" value="create">
	<br>
</form>
</c:if>

<c:if test="${type.equals('delete')}">
<form action="/delete" method="post">
	Delete
	<br>
	<br>
	<label>Name<input type="text" name="id"></label>
	<br>
	<label>Name<input type="text" name="name"></label>
	<br>
	<label>Email<input type="text" name="email"></label>
	<br>
	<label>Level<input type="text" name="level"></label>
	<br>
	<label>Primary skill<input type="text" name="primarySkill"></label>
	<br>
	<input type="submit" value="create">
	<br>
</form>
</c:if>

<c:if test="${type.equals('update')}">
<form action="/update" method="post">
	Update
	<br>
	<br>
	<label>Name<input type="text" name="id"></label>
	<br>
	<label>Name<input type="text" name="name"></label>
	<br>
	<label>Email<input type="text" name="email"></label>
	<br>
	<label>Level<input type="text" name="level"></label>
	<br>
	<label>Primary skill<input type="text" name="primarySkill"></label>
	<br>
	<input type="submit" value="create">
	<br>
</form>
</c:if>

</body>
</html>