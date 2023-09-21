package Design_Patterns.Structural_Patterns.AdapterPattern.Adaptee;

public class CSVData implements DataType{
    @Override
    public String getData() {
        return "CSV-Data";
    }
}


