package Design_Patterns.Structural_Patterns.CompositePattern.FileSystem_Solution;

public class File implements FileSystem{
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name: " + fileName);
    }
}

