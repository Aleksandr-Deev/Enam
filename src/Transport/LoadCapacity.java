package Transport;

public enum LoadCapacity {

    N1(null, 3.5f),
    N2(3.7f, 11.5f),
    N3(12f, null);

    private final Float capacityFrom;

    private final Float capacityTo;

    LoadCapacity(Float capacityFrom, Float capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    public double getCapacityFrom() {
        return capacityFrom;
    }

    public double getCapacityTo() {
        return capacityTo;
    }

    @Override
    public String toString() {
        String capacityFrommString = capacityFrom != null
                ? (" от " + capacityFrom) : "";
        String capacityToString = capacityTo != null
                ? " от " + capacityTo + " тонн " : "";
        return "Грузоподьемность " + capacityFrommString + " " + capacityToString;
    }
}
