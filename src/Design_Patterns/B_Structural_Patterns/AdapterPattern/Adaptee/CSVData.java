package Design_Patterns.B_Structural_Patterns.AdapterPattern.Adaptee;

public class CSVData implements DataType{
    @Override
    public String getData() {
        return "CSV-Data";
    }
}


