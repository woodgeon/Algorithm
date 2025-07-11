import java.util.HashMap;
import java.util.HashSet;

class Solution {
    private static boolean isValidMove(int nx, int ny) { // 0이나 10을 벗어날 경우 false return
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
    
    private static final HashMap<Character, int[]> location = new HashMap<>();
    
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }
    
    public int solution(String dirs) {
        initLocation(); // 위치정보를 초기화 하는 함수
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>(); // 겹치는 좌표는 1개로 처리하기 위함
        
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i)); // HashMap으로 선언된 좌표 결정 변수인 location에서 해당 명령을 통해 좌표를 가져옴.
            int nx = x + offset[0];
            int ny = y + offset[1];
            
            if (!isValidMove(nx, ny)) // 범위를 벗어난 좌표일 경우 다음 루프로 넘어감
                continue;
            
            answer.add(x + " " + y + " "+ nx + " " + ny);
            answer.add(nx + " " + ny + " "+ x + " " + y);
            
            // 이동했으니 좌표를 변경해주어야함.
            x = nx;
            y = ny;
        }
        
        return answer.size() / 2;
    }
}