package structural.composite.fileSystem;


public class Main {
    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie");
        FileSystem fileSystem=new File("Border");
        movieDirectory.add(fileSystem);
        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        FileSystem hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();


    }
}
