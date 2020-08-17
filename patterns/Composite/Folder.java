import java.util.ArrayList;

public class Folder implements DirectryInterface {

    private ArrayList<DirectryInterface> directories;
    private String name;
    private int FileID;

	public Folder(String newName, int id) {
        setFileID(id);
        setName(newName);
		this.directories = new ArrayList<>();
	}
	public ArrayList<DirectryInterface> getDirectories() {
		return directories;
	}
	public void addDirectories(DirectryInterface directory) {
        this.directories.add(directory);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFileID() {
		return FileID;
	}
	public void setFileID(int fileID) {
		FileID = fileID;
	}
	@Override
	public String toString() {
		return "Folder [FileID= " + FileID + " name= " + name + "]" +", subfolders=" + directories.toString();
	}

    
}