public class MachineACafe {
	private enum State {
		IDLE {
			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
				machineACafe.afficherPasAssez(toucheBoisson);
      }
			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {
				machineACafe.setState(State.IDLE);
			}
		},
		COLLECTE,
		PAS_ASSEZ {
			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
				throw new IllegalStateException();
			}

			@Override
			public void entrerMonnaie(Piece piece, MachineACafe machineACafe) {
				machineACafe.montantEnCours += piece.getValeur();
				machineACafe.afficherMontant();

				if (machineACafe.boisson.getPrix() > machineACafe.montantEnCours) {
					machineACafe.afficherPasAssez(machineACafe.boisson);
				} else {
					machineACafe.montantEnCours -= machineACafe.boisson.getPrix();
					machineACafe.afficherBoisson(machineACafe.boisson);
					machineACafe.boisson = null;
					machineACafe.afficherMontant();

					if (machineACafe.montantEnCours == 0) machineACafe.setState(State.IDLE);
					else machineACafe.setState(State.COLLECTE);
				}
			}
		};

		public void entrerMonnaie(Piece piece, MachineACafe machineACafe) {
			machineACafe.montantEnCours += piece.getValeur();
			machineACafe.afficherMontant();

			machineACafe.setState(State.COLLECTE);
		}

		public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
			if (toucheBoisson.getPrix() > machineACafe.montantEnCours) {
				machineACafe.boisson = toucheBoisson;
				machineACafe.afficherPasAssez(machineACafe.boisson);
				machineACafe.setState(PAS_ASSEZ);
				return;
			}

			machineACafe.montantEnCours -= toucheBoisson.getPrix();
			machineACafe.afficherBoisson(toucheBoisson);
			machineACafe.afficherMontant();

			if (machineACafe.montantEnCours == 0)
				machineACafe.setState(State.IDLE);
			else
				machineACafe.setState(State.COLLECTE);
		}

		public void rendreMonnaie(MachineACafe machineACafe) {
			machineACafe.afficherRetour();
			machineACafe.montantEnCours = 0;
			machineACafe.boisson = null;
			machineACafe.setState(State.IDLE);
		}
	}
	private State state;

	private int montantEnCours = 0;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		setState(State.IDLE);
	}
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
	}

	public void entrerMonnaie(Piece piece) {
		state.entrerMonnaie(piece, this);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		state.selectionnerBoisson(toucheBoisson, this);
	}
	
	public void rendreMonnaie() {
			state.rendreMonnaie(this);
	}

	public void setState(State state) {
		this.state = state;
	}
}
