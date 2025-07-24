
public class exercício1 {
	public static void main(String[] args) {

		// printar inteiros %d
		// printar strings %s
		// printar double %f

		String nome = "Vanessa";
		int idade = 44;
		String cidade = "Campo Grande";
		String hobby = "ver GL's tailandeses";

		System.out.printf(" Olá %s você é muito legal e tem %d anos", nome, idade);
		System.out.println("\n Olá " + nome + " você é muito legal e tem " + idade + " anos");
		System.out.printf("Olá, meu nome é %s, tenho %d anos. Nasci em %s e meu hobby é %s.", nome, idade, cidade,
				hobby);

	}
}