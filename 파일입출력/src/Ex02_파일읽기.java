import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex02_파일읽기 {
    public static void main(String[] args) {
        String filePath = "./test.text";  // 읽을 파일 경로
        byte[] buffer = null;  // 파일에서 읽을 데이터를 저장할 배열
        InputStream is = null;  // 파일을 읽기 위한 InputStream 객체

        try {
            // 파일을 읽기 위해 FileInputStream(바이트단위로읽음) 객체 생성
            is = new FileInputStream(filePath);
            //텍스트 파일 다룰때는 BufferedReader

            // 파일 크기만큼의 버퍼를 생성 (파일 전체를 읽기 위해서)
            buffer = new byte[is.available()];  // is.available()은 읽을 수 있는 바이트 수를 반환

            // 파일에서 데이터를 읽어 buffer 배열에 저장
            is.read(buffer);

            // 읽은 데이터를 문자열로 변환
            String content = new String(buffer);

            // 읽은 데이터를 출력
            System.out.println("파일 내용: ");
            System.out.println(content);

        } catch (FileNotFoundException e) {
            // 파일을 찾을 수 없을 때 오류 처리
            System.err.println("[Error] 파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            // 파일을 읽는 도중 오류가 발생했을 때 처리
            System.err.println("[Error] 파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        } finally { //finally블록을 사용하는 이유: 파일을 다읽은후 파일을 닫아야 자원해제가 이루어진다
            // 자원 해제를 위한 코드
            if (is != null) {
                try {
                    is.close();  // 파일을 닫음
                } catch (IOException e) {
                    System.err.println("[Error] 파일을 닫는 도중 오류가 발생했습니다.");
                    e.printStackTrace();
                }
            }
        }
    }
}
//buffer은 데이터를 임시로 저장하는 공간