import java.util.*;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] wList = new Weather[n];
        List<String> dList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            wList[i] = new Weather(date, day, weather);
            if (weather.equals("Rain")) dList.add(date);
        }
        String[] dateList = dList.toArray(new String[dList.size()]);
        Arrays.sort(dateList);
        for (int i = 0; i < n; i++) {
            if (dateList[0].equals(wList[i].date) && wList[i].weather.equals("Rain")) {
                System.out.print(wList[i].date + " " + wList[i].day + " " + wList[i].weather);
            }
        }

    }
}