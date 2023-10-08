# ANOTAÇÕES

## VARIÁVEIS

Variáveis de tipo "LONG" - Colocar "L" no final.
    ex. " long cpf = 38828479809'L' "


Variáveis de tipo "FLOAT" - Colocar "F" no final.
    ex. " float pi = 3.14'F' "

## OPERADORES

### UNARIOS

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
(!) Operador unário lógico de negação – nega o valor de uma expressão booleana;

### TERNÁRIOS

O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:

<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>

### RELACIONAIS

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.

== Quando desejamos verificar se uma variável é IGUAL A outra.
!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
< Quando desejamos verificar se uma variável é MENOR QUE outra.
<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

### COMPARAÇÃO AVANÇADA

Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio de como o Java trata o armazenamento deste valores na memória.

{% hint style="success" %} Quando estiver mais familiarizado com linguagem, recomendamos se aprofundar no conceito de espaço em memória Stack versus Heap. {% endhint %}

Vamos a alguns exemplos para ilustrar:

Valor e referência: Precisamos entender que em Java tudo é objeto, logo objetos diferentes podem ter as mesmas características, mas lembrando, são objetos diferentes.

### LÓGICOS

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

&& Operador Lógico "E"
|| Operador Lógico "OU"


## MÉTODOS

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

### CRITÉRIOS DE NOMEAÇÃO DE MÉTODOS

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

Deve ser nomeado como verbo
Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).


## ESCOPO

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

public class Conta {
	//variavel da classe conta
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}
