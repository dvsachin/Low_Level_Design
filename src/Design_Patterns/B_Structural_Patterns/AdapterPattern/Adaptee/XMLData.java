package Design_Patterns.B_Structural_Patterns.AdapterPattern.Adaptee;

public class XMLData implements DataType{
    @Override
    public String getData() {
        return "XML-Data";
    }
}


