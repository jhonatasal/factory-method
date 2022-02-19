package factory;

public class Main {

	private static Transport transport;

	public static void main(String[] args) {
		String tipo = "eat";
		configure(tipo);
		if (transport != null) {
			runTransport();
		}
	}

	private static void runTransport() {
		transport.startTransport();
	}

	private static void configure(String tipo) {
		switch (tipo) {
			case "uber": {
				transport = new CarTransport();
				break;
			}
			case "log": {
				transport = new MotorcycleTransport();
				break;
			}
			case "eat": {
				transport = new BicycleTransport();
				break;
			}
		}

	}
}
