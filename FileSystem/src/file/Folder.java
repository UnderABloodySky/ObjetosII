package file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder implements FileSystem {
	
	private List<FileSystem> files;
	private Date last;
	
		public Folder() {
			files = new ArrayList<FileSystem>();
			this.setDate();
		}

			@Override
			public int totalSize() {
				int resultado = 0;
				for(FileSystem file : files) {
					resultado += file.totalSize();
				}
				return resultado;
			}
			
			private void setDate() {
				Date today = new Date();
				last = today;
			}
		
			@Override
			public void printStructure() {
				// TODO Auto-generated method stub
			}
		
			@Override
			public FileSystem lastModified() {
				return files.get(files.size()-1);
			}
		
			@Override
			public FileSystem oldestElement() {
				return files.get(0);
			}
		
			@Override
			public Date lastModification() {
				return last;
			}
			
			public void addFile(FileSystem _file) {
				files.add(_file);
				this.setDate();
			}
			
			public void removeFile(FileSystem _file) {
				if(files.contains(_file)) {
					this.setDate();
					files.remove(_file);
				}
			}

}
