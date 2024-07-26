# 예외
1. try-catch 블록
- 예외 발생 가능성이 있는 코드를 `try` 블록
- 예외가 발생했을 때의 처리 코드를 `catch` 블록에 작성
2. finally 블록
- 예외 발생 여부와 상관없이 항상 실행되는 코드를 작성
3. throw 키워드
- 직접 예외를 발생시킨다.
4. throws 키워드
- 메서드가 어떤 예외를 던질 수 있는지를 선언한다.

## Try-with-Resource 기본 문법
- try 블록에서 선언된 자원을 자동으로 닫아준다. 
```java
try (ResourceType resource = new ResourceType()) {
    // 리소스를 사용한 작업
} catch (ExceptionType e) {
    // 예외 처리
}
```
### 예제1: 파일 읽기
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try-with-resources 구문을 사용하여 자원을 자동으로 닫습니다.
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```
### 예제2: 데이터베이스 연결
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        // try-with-resources 구문을 사용하여 자원을 자동으로 닫습니다.
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM mytable")) {

            while (rs.next()) {
                System.out.println("Column 1: " + rs.getString(1));
                System.out.println("Column 2: " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
```
## AutoCloseable 인터페이스
- AutoCloseable 인터페이스를 구현해야 한다. 
- 이 인터페이스는 close 메서드를 하나 가지며, 자원을 닫을 때 호출된다. 
```java
public interface AutoCloseable {
    void close() throws Exception;
}
```
> - 자원을 사용하는 코드를 간결하고, 안전하게 작성할 수 있도록 돕는다. 
> `자원을 사용한 후 명시적으로 닫지 않아도` 되며, <br>
> - 예외가 발생하더라도 자원이 자동으로 닫히기 때문에 
> `리소스 누수 문제를 방지`할 수 있다.