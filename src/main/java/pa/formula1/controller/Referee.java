package pa.formula1.controller;

import pa.formula1.model.DefaultPilot;

import java.util.List;

/**
 * Interfaccia che definisce l'arbitro.
 *
 * @param <P> Il tipo che si vuole utilizzare per definire il Pilota.
 */
public interface Referee<P> {

    /**
     * Restituisce la lista di piloti che gareggiano.
     *
     * @return la lista di piloti che gareggiano.
     */
    List<DefaultPilot> getPilots();

    /**
     * Restituisce il pilota del turno.
     *
     * @return il pilota del turno.
     */
    P pilotTurn();

}
