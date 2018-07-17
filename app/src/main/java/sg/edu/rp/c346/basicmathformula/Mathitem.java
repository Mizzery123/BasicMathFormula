package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17000719 on 17/7/2018.
 */

public class Mathitem {
    private String properties;
    private String formula;

    public Mathitem(String properties, String formula) {
        this.properties = properties;
        this.formula = formula;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "Mathitem{" +
                "properties='" + properties + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}
