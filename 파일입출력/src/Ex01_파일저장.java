import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Ex01_파일저장 {

    public static void main(String[] args) {
        String filePath = "./test.text";
        String content = "안녕하세요.자바";

        byte[] buffer = null;
        try{
            buffer = content.getBytes("utf-8"); //컴퓨터는 글자를 바이트로 처리 
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        OutputStream os = null;
        try{
            os = new FileOutputStream(filePath);
            try {
                os.write(buffer);
            } catch (IOException e) { //입출력 오류를 처리하는 클래스
                System.err.println("파일 저장 중 오류가 발생했습니다!");
                e.printStackTrace(); //오류의 상세한 내용을 출력
            }
        }
        catch(FileNotFoundException e){
            System.err.println("error");
            e.printStackTrace();
        }
        finally{
            if (os!=null) {
                try{
                    os.close();
                } catch(IOException e){
                    e.printStackTrace();
                } //무조건실행됨
                
            }
        }
        

    }
}

//OutputStream 파일을 생성하거나 열기위해 사용, 
// 예) outputstream os = new fileoutStream(filepath)
//is는 InputStream의 약어
