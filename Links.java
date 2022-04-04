package links;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Links {

	public static void main(String[] args) {
		// projeto pra abrir links
		Scanner input = new Scanner(System.in);
		int n1;
		System.out.println("escolha uma rede social para acessar"
				+ "\n(1) Instagram"
				+ "\n(2) Behance"
				+ "\n(3) Youtube");
		n1 = input.nextInt();
		//condiçã pra saber o link que será aberto 
		if (n1 == 1){
			try {
				URI Link = new URI("www.instagram.com/hiroshi_dzn/");
				Desktop.getDesktop().browse(Link);
			}catch(Exception erro){
				System.out.println(erro);
			}
		}else if (n1 == 2){
			try {
				URI Link = new URI("www.behance.net/designerhi7774");
				Desktop.getDesktop().browse(Link);
			}catch(Exception erro){
				System.out.println(erro);
			}
		}else if (n1 == 3){
			try {
				URI Link = new URI("www.youtube.com/channel/UCxmvsly20f0iBMW2Wvwe5Dg");
				Desktop.getDesktop().browse(Link);
			}catch(Exception erro){
				System.out.println(erro);
			}
		}else {
			System.out.println("digite uma alternativa válida");
		}

	}

}
