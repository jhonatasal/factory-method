package factory;

import factory.vehicles.IVehicle;

public abstract class Transport {
	void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRote();
	}

	protected abstract IVehicle createTransport();
}
