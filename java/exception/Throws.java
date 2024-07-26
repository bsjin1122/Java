import java.io.IOException;

public class Throws {
	public static void main(String[] args) {
		try{
			readFile(); // IOException 발생 가능
		}catch (IOException e){
			System.out.println("Exception Caught: " + e.getMessage());
		}
	}
	public static void readFile() throws IOException{
		// 파일 읽기 코드
		throw new IOException("파일을 찾을 수 없음");
	}
}
