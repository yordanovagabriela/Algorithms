import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class TraverseDirectoryBFS {

	public static void traverseDir(String startDirectory) {
		Queue<File> visitedDirsQueue = new LinkedList<File>();
		visitedDirsQueue.add(new File(startDirectory));
		while(visitedDirsQueue.size() > 0) {
			File currentDir = visitedDirsQueue.remove();
			System.out.println(currentDir.getAbsolutePath());
			File[] children = currentDir.listFiles();
			if(children != null) {
				for(File child : children) {
					if(child.isDirectory()) {
						visitedDirsQueue.add(child);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		traverseDir("/home/gabriela/GabrielaYordanova");
	}
}