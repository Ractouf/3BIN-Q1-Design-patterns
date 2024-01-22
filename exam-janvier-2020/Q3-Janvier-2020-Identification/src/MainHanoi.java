public class MainHanoi {
	public static void main(String[] args) {
		int taille = 5;

		if (args.length > 0)
			try {
				taille = Integer.parseInt(args[0]);
			} catch (NumberFormatException ignored) {}

		Hanoi hanoi = Hanoi.getInstance(taille);
		hanoi.resoudre();
		final Execution execution = new Execution(hanoi);
		new Thread(() -> new GUI(execution)).start();
		new Console(execution).go();
	}
}
