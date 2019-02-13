package ua.lviv.iot.shipment.managers;

import ua.lviv.iot.shipment.models.Port;

public class TransportationManagerImplementation implements ITransportationManager{

    @Override
    public double calculatePrice(Port start, Port destination, String good, double goodAmount) {
        return 0;
    }

}
