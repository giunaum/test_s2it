<h1> Avaliação Técnica
=

<br>
<p> * Utilizar a linguagem java, nos casos que couber, utilizar recursos da API.
 
<h4> 1 - Acerca de sistemas de desenvolvimento web, assinale a opção correta.
<p> A (<b>X</b>) - Servlet é uma classe do Java que possibilita ampliar os recursos de servidores web, desenvolvida para permitir conteúdos dinâmicos orientados ao usuário.</b>
<p> B ( ) - Para utilizar bancos de dados relacionais em aplicações desenvolvidas em JSP, é obrigatória a utilização do Hibernate, que é um framework que realiza o mapeamento objeto/relacional.
<p> C ( ) - O Ajax permite interagir com dados textuais nos formatos UTF-8 e XML, porém restringe o acesso a JSON (Java Script Object Notation) e a bancos de dados relacionais.
<p> D ( ) - No XMLHttpRequest, utilizado para trocar dados com um servidor, com o intuito de melhorar sua usabilidade, o método open ( ) aceita somente requisições no modo asynchronous.
<p> E ( ) - O JSF (Java Server Faces) permite usar tags customizadas limitadas a páginas JSP, com vistas a encapsular a segurança na forma nativa do acesso aos JavaBeans.

<h4> 2 - Um programador web foi contratado para desenvolver um site utilizando HTML, CSS, JSP e Servlets. Para tanto, deve usar um servidor escrito em Java, que não é contêiner EJB, mas é utilizado como servlet container, denominado
<p> A ( ) - GlassFish.
<p> B ( ) - JBoss.
<p> C ( ) - WebLogic.
<p> D (<b>X</b>) - Jetty.
<p> E ( ) - WebSphere.

<h4> 3 - São apenas tipos de componentes executados em servidores Web:
<p> A ( ) - Beans, Servlets e J2EE.
<p> B ( ) - JVM, Servlets e JSP.
<p> C (<b>X</b>) - Beans, Servlets e JSP.
<p> D ( ) - Beans, Swing e JSP. E - Beans, Swing e JVM.

<h4> 4 - Analise os itens a seguir sobre JEE e EJB.
<p> I. Um servidor J2EE fornece contêineres EJB e Web.
<p> II. O contêiner EJB gerencia a execução de EJBs em aplicações J2EE.
<p> III. O contêiner Web gerencia a execução de páginas JSP e componentes servlet em aplicações J2EE.
<p> IV. Um session bean representa um único cliente dentro do servidor J2EE. Para acessar um aplicativo que é instalado no servidor, o cliente invoca os métodos do session bean.
<p> Está correto o que se afirma em:
<p> A (<b>X</b>) - I, II, III e IV.
<p> B ( ) - I e II, apenas.
<p> C ( ) - I, III e IV, apenas.
<p> D ( ) - I e IV, apenas. E - III e IV, apenas.

<h4> 5 - Spring Framework é uma plataforma Java completa que fornece suporte de infraestrutura para o desenvolvimento de aplicações Java. Acerca das características do framework Spring 3.0, assinale a opção correta.
<p> A (<b>X</b>) - Na arquitetura Spring MVC Web, o Validator é uma classe opcional que pode ser invocada para validar dados de formulários.
<p> B ( ) - A injeção de dependência é feita após a criação do objeto, por meio dos métodos set de uma classe no estilo JavaBean, e não no momento da criação do objeto, tendo-se em vista que passar muitos argumentos no construtor pode tornar-se dispendioso.
<p> C ( ) - A interface BeanFactory gerencia beans definidos em arquivos XML e trata recursos de mensagens.
<p> D ( ) - O controlador AbstractWizardFormController, do módulo Spring MVC, permite suporte para o preenchimento de formulários a partir de determinada solicitação.
<p> E ( ) - A porta de entrada do navegador web para a arquitetura Spring MVC Web é a componente Interface (JSP/HTML).

<h4> 6 - No Spring, as configurações de segurança são realizadas no arquivo applicationContext-security.xml, e, para que qualquer página ou diretório seja seguro, é necessário adicionar a esse arquivo o elemento <intercept-url>.
<p> C (<b>X</b>) - Certo
<p> E ( ) - Errado

<h4> 7 - Spring é um framework que suporta a publicação de mensagens para determinado tópico de mensagens para auxílio no desenvolvimento de sistemas complexos. Nesse modelo, o desenvolvedor master não sabe da existência do desenvolvedor associado e vice-versa.
<p> C ( ) - Certo
<p> E (<b>X</b>) – Errado

<h4> 8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:
<p> - O primeiro número de C é o primeiro número de A; - O segundo número de C é o primeiro número de B; - O terceiro número de C é o segundo número de A; - O quarto número de C é o segundo número de B;
<p> Assim sucessivamente...
<p> - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
<p> - Caso C seja maior que 1.000.000, retornar -1
<p> Desenvolva um algoritmo que atenda a todos os requisitos acima.

```
public class Generator {

	private static final int MAX = 1000000;

	private Generator() {
		throw new IllegalStateException("Classe contém somente métodos estáticos.");
	}

	public static Integer generateC(int a, int b) {
		char[] arrayA = Integer.toString(a).toCharArray();
		char[] arrayB = Integer.toString(b).toCharArray();

		int size = arrayA.length >= arrayB.length ? arrayA.length : arrayB.length;

		StringBuilder builderC = new StringBuilder();

		for (int i = BigInteger.ZERO.intValue(); i < size; i++) {
			if (arrayA.length > i) {
				builderC.append(arrayA[i]);
			}

			if (arrayB.length > i) {
				builderC.append(arrayB[i]);
			}
		}

		int c = Integer.parseInt(builderC.toString());

		return c > MAX ? -BigInteger.ONE.intValue() : c;
	}
}
```

<h4> 9 - Considerando a estrutura de uma árvore binária:

```
public class BinaryTree {
	int valor;
	BinaryTree left;
	BinaryTree right;
}
```
<p> Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós subsequentes.

```
public class SumBinaryTree {

	private SumBinaryTree() {
		throw new IllegalStateException("Classe contém somente métodos estáticos.");
	}

	public static int sum(BinaryTree binaryTree) {
		return binaryTree == null ? BigInteger.ZERO.intValue()
				: binaryTree.getValor() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
	}
}
```