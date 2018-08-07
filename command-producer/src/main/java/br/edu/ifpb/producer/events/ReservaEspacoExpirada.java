package br.edu.ifpb.producer.events;

import io.eventuate.tram.events.common.DomainEvent;

public class ReservaEspacoExpirada implements DomainEvent {

    public ReservaEspacoExpirada() {
    }

    public ReservaEspacoExpirada(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    private String codigoReserva;

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

}
