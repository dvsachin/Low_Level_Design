package Design_Patterns.B_Structural_Patterns.CompositePattern.FileSystem_Problem;

public class Main {

    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        File matrix = new File("Matrix");
        movieDirectory.add(matrix);

        Directory marvelCollection = new Directory("Marvel Collection");
        File firstAvenger = new File("Captain America");
        marvelCollection.add(firstAvenger);
        movieDirectory.add(marvelCollection);

        movieDirectory.ls();
    }
}

