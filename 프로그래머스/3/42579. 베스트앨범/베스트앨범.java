import java.util.*;
import java.util.stream.Stream;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 재생횟수가 높은 순서대로 정렬할 자료구조
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>();
        // 각 장르에 속한 총 재생 횟수를 계산하는 데 사용할 자료구조
        HashMap<String, Integer> playMap = new HashMap<>();

        // 장르별 총 재생 횟수와 각 곡의 재생 횟수 저장
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }
            genreMap.get(genre).add(new int[]{i, play});
            // 가져온 i번째 장르 + 해당 장르의 value 자리에 계속해서 play add {genre, 이전의 play + play[i]}
            playMap.put(genre, playMap.get(genre) + play);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet().stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        
        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0]));
        });
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}