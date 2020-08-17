public class DirectoryTest {
    public static void main(String[] args) {
        Folder bigFolder = new Folder("Parent Folder", 99999);
        File sub1 = new File("subfile1", 1);
        File sub2 = new File("subfile2", 2);
        bigFolder.addDirectories(sub1);
        bigFolder.addDirectories(sub2);
        Folder subFolder = new Folder("Child_folder", 555555);
        File childsub1 = new File("Childsubfile1", 10);
        File childsub2 = new File("Childsubfile2", 20);
        subFolder.addDirectories(childsub1);
        subFolder.addDirectories(childsub2);
        bigFolder.addDirectories(subFolder);
        System.out.println(bigFolder.toString());
    }
}