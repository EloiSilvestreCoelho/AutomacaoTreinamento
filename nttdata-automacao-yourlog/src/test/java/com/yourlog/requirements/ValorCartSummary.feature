#language: pt

Funcionalidade: Valor Total CartSummary
			Daniel como usuario do YourLog
			Quer acessar o carrinho de comprar 
			Para verificar o Valor Total 
	
	@produto1
#	 @wip
Esquema do Cenário: Verificar valor total do carrinho de compras com o produto1
	Dado que Daniel acessou a aplicacao yourLog com usuario "email@email.email" e senha "tester123"
	Quando ele navegar ate o Dresses e incluir o produto1 no carrinho de compra 
	Então ele verifica se o valor total do Summary está correto contendo o produto1


   #@wip 
   @produto2   
Esquema do Cenário: Verificar valor total do carrinho de compras com o produto2
	Dado que Daniel acessou a aplicacao yourLog com usuario "email@email.email" e senha "tester123"
	Quando ele navegar ate o Dresses e incluir o produto2 no carrinho de compra 
	Então ele verifica se o valor total do Summary está correto contendo o produto2