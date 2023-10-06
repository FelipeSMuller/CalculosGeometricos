package treinandoMetodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculosMetodos {

	// ==============================================================================================================================

	// Cálculo área Circulo
	public static void calcularCirculo(Double raio) {

		// Entrada do Raio.
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Raio do círculo"));

		// Chama o método de verificação, caso o número seja negativo ou zero gera uma
		// mensagem no prompt
		tratamentoErroDouble(raio);

		// a variavel recebe o valor do raio ao quadrado e multiplica pelo valor do Pi.
		Double areaCirculo = Math.pow(raio, 2) * 3.14;

		// Formata o número
		String circuloFormatado = formatarNumeros(areaCirculo);

		// Imprime o valor formatado
		JOptionPane.showMessageDialog(null, "Área do círculo =  " + circuloFormatado);

	}

	// Inicio dos cálculos do Retângulo
	public static void calcularRetangulo(Double base, Double altura) {

		// Entrada dos valores da base e altura
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Retângulo"));

		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Retângulo"));

		// Verifica os dois números com base nos parametros feitos durante a aplicação
		tratamentoErroDouble(base, altura);

		Double areaRetangulo = base * altura;

		// Armazena o valor e chama o metodo de formatação
		String areaRetanguloFormatada = formatarNumeros(areaRetangulo);

		// Imprime o valor formatado
		JOptionPane.showMessageDialog(null, "Área do Retângulo =  " + areaRetanguloFormatada);

	}

	// ínicio do Cálculo da Área do quadrado.
	public static void calcularQuadrado(Double primeiroNumero) {

		// Entrada do usuário
		primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro lado do quadrado"));

		// Método para tratamento de erro, que recebe como parametro os dois valores

		// inseridos anteriomente.
		tratamentoErroDouble(primeiroNumero);

		// Armazena os valores inseridos em uma variavel
		Double area = Math.pow(primeiroNumero, 2);

		// Imprime a variavel área , formatada com o DecimalFormat.

		// Método criado específicamente para formatação de números, evitando a
		// repetição da instancia de um novo objeto

		String areaFormatada = formatarNumeros(area);

		JOptionPane.showMessageDialog(null, "Área do Quadrado =  " + areaFormatada);

	}

	// ==============================================================================================================================

	// Cálculo do perimetro, caso o usuario opte por seleciona-la.

	public static void calcularPerimetro(Double primeiroNumero) {

		primeiroNumero = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Insira um número para calcular seu perimetro"));

		// Verifica o número inserido.
		tratamentoErroDouble(primeiroNumero);

		// O número inserido multiplicado por 4 obtém o perímetro de um quadrado.
		Double perimetro = primeiroNumero * 4;

		String perimetroFormatado = formatarNumeros(perimetro);

		JOptionPane.showMessageDialog(null, "Perímetro do Quadrado = " + perimetroFormatado);

	}

	public static void calcularPerimetroCirculo(Double raio) {

		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um raio para calcular o perímetro"));
		tratamentoErroDouble(raio);

		Double perimetroCirculo = 2 * 3.14 * raio;

		String perimetroCirculoFormatado = formatarNumeros(perimetroCirculo);

		JOptionPane.showMessageDialog(null, "Perímetro ( Circunferência do Círculo ) = " + perimetroCirculoFormatado);
	}

	// Método sobrecarregado -> Cálculo do perímetro do Retângulo
	public static void calcularPerimetro(Double primeiroNumero, Double segundoNumero) {

		primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Retângulo"));

		segundoNumero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Retângulo"));

		tratamentoErroDouble(primeiroNumero, segundoNumero);

		Double perimetroRetangulo = 2 * (primeiroNumero + segundoNumero);

		String perimetroRetanguloFormatada = formatarNumeros(perimetroRetangulo);

		JOptionPane.showMessageDialog(null, "Perímetro do Retângulo =  " + perimetroRetanguloFormatada);

	}

	// Tratamento de erro para numeros decimais, verificará diversas partes onde a
	// entrada do usuário pode receber um número negativo ou igual a 0
	public static void tratamentoErroDouble(Double primeiroNumero) {

		try {

			if (primeiroNumero <= 0) {

				JOptionPane.showMessageDialog(null, "Você inseriu um número negativo ou igual a zero \nERRO!!");

			}
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"O programa foi encerrado incorretamente ou dados inválidos foram inseridos!!!");

		}

	}

	// Método sobrecarregado
	public static void tratamentoErroDouble(Double primeiroNumero, Double segundoNumero) {

		try {

			if (primeiroNumero <= 0 || segundoNumero <= 0) {

				JOptionPane.showMessageDialog(null, "Você inseriu um número negativo ou igual a zero \nERRO!!");

			}
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"O programa foi encerrado incorretamente ou dados inválidos foram inseridos!!!");

		}

	}

	// Método que formata números decimais, evitando a duplicação de código
	public static String formatarNumeros(Double numeroFinal) {

		DecimalFormat df = new DecimalFormat("##.## m²");

		return df.format(numeroFinal);

	}

}