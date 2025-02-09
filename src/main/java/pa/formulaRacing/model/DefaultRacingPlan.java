package pa.formulaRacing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementazione di default del piano gara.
 */
public class DefaultRacingPlan implements RacingPlan<DefaultRacingVehicle, DefaultPosition> {

    private final int height;
    private final int width;
    private final List<DefaultPosition> allPositions;
    private final List<DefaultRacingVehicle> allVehicles;
    private List<DefaultPosition> grid;
    private List<DefaultPosition> finishLine;

    /**
     * Costruttore di un piano di gara.
     *
     * @param height       l'altezza del piano di gara.
     * @param width        la larghezza del piano di gara.
     * @param allPositions tutte le posizioni del piano di gara.
     */
    public DefaultRacingPlan(int height, int width, List<DefaultPosition> allPositions) {
        this.height = height;
        this.width = width;
        this.allPositions = allPositions;
        this.allVehicles = new ArrayList<>();
        this.createGrid();
        this.createFinishLine();
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public List<DefaultPosition> getAllPositions() {
        return this.allPositions;
    }

    /**
     * Restituisce il veicolo con quelle coordinate.
     *
     * @param x la coordinata x.
     * @param y la coordinata y.
     * @return la posizione con quelle coordinate, se presente.
     */
    public Optional<DefaultPosition> getPosition(int x, int y) {
        return allPositions.parallelStream().filter(p -> p.getX() == x && p.getY() == y).findFirst();
    }

    @Override
    public List<DefaultRacingVehicle> getAllVehicles() {
        return this.allVehicles;
    }

    @Override
    public Optional<DefaultRacingVehicle> isBusy(DefaultPosition position) {
        return allVehicles.parallelStream().filter(rc -> rc.getPosition().equals(position)).findFirst();
    }

    @Override
    public List<DefaultPosition> getGrid() {
        return this.grid;
    }

    @Override
    public List<DefaultPosition> getFinishLine() {
        return this.finishLine;
    }

    /**
     * Crea la griglia di partenza del tracciato.
     */
    private void createGrid() {
        this.grid = this.allPositions.stream()
                .filter(p -> p.getStatus().equals(StatusPosition.GRID))
                .collect(Collectors.toList());
    }

    /**
     * Crea il traguardo del tracciato.
     */
    private void createFinishLine() {
        this.finishLine = this.allPositions.stream()
                .filter(p -> p.getStatus().equals(StatusPosition.FINISH))
                .collect(Collectors.toList());
    }

    /**
     * Restituisce le posizioni interne alla pista.
     *
     * @return le posizioni interne alla pista.
     */
    public List<DefaultPosition> trackPositions() {
        return this.allPositions.parallelStream()
                .filter(p -> p.getStatus().equals(StatusPosition.IN) || p.getStatus().equals(StatusPosition.FINISH))
                .collect(Collectors.toList());
    }

    /**
     * Restituisce una poszione della pista con quelle coordinate.
     *
     * @param x la coordinata x della posizione che vogliamo controllare.
     * @param y la coordinata y della posizione che vogliamo controllare.
     * @return la posizione della pista con quelle coordinate se presente.
     */
    public Optional<DefaultPosition> getTrackPostion(int x, int y) {
        return this.trackPositions().parallelStream().filter(p -> p.getX() == x && p.getY() == y).findFirst();
    }

    @Override
    public void addVehicleToGrid(DefaultRacingVehicle racingVehicle, int gridPosition) throws NullPointerException, IllegalArgumentException {
        if (racingVehicle == null)
            throw new NullPointerException("Il veicolo non puo' essere nullo");
        if (grid.size() < gridPosition || gridPosition <= 0)
            throw new IllegalArgumentException("La griglia non ha la posizione di partenza indicata");
            if (this.isBusy(this.grid.get(gridPosition - 1)).isPresent())
                throw new IllegalArgumentException("La posizione " + gridPosition + " e' gia' occupata");
            racingVehicle.setPosition(this.grid.get(gridPosition - 1));
            allVehicles.add(racingVehicle);
    }

}
