/**
 * 
 */
package cursoJava;

/**
 * 
 */
public class Fundamentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome = "Gabriel Pereira";
		int idade = 17;
		char sexo = 'M';
		double temperatura = 26.2;
		boolean arCondicionado = false;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Tempertura: " + temperatura);
		System.out.println("arCondicionado: " + arCondicionado);
		System.out.println("______________________");
		double a = 10;
		System.out.println("Operadores Aritméticos e de atribuição");
		System.out.println("Exemplos:");
		System.out.println("A= " + a);
		System.out.println("A= " + a + " + 5 | a = " + (a + 5));
		System.out.println("A= " + a + " - 5 | a = " + (a - 5));
		System.out.println("A= " + a + " * 5 | a = " + (a * 5));
		System.out.println("A= " + a + " / 5 | a = " + (a / 5));
		System.out.println("A= " + a + " % 5 | a = " + (a % 5));
		System.out.println("a += 5   |a = " + (a += 5));
		System.out.println("a -= 5   |a = " + (a -= 5));
		System.out.println("a *= 5   |a = " + (a *= 5));
		System.out.println("a /= 5   |a = " + (a /= 5));
		System.out.println("____________________________________");
		System.out.println("Extrutura de Controle");
		System.out.println("");
		System.out.println("Estrutura de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 : IF");
		if (sexo == 'M') {
			System.out.println("Alistamento Militar obrigatório");
		}
		System.out.println("");
		System.out.println("Exemplo 2 : IF - ELSE");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'switch case'");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println("");
		System.out.println("Estrutura de repetiçãol");
		System.out.println("");
		System.out.println("Exemplo 4 : Uso do 'For");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("_____________________________");
		System.out.println("Exemplo 5 : Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " * " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("_____________________________");
		System.out.println("Exemplo 6 : While");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("_____________________________");
		System.out.println("Exemplo 6 : Do While");
		char novoJogo;
		do {
			System.out.println("Desejesa jogar novamente? [S|N]");
			novoJogo = 'N';
			} while (novoJogo == 'S');
		System.out.println("Game Over");
	}

}
