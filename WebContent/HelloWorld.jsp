<html>
<body>

	<div
		style="display: flex; flex-flow: column; align-items: center; justify-content: center; margin: 100px auto;">

		<form method="get" action="hello">
			<p>
				<label for="nome">Qual seu nome? </label> <input type="text"
					name="nome" />
			</p>
			<p>
				<input type="submit" value="Enviar">
			</p>
			<p>

				<%
					int numRandon =0;
					numRandon = (int) (Math.random()* 100);
					out.println("Número sorteado: " + numRandon);
				%>


			</p>

		</form>

	</div>

</body>
</html>