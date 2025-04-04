import java.util.Arrays;  // Arrays 클래스를 사용하기 위해 import

// findRanking 메서드를 작성하여 선수 순위 찾기
public class mm {
    public static void main(String[] args) {
        // 선수들의 초기 순위 배열
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        // 호출된 선수들의 배열
        String[] callings = {"kai", "kai", "mine", "mine"};
        
        // callings 배열을 순차적으로 처리하여 선수들이 호출될 때마다 순위를 바꿈
        for (int i = 0; i < callings.length; i++) {
            // 호출된 선수의 현재 순위(index)를 찾음
            int ranking = findRanking(players, callings[i]);

            //findRanking메서드를 호출해서 callings[i]의 현재 순위를 찾아서 rankinf변수에 저장
            
            // 호출된 선수와 그 앞에 있는 선수의 순위를 바꿔주는 함수
            swiping(players, ranking, ranking - 1);
            // swiping메서드는 현재순위 , -1순위를 바꾸는 작업       
            }
        
        // 최종적으로 수정된 players 배열 출력
        System.out.println(Arrays.toString(players));
        //Arrays.toString 메서드는 사람이 읽기 쉬운 형식으로 문자열을 출력
    }

    // 두 선수의 순위를 바꾸는 메서드 (스와핑)
    private static void swiping(String[] array, int i, int j) {
        // i 번째 선수와 j 번째 선수의 순위를 바꾸기 위해 임시로 값을 저장
        String temp = array[i];
        array[i] = array[j];  // i 번째 선수와 j 번째 선수의 순위를 바꿈
        array[j] = temp;  // j 번째 선수의 순위를 i 번째로 바꿈
    }

    // 특정 선수가 현재 배열에서 몇 번째 순위인지를 찾는 메서드
    private static int findRanking(String[] array, String target) {
        int ranking = 0;  // 찾을 순위를 저장할 변수

        // 배열을 순회하면서 target과 같은 선수의 인덱스를 찾아서 그 인덱스를 반환
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {  // 배열에서 선수 이름이 target과 같으면
                ranking = i;  // 그 선수의 인덱스를 ranking에 저장
            }
        }

        return ranking;  // 최종적으로 찾은 인덱스(순위)를 반환
    }
}

