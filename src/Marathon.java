public class Marathon {
    private int[] time;

    public Marathon(int[] time) {
        this.time = time;
    }

    public int[] getTime() {
        return time;
    }

    public void setTimeime(int[] time) {
        this.time = time;
    }

    public int firstOne() {
        int minTime = time[0];
        int place = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] < minTime) {
                minTime = time[i];
                place = i;
            }
        }
        return place;
    }

    public int secondOne() {
        int minTime = time[firstOne()];
        int minTime2 = time[0];
        int place = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] < minTime2 && time[i] > minTime) {
                minTime2 = time[i];
                place = i;
            }
        }
        return place;
    }

    public int thirdOne() {
        int minTime = time[firstOne()];
        int minTime2 = time[secondOne()];
        int minTime3 = time[0];
        int place = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] < minTime3 && time[i] > minTime2 && time[i] > minTime) {
                minTime3 = time[i];
                place = i;
            }
        }
        return place;
    }

    public void letterDegree() {
        int A = 0;
        int B = 0;
        int C = 0;
        int j = 2;
        for (int i = 0; i < time.length; i++) {
            if (time[i] >= j * 100 && time[i] <= j * 100 + 99)
                A++;
            if (time[i] >= j * 100 + 100 && time[i] <= j * 100 + 199)
                B++;
            if (time[i] >= j * 100 + 200)
                C++;
        }
        System.out.println("A --> " + A);
        System.out.println("B --> " + B);
        System.out.println("C --> " + C);
    }


}
