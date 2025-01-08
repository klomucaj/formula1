package pa.formulaRacing.controller;

import pa.formulaRacing.model.DefaultPosition;
import pa.formulaRacing.model.DefaultRacingVehicle;

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
