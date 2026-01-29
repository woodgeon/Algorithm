import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            map.put(i, false);
        }

        StringBuilder sb = new StringBuilder();
        while (t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("add")) {
                int n = Integer.parseInt(st.nextToken());
                if (map.getOrDefault(n, false)) {
                    continue;
                }
                // 있다고 표시하기 위해 true를 false로 바꿔주면 됨
                map.put(n, true);
            }
            else if (command.equals("remove")) {
                int n = Integer.parseInt(st.nextToken());
                // 있다면 true로 나오겠지? 근데 없을 때 무시하는 거니까 false 가 떴을 때 true가 나오게 하기 위해 !추가
                if (!map.getOrDefault(n, false)) {
                    continue;
                }
                // 있다면, 그냥 다시 그 키값에다가 value만 false로 바꿔주면 됨
                map.put(n, false);
            }
            else if (command.equals("check")) {
                int n = Integer.parseInt(st.nextToken());
                if (map.containsKey(n) && map.getOrDefault(n, false)) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if (command.equals("toggle")) {
                int n = Integer.parseInt(st.nextToken());
                if (map.containsKey(n) && map.getOrDefault(n, false)) {
                    map.put(n, false);
                }
                else {
                    map.put(n, true);
                }
            }
            else if (command.equals("all")) {
                for (int i = 1; i <= 20; i++) {
                    map.put(i, true);
                }
            }
            else if (command.equals("empty")) {
                for (int i = 1; i <= 20; i++) {
                    map.put(i, false);
                }
            }
        }

        System.out.println(sb.toString());
    }
}