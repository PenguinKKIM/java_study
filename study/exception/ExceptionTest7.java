import java.io.File;

public class ExceptionTest7 {

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName()+"파일이 생성 되었습니다");

	}
	
	static File createFile (String filename) {
		try {
			if (filename.equals("") || filename == null) {
				throw new Exception("파일이름이 유효하지않습니다");
			}
		} catch(Exception e) {
			filename ="temp.txt";
		} finally {
			File f = new File(filename);
			createNewFile(f);
			return f;
		}
	}

	private static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {}
		
	}
	
}
