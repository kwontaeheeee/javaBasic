package kr.hossam.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHelper {
    private static FileHelper current = null;

    // 싱글턴 패턴을 사용해서 한 번만 객체를 생성
    public static FileHelper getInstance(){
        if(current == null){
            current = new FileHelper();
        }
        return current;
    }

    // freeInstance는 굳이 사용하지 않아서 삭제하거나 잘 활용하세요.
    public static void freeInstance(){
        current = null;
    }

    private FileHelper(){
        super();
    }

    /**
     * 주어진 파일 경로에 데이터를 쓰는 메서드
     * @param filePath 파일 경로
     * @param data 파일에 쓸 데이터
     * @throws Exception 파일을 쓰는 중 발생할 수 있는 예외
     */
    public void write(String filePath, byte[] data) throws Exception{
        OutputStream os = null;
        try{
            // 파일 경로에 OutputStream을 열고, 데이터를 씁니다.
            os = new FileOutputStream(filePath);
            os.write(data);
        } catch(FileNotFoundException e){
            e.printStackTrace();
            throw e; // 파일을 찾을 수 없을 때 예외 던짐
        } catch(IOException e){
            e.printStackTrace();
            throw e; // 입출력 오류가 있을 때 예외 던짐
        } finally{
            // 스트림을 닫는 작업
            if( os != null){
                try{
                    os.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 주어진 파일 경로에서 데이터를 읽어오는 메서드
     * @param filePath 파일 경로
     * @return 파일에서 읽은 데이터
     * @throws Exception 파일을 읽는 중 발생할 수 있는 예외
     */
    public byte[] read(String filePath) throws Exception{
        byte[] data = null;
        InputStream is = null;

        try{
            // 파일 경로에 InputStream을 열고, 파일의 모든 데이터를 읽음
            is = new FileInputStream(filePath);
            data = new byte[is.available()]; // 파일의 전체 크기만큼 배열 크기 지정
            is.read(data); // 데이터를 읽어서 배열에 저장
        } catch(FileNotFoundException e){
            e.printStackTrace();
            throw e; // 파일을 찾을 수 없을 때 예외 던짐
        } catch(IOException e){
            e.printStackTrace();
            throw e; // 입출력 오류가 있을 때 예외 던짐
        } finally{
            // 스트림을 닫는 작업
            if(is != null){
                try{
                    is.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        return data; // 읽은 데이터를 반환
    }

    public String readString(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readString'");
    }

    public void writeString(String filePath, String content) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeString'");
    }
}
