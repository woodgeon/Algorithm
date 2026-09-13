import java.util.*;


class Node {
    String word;
    int count;

    Node(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
class Solution {

    static boolean[] visited;
    static String beginWord;
    static String targetWord;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        beginWord = begin;
        targetWord = target;
        
        int answer = bfs(words);
        
        return answer;
    }
    public int bfs(String[] words) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(new Node(beginWord, 0));

        while(!deque.isEmpty()) {
            Node cur = deque.pollFirst();
            String curWord = cur.word;
            int curCount = cur.count;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canChange(curWord, words[i])) {
                    deque.offerLast(new Node(words[i], curCount + 1));
                    visited[i] = true;
                    if (words[i].equals(targetWord)) {
                        return curCount + 1;
                    }
                }
            }
        }

        return 0;
    }

    public boolean canChange(String curWord, String subWord) {
        int diff = 0;
        for (int i = 0; i < curWord.length(); i++) {
            if (curWord.charAt(i) != subWord.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
}
