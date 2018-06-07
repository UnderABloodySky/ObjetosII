package file;

import java.util.Date;

public interface FileSystem{
	
	public int totalSize();
	
	public void printStructure();
	
	public FileSystem lastModified();
	
	public FileSystem oldestElement();

	public Date lastModification();

}