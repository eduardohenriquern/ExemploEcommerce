# Exemplo para aulas de Teste Funcional (Caixa-Preta)

Descrição

1. Defina as classes de equivalência para a funcionalidade descrita a seguir:

Assuma que você faz parte de uma empresa terceirizada de testes que irá prestar serviços em um sistema de e-commerce de uma outra empresa. Sua função será testar o módulo de pagamento do sistema, o qual apresenta os seguintes detalhes: os clientes cadastrados no programa de cashback recebem 5% de descontos em compras abaixo de R$ 100. Em compras de R$ 100 à R$ 250, o cashback é de 8%. Caso o cliente realize uma compra acima de R$ 250, mas que seja inferior à R$ 800, o cashback é de 12%. Para compras maiores, a partir de R$ 800, o cliente receberá 15% de cashback da loja. É importante ressaltar, que o programa de cashback só é válido para compras a partir de R$ 50. Considere também que o cashback é descontado no preço de compra.
Há também os clientes que optam pela compra normal e não estão cadastrados no programa de cashback. Estes cliente podem realizar pagamentos com o cartão de crédito da loja, recebendo 10% de desconto em compras a partir de R$ 50.

2. Com as classes de equivalência definidas, elabore casos de teste que satisfaçam cada classe. Considere utilizar o critério de Análise de Valor Limite para obter casos de teste mais precisos.

3. Desenvolva os testes parametrizados para a funcionalidade considerando os casos de teste definidos.

Método:
calcularPagamento( String tipoCliente, double precoCompra)
output( double precoPago )
