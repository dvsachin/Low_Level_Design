package Design_Patterns.B_Structural_Patterns.AdapterPattern.Client;

import Design_Patterns.B_Structural_Patterns.AdapterPattern.Adaptee.CSVData;
import Design_Patterns.B_Structural_Patterns.AdapterPattern.Adaptee.XMLData;
import Design_Patterns.B_Structural_Patterns.AdapterPattern.Adapter.DataTypeAdapter;
import Design_Patterns.B_Structural_Patterns.AdapterPattern.Adapter.JsonData;

public class Main {
    public static void main(String[] args) {
        // have only XML-Data  but Adapter is giving the XML-JSON converted Data
        DataTypeAdapter dta1 = new JsonData(new XMLData());
        System.out.println(dta1.getJsonData());

        DataTypeAdapter dta2 = new JsonData(new CSVData());
        System.out.println(dta2.getJsonData());

    }
}



