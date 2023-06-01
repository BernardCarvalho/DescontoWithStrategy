https://github.com/manoelcampos/padroes-projetos/tree/master/exercicios/calculo-desconto

Cálculo de Descontos

Considere que temos um sistema de vendas onde diferentes formas de desconto podem ser implementadas de acordo com as promoções vigentes, como em datas comemorativas. O sistema deve permitir o cálculo do desconto sobre a venda das seguintes maneiras:

    percentual de desconto definido (que pode vir de um banco de dados);

    percentual de desconto progressivo: valor da compra/25, não podendo ultrapassar 20% (este são apenas valores arbitrários de exemplo);

    desconto de 15% na data de aniversário do cliente.

O usuário é quem escolhe o tipo de desconto a ser aplicado, não o programa. O programa deve apenas permitir que seja mudado o algoritmo de cálculo do desconto.
Responda
    
    Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?

        O padrão de projeto "Strategy" permitiria a troca do algoritmo de desconto da venda em tempo de execução.

    Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?

        Com a alteração do preço da venda diretamente no código da função, com o uso de uma estrutura de decisão (if)

    Quais os problemas que tal implementação traria?
        
        A impossibilidade do usuário, por algum motivo, alterar a forma de desconto, se ele já tiver escolhido uma, ou melhor, 
        apenas permitindo essa alteração mediante nova instanciação de um objeto "VendaConcreta", gastando mais processamento/memória do servidor.

    Implemente o projeto e envie o link para repositório no GitHub, onde o README deve conter as respostas.

