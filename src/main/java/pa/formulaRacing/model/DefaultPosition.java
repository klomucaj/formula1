package pa.formulaRacing.model;

import java.util.Objects;

/**
 * Implementazione di default di una posizione del piano di gara.
 */
public class DefaultPosition implements Position {

    private final int x;
    private final int y;
    private StatusPosition statusPosition;

    /**
     * Costruttore di una  posizione.
     *
     * @param y la coordinata sull'asse delle y.
     * @param x la coordinata sull'asse delle x.
     */
    public DefaultPosition(int y, int x) {
        this.y = y;
        this.x = x;
    }

    /**
     * Restituisce la coordinata sull'asse delle x.
     *
     * @return la coordinata sull'asse delle x.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Restituisce la coordinata sull'asse delle y.
     *
     * @return la coordinata sull'asse delle y.
     */
    public int getY() {
        return this.y;
    }

    @Override
    public StatusPosition getStatus() {
        return this.statusPosition;
    }

    @Override
    public void setStatus(StatusPosition status) {
        this.statusPosition = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultPosition position = (DefaultPosition) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "DefaultPosition{" +
                "x=" + x +
                ", y=" + y +
                ", statusPosition=" + statusPosition +
                '}';
    }
}
