package pa.formulaRacing.model;

/**
 * Interfaccia che definisce l'accelerazione di un veicolo ossia il suo spostamento sul piano gara.
 *
 * @param <N> il tipo che si vuole utilizzare per definire le coordinate del vettore accelerazione.
 */
public interface Acceleration<N> {

    /**
     * Restituisce lo spostamento orizzonatale di un veicolo.
     *
     * @return lo spostamento orizzontale di un veicolo.
     */
    N getX();

    /**
     * Aggiorna lo spostamento orizzontale di un veicolo.
     *
     * @param x lo spostamento orizzontale di un veicolo.
     */
    void setX(N x);

    /**
     * Restituisce lo spostamento verticale di un veicolo.
     *
     * @return lo spostamento verticale di un veicolo.
     */
    N getY();

    /**
     * Aggiorna lo spostamento verticale di un veicolo.
     *
     * @param y lo spostamento orizzontale di un veicolo.
     */
    void setY(N y);
}
