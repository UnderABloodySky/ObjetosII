package file;

import java.util.Date;

public class File implements FileSystem {
	
	private int size;
	private Date last;

		public File() {
			this.setSize(0);
			this.setLastModification();
		}
	
			private void setSize(int _n) {
				size = _n;
			}
			
			private void setLastModification(){
				Date today = new Date();
				last = today;
			}
			
			@Override
			public int totalSize() {
				return size;
			}
		
			@Override
			public void printStructure() {
				// TODO Auto-generated method stub
			}
		
			@Override
			public FileSystem lastModified() {
				return this;
			}
		
			@Override
			public FileSystem oldestElement() {
				// TODO Auto-generated method stub
				return this;
			}
		
			@Override
			public Date lastModification() {
				return last;
			}

}
