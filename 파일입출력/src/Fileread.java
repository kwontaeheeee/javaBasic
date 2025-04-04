import java.io.FileInputStream;
import java.io.IOException;

public class Fileread {

    public static void main(String[] args) {
        String filePath = "./test.txt";  // 읽을 파일 경로

        FileInputStream fis = null;  // FileInputStream 객체를 null로 초기화

        try {
            // 파일을 읽기 위해 FileInputStream 객체 생성
            fis = new FileInputStream(filePath);

            int data;  // 파일에서 읽은 데이터를 저장할 변수

            // 파일의 끝을 만날 때까지 한 바이트씩 읽어오는 반복문
            while ((data = fis.read()) != -1) {  // read() 메소드는 파일에서 한 바이트를 읽음
                // fis.read()가 -1을 반환하면 파일 끝을 의미
                System.out.print((char) data);  // 읽은 바이트를 문자로 변환하여 출력
            }
        } catch (IOException e) {
            // 예외가 발생하면 오류 메시지를 출력
            System.err.println("파일을 읽는 중 오류가 발생했습니다!");
            e.printStackTrace();  // 예외의 자세한 정보 출력
        } finally {
            // 자원 해제를 위한 코드
            if (fis != null) {  // fis가 null이 아니면 파일을 닫아야 함
                try {
                    fis.close();  // 파일을 닫음
                } catch (IOException e) {
                    // 파일을 닫는 중에 오류가 발생하면 예외 처리
                    e.printStackTrace();
                }
            }
        }
    }
}
