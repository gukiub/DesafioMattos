import javax.swing.JOptionPane;

import br.com.Models.Mensagem;
import br.com.Models.MensagemFactory;


public class Main {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagemFactory.getMenssagem(2);
		mensagem.enviar(texto);
	}

}
