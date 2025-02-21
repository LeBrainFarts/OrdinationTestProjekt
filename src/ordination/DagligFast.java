package ordination;

import java.time.LocalDate;
import java.util.ArrayList;

public class DagligFast extends Ordination {
    // TODO
    private final ArrayList<Dosis> dosis = new ArrayList<>();
    private double antal;

    public DagligFast(LocalDate startDen, LocalDate slutDen, Laegemiddel laegemiddel) {
        super(startDen, slutDen, laegemiddel);
    }

    public ArrayList<Dosis> getDosis() {
        return new ArrayList<>(dosis);
    }
    public double getAntal() {
        return antal;
    }

    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        return 0;
    }

    @Override
    public String getType() {
        return "DagligFast";
    }
}
