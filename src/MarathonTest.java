
public class MarathonTest {
    public static void main(String[] args) {


        int[] time = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};

        Marathon myMarathon = new Marathon(time);

        System.out.println("Birinci: " + names[myMarathon.firstOne()] + " " + time[myMarathon.firstOne()] + "'");
        System.out.println("İkinci: " + names[myMarathon.secondOne()] + " " + time[myMarathon.secondOne()] + "'");
        System.out.println("Üçüncü: " + names[myMarathon.thirdOne()] + " " + time[myMarathon.thirdOne()] + "'");

        myMarathon.letterDegree();

    }
}


