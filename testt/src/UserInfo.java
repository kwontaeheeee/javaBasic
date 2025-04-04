


import java.io.*;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 사용자로부터 입력 받기
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String contact = "";
        String age = "";
        String height = "";

        try {
            System.out.print("이름을 입력하세요: ");
            name = scanner.nextLine();

            System.out.print("연락처를 입력하세요: ");
            contact = scanner.nextLine();

            System.out.print("나이를 입력하세요: ");
            age = scanner.nextLine();

            System.out.print("키를 입력하세요: ");
            height = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("입력 중 오류가 발생했습니다: " + e.getMessage());
        }

    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt"))) {
            writer.write("이름: " + name + "\n");
            writer.write("연락처: " + contact + "\n");
            writer.write("나이: " + age + "\n");
            writer.write("키: " + height + "\n");
        } catch (IOException e) {
            System.out.println("파일을 저장하는 중 오류가 발생했습니다: " + e.getMessage());
        }

        // info.txt 파일에서 내용을 읽어 출력
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            String line;
            System.out.println("\n저장된 정보:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
