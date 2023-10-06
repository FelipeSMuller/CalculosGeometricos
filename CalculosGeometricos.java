package treinandoMetodos;

import javax.swing.JOptionPane;

public class CalculosGeometricos {

	public static void main(String[] args) {

		int userAnswer = 0;

		int userInput = 0;

		do {

			try {

				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"SEJA BEM VINDO A CALCULADORA GEOMÉTRICA \n1-Área do Quadrado \n2-Área do Retângulo \n3-Área do Círculo "));

			} catch (NumberFormatException | NullPointerException erro) {
				JOptionPane.showMessageDialog(null,
						"Você inseriu dados inválidos ou o programa foi encerrado incorretamente");
			}

			switch (userInput) {

			case 1:

				CalculosMetodos.calcularQuadrado(0.0);

				userAnswer = JOptionPane.showConfirmDialog(null, "Deseja calcular o perímetro do quadrado?");

				if (userAnswer == 0) {

					CalculosMetodos.calcularPerimetro(0.0);

				} else {

					JOptionPane.showMessageDialog(null, "Fim da aplicação!!");
				}
				break;

			case 2:

				CalculosMetodos.calcularRetangulo(0.0, 0.0);

				userAnswer = JOptionPane.showConfirmDialog(null, "Deseja calcular o perímetro do Retângulo???");

				if (userAnswer == 0) {

					CalculosMetodos.calcularPerimetro(0.0, 0.0);

				} else {

					JOptionPane.showMessageDialog(null, "Fim da aplicação!!");
				}

				break;

			case 3:

				CalculosMetodos.calcularCirculo(0.0);

				userAnswer = JOptionPane.showConfirmDialog(null, "Deseja calcular o perímetro do Retângulo???");

				if (userAnswer == 0) {

					CalculosMetodos.calcularPerimetro(0.0);

				}

				else {

					JOptionPane.showMessageDialog(null, "Fim da aplicação!!");

				}

				break;

			default:

				JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida, portanto a aplicação foi finalizada");

				break;

			}

		} while (userInput > 0);

	}

}
