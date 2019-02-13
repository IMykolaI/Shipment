package ua.lviv.iot.shipment.managers;

import ua.lviv.iot.shipment.models.Port;

public interface ITransportationManager {

    double calculatePrice(Port start, Port destination, String good, double goodAmount);
}