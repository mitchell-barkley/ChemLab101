package ChemLab101.ChemLab101;
public class Compounds {
    private String name;
    private String formula;
    private double molecularWeight;
    private String classification;
    private String description;

    public Compounds(String name, String formula, double molecularWeight, String classification, String description) {
        this.name = name;
        this.formula = formula;
        this.molecularWeight = molecularWeight;
        this.classification = classification;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public double getMolecularWeight() {
        return molecularWeight;
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

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Name: " + name + "\nFormula: " + formula + "\nMolecular Weight: " + molecularWeight + "\nClassification: " + classification + "\nDescription: " + description;
    }
}
