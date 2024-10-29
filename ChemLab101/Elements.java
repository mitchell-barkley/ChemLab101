package ChemLab101.ChemLab101;
public class Elements {
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;
    private String state;
    private String classification;
    private String description;

    public Elements(String name, String symbol, int atomicNumber, double atomicWeight, String state, String classification, String description) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
        this.state = state;
        this.classification = classification;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public String getState() {
        return state;
    }

    public String getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Name: " + name + "\nSymbol: " + symbol + "\nAtomic Number: " + atomicNumber + "\nAtomic Weight: " + atomicWeight + "\nState: " + state + "\nClassification: " + classification + "\nDescription: " + description;
    }
}
