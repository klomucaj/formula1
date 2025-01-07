package pa.formula1.controller;

import pa.formula1.model.DefaultPosition;
import pa.formula1.model.DefaultRacingVehicle;

/**
 * Interfaccia che definisce l'intelligenza del bot.
 */
public interface BotIA {

    /**
     * Calcola la posizione che il veicolo dovra' raggiungere.
     *
     * @param racingVehicle il veicolo.
     * @return la posizione che il veicolo dovra' raggiungere.
     */
    DefaultPosition botNextPosition(DefaultRacingVehicle racingVehicle);
}
