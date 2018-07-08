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
		<form id="cad" action="" method="post">
			<div>
				<input type="text" name="nome" class="inpG" required="required" placeholder="Insira seu nome para cadastro">
			
				<input type="text" name="telefone" class="inpP" required="required" placeholder="Insira seu Telefone para cadastro">
			</div>
			<div>
				<input type="text" name="nome" class="inpG" required="required" placeholder="Insira seu nome da Empresa para cadastro">
				<input type="text" name="CPF" class="inpP" required="required" placeholder="Insira seu CPF para cadastro">
			</div>
			<div>
			<input type="text" name="CEP" class="inpP" required="required" placeholder="Insira seu CEP para cadastro">
			<input type="text" name="nome" class="inpG" required="required" placeholder="Logradouro">
			</div>
			
			<div>
			<input type="text" name="complemento" class="inpG" placeholder="Complemento">
			<input type="text" name="numero" class="inpP" required="required" placeholder="Numero">
			</div>
			
			<div>
			
				<input type="text" name="bairro" class="inpP" required="required" placeholder="Bairro">
				<input type="text" name="cidade" class="inpPP" required="required" placeholder="Cidade">
				<input type="text" name="estado" class="inpPP" required="required" placeholder="Estado">
			
			</div>
			<div>
				<input type="submit" class="btn" value="Cadastrar">
			</div>
			
			<label>Já possuo uma conta: <a href="login.jsp"> Entrar</a></label>
		
		</form>
				
			
	</div>
	
	<footer>
		
	</footer>

</body>
</html>