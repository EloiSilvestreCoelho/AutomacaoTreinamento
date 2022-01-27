#language: pt

Funcionalidade: Consutar CEP
	Como usuario do site Americanas
	Lucas quer realizar uma pesquisa de um produto
	Para garantir que o campo CEP realize uma pesquisa 

Cenario: Realizar uma consulta de endereço pelo numero do CEP
	Dado que lucas ao acessar o site Americanas 
	Quando realizar uma pesquisa de um produto e preencher o campo CEP com <06447010>
	Entao o endereco deve ser apresentado na tela
