package JuegoPeleas;

public class Mago extends Personaje {
	private int inteligencia = 1;

	public int getInteligencia() {
		return inteligencia;
	}

	@Override
	void atacar(Personaje p) {
		int vidaPersonaje = p.getVida() - this.getDaño();
		p.setVida(vidaPersonaje);
		System.out.println("La vida de " + p.getNombre() + " a disminuido en " + this.getDaño() + " puntos");
		System.out.println("Vida restante de " + p.getNombre() + " = " + p.getVida());
	}

	@Override
	int checkArma(Arma a) {
		if (a instanceof Espada) {
			this.setDaño(a.getDañoArma());
			System.out.println("El daño que inflijirá " + this.getNombre() + " sera de " + this.getDaño());

			return this.getDaño();
		} else if (a instanceof Rezo) {
			this.setDaño(a.getDañoArma());
			System.out.println("El daño que inflijirá " + this.getNombre() + " sera de " + this.getDaño());

			return this.getDaño();
		} else if (a instanceof Hechizo) {
			this.setDaño(a.getDañoArma() + inteligencia);
			System.out.println("El daño que inflijirá " + this.getNombre() + " sera de " + this.getDaño());

			return this.getDaño();
		} else if (a instanceof Arco) {
			this.setDaño(a.getDañoArma());
			System.out.println("El daño que inflijirá " + this.getNombre() + " sera de " + this.getDaño());

			return this.getDaño();
		} else {
			System.out.println("Tu personaje no tiene arma");
			return 0;
		}
	}
}