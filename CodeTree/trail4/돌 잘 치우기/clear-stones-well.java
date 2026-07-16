import java.util.*;

public class Main {
    /*
    흠.. 조금 어려운데.. 일단 돌을 치우는 게 핵심인 문제니까
    치워야할 돌은 1이니까.. 1이면서 동시에 방문하지 않은 돌들에 대해 m개만큼 방문을 허용하고
    m이 0이라면 허용한 돌들까지의 BFS를 돌려서 방문한 곳을 카운트하고..
    1 && visited[nx][ny] 인 것들을 제외한 또 다른 걸 허용하게 해서.. 조합?
    위 방법은 말이 안된다. 예를들어 돌이 있는 격자의 index의 조합을 모두 더해봐야 한다.
    (1, 2.. 1, 3.. ) 
    - 7/16 11:13 거의 안된다는 건 잘하면 된다는거지
    
    2안. 돌을 한칸 건너뛰었을 때 0(방문가능지점) 인지 검사하는 법.
    - 예를들어 m이 1이면 문제없다. 그냥 돌 무시하고 가면됨
    - 근데 m이 2면 1칸 건너뛰고 다음에 0이 있으면 그 돌 지우면됨.
    - 근데 2칸 건너뛰었을 때 방문 가능한 지점이 max일 수가 있음.
    - 그래서 1~m까지 건너뛸 수 있는 모든 경우의 수에 대해 검사한다. 이 방법은 충분히 가능할듯..?
    - 예를들어 m이 2고 1칸만 건너 뛴다(상하좌우에 놓여진 1을 무시하고 그 바로 다음값이 0이라면 그 칸도 방문처리 ok, 카운트 증가
    - 그러나.. 상하좌우에 0이 없거나, 있더라도 방문한 곳이라면? 카운트 증가 X
    - 이것도 안됨

    3안. 일단 1칸짜리 돌 중에서 2칸 이상 주변에 0으로 되어있는지 확인 후 걔네들 먼저 제거
    - 이 방법은 일단. 연결지을 수 있는 지역을 다 연결시킨 후
    - 그 중에서 남은 돌이 있다면 그 두 지역을 이을 수 있는지 검사함.
    - 검사했을 때 이을 수 있다면 그냥 없앤 다음 bfs
    - 없앨 수 없다면 그냥 아무거나 삭제했다 처리하면 되니까 max값 + 지울 수 있는 돌을의 갯수
    - 하 이것도 안됨                                                                                                                                
    */

    static int[][] grid;
    static boolean[][] visited;
    static List<int[]> starts = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    static List<int[]> rocks = new ArrayList<>();

    static int max;

    static int n;
    static int k;
    static int m;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                grid[i][j] = temp;
                if (temp == 1) {
                    rocks.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            starts.add(new int[]{x, y});
        }

        choose(0, 1);

        System.out.print(max);
    }

    static void choose(int start, int current) {
        
        if (current == m + 1) {
            // 1이었던 돌들의 위치를 가져와서 바꿈. 조합은 path 안에 있음
            for (int i = 0; i < path.size(); i++) {
                int[] sub = rocks.get(path.get(i));
                int cx = sub[0];
                int cy = sub[1];
                grid[cx][cy] = 0;
            }
            int tempMax = 0;
            for (int i = 0; i < k; i++) {
                int[] curStart = starts.get(i);
                int startX = curStart[0];
                int startY = curStart[1];
                
                tempMax += bfs(startX, startY);
            }
            max = Math.max(max, tempMax);
            visited = new boolean[n][n];

            for (int i = 0; i < path.size(); i++) {
                int[] sub = rocks.get(path.get(i));
                int cx = sub[0];
                int cy = sub[1];
                grid[cx][cy] = 1;
            }
            return;
        }

        for (int i = start; i < rocks.size(); i++) {
            path.add(i);
            choose(i + 1, current + 1);
            path.remove(path.size() - 1);
        }
        
    }

    static int bfs(int startX, int startY) {
        Deque<int[]> deque = new ArrayDeque<>();
        if (visited[startX][startY]) {
            return 0;
        }
        int tempMax = 1;
        visited[startX][startY] = true;

        deque.offerLast(new int[]{startX, startY});

        while(!deque.isEmpty()) {

            int[] cur = deque.pollFirst();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {

                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (!isRange(nx, ny)) {
                    continue;
                }

                if (visited[nx][ny] || grid[nx][ny] == 1) {
                    continue;
                }
                
                tempMax++;
                visited[nx][ny] = true;
                deque.offerLast(new int[]{nx, ny});
            }
        }

        return tempMax;
    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}