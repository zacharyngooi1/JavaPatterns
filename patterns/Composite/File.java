public class File implements DirectryInterface {

    private String name;
    private int FileID;
    
	public File(String name, int id) {
		this.name = name;
		this.FileID = id;
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
		return "File [FileID=" + FileID + ", name=" + name + "]";
	}

    
    
    
}