package classes;

import javax.swing.JOptionPane;

public class Senha {
		public String senha;

		public void cadastrarSenha() {
			boolean validou;
			do {
				validou = false;
				String senhaCliente = JOptionPane.showInputDialog("Criar senha. \nDigite uma senha: \nApenas números e mínimo 6 caracteres.");
				if(senhaCliente.length() < 6) {
					JOptionPane.showMessageDialog(null, "A senha deve conter mais que 6 dígitos!");
					validou = true;
				}else {
						for(int i = 0; i < senhaCliente.length(); i++) {
						if(senhaCliente.charAt(i) != '0' 
								&& senhaCliente.charAt(i) != '1'
								&& senhaCliente.charAt(i) != '2'
								&& senhaCliente.charAt(i) != '3'
								&& senhaCliente.charAt(i) != '4'
								&& senhaCliente.charAt(i) != '5'
								&& senhaCliente.charAt(i) != '6'
								&& senhaCliente.charAt(i) != '7'
								&& senhaCliente.charAt(i) != '8'
								&& senhaCliente.charAt(i) != '9') {
							JOptionPane.showMessageDialog(null, "A senha deve conter apenas números!");
							validou = true;
							break;
						}
					}
				}
				if(validou == false) {
					this.senha = senhaCliente;
					JOptionPane.showMessageDialog(null, "Senha criada com sucesso!");
				}
			} while (validou);
		}
		
		public void alterarSenha() {
			boolean validou;
			do {
				validou = false;
				String senhaAux = JOptionPane.showInputDialog("Trocar senha. \nDigite a nova senha: ");
				if(senhaAux.length() < 6) {
					JOptionPane.showMessageDialog(null, "A senha deve conter um mínimo de 6 caracteres.");
					validou = true;
				}else {
					for(int i = 0; i < senhaAux.length(); i++) {
						if(senhaAux.charAt(i) != '0' 
								&& senhaAux.charAt(i) != '1'
								&& senhaAux.charAt(i) != '2'
								&& senhaAux.charAt(i) != '3'
								&& senhaAux.charAt(i) != '4'
								&& senhaAux.charAt(i) != '5'
								&& senhaAux.charAt(i) != '6'
								&& senhaAux.charAt(i) != '7'
								&& senhaAux.charAt(i) != '8'
								&& senhaAux.charAt(i) != '9') {
							JOptionPane.showMessageDialog(null, "Aceita apenas números.");
							validou = true;
							break;
						}
					}
					if(validou == false) {
						this.senha = senhaAux;
						JOptionPane.showMessageDialog(null, "Senha alterada.");
					}
				}
			}while(validou);
		}

		
		
}
