package pa.formulaRacing.controller;

import pa.formulaRacing.model.DefaultPilot;
import pa.formulaRacing.model.DefaultRacingVehicle;
import pa.formulaRacing.model.PilotType;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementazione di default di un arbitro.
 */
public class DefaultReferee implements Referee<DefaultPilot> {

    private final List<DefaultPilot> pilots = new ArrayList<>();
    private int turn = 0;
    private boolean isFinish;

    /**
     * Crea il pilota.
     *
     * @param name          nome del pilota.
     * @param racingVehicle veicolo.
     * @param pilotType     tipo di pilota.
     */
    public void createPilot(String name, DefaultRacingVehicle racingVehicle, PilotType pilotType) {
        DefaultPilot pilot = new DefaultPilot(name, racingVehicle, pilotType);
        this.pilots.add(pilot);
    }

    @Override
    public List<DefaultPilot> getPilots() {
        return this.pilots;
    }

    @Override
    public DefaultPilot pilotTurn() {
        int numberPilots = pilots.size();
        return pilots.get(turn % numberPilots);
    }

    /**
     * Passa al turno successivo.
     */
    void nextTurn() {
        this.turn++;
    }

    /**
     * Restituisce true se la gara e' terminata, false altrimenti.
     *
     * @return true se la gara e' terminata, false altrimenti.
     */
    public boolean getIsFinish() {
        return isFinish;
    }

    /**
     * Imposta un valore booleano alla variabile isFinish.
     *
     * @param finish il valore booleano.
     */
    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
