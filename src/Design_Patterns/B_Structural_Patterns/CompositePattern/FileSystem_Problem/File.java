package Design_Patterns.B_Structural_Patterns.CompositePattern.FileSystem_Problem;

public class File {
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}

