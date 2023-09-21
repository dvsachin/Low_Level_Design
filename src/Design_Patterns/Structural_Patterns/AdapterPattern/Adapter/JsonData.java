package Design_Patterns.Structural_Patterns.AdapterPattern.Adapter;

import Design_Patterns.Structural_Patterns.AdapterPattern.Adaptee.CSVData;
import Design_Patterns.Structural_Patterns.AdapterPattern.Adaptee.DataType;
import Design_Patterns.Structural_Patterns.AdapterPattern.Adaptee.XMLData;

public class JsonData implements DataTypeAdapter {
    DataType dataType;
    public JsonData(DataType dataType) {
        this.dataType = dataType;
    }
    @Override
    public String getJsonData() { // conversion logic
        String fromData = dataType.getData();

        if(dataType instanceof XMLData) {
            // some-logic
            return "Json-Data converted from "+fromData;
        }
        else if(dataType instanceof CSVData) {
            // some-logic
            return "Json-Data converted from "+fromData;
        }
        else return "empty-String-passed";
    }
}




