<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../static/css/estilos.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header>
		<nav></nav>
	</header>
	
	<div class="main">
		<form id="cad" action="cadastrofinal.jsp" method="post">
			<input type="email" name="email" required="required" placeholder="Insira seu email para cadastro">
			
			<input type="password" name="senha" required="required" placeholder="Insira sua senha para cadastro">
			
			<input type="password" name="conSenha" required="required" placeholder="Confirme sua senha">
			
			<input type="submit" value="Cadastrar">
			<label>Já possuo uma conta: <a href="login.jsp"> Entrar</a></label>
		
		
		</form>
				
			
	</div>
	
	<footer>
		
	</footer>




</body>
</html>