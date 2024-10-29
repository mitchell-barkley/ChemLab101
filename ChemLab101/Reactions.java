package ChemLab101.ChemLab101;
public class Reactions {
    private String name;
    private String description;
    private String equation;
    private String type;
    private String classification;

    public Reactions(String name, String description, String equation, String type, String classification) {
        this.name = name;
        this.description = description;
        this.equation = equation;
        this.type = type;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEquation() {
        return equation;
    }

    public String getType() {
        return type;
    }

    public String getClassification() {
        return classification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nEquation: " + equation + "\nType: " + type + "\nClassification: " + classification;
    }
}
