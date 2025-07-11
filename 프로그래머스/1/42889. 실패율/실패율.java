import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        /**
        * 스테이지별 도전자수를 구함.
        * stages[i] 방식으로 challenger 배열에 더하게 되면
        * stages 배열의 길이(참가자 수)대로 모든 스테이지의 도전자 수를 구할 수 있음.
        **/
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1; 
        }
        
        HashMap<Integer, Double> falis = new HashMap<>();
        
        // 총 사용자 수를 저장
        double total = stages.length;
        
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) { // 만약 도전한 사람이 없다면,
                falis.put(i, 0.); // 실패율은 0
            }
            else { // 그렇지 않다면, 첫번째 스테이지부터 실패율 계산
                falis.put(i, challenger[i] / total); // 도전 중인 사용자 / 총 사용자
                total -= challenger[i]; // 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
            }
        }
        
        return falis.entrySet().stream().sorted((o1, o2) -> 
                    Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}