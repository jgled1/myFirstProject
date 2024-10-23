public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlive = false;
        if (!isAlive) {
            System.out.println("not alive");
        }

        int newValue = 50;

        String makeOfCar = "volk";
        Boolean isDomestic = makeOfCar == "volk" ? false : true;

        if(isDomestic){
            System.out.println("Is Domestic");
        }

        double dub = 20.00;
        double dub2 = 80.00;

        double totalDub = (dub + dub2) * 100;

        System.out.println("the remainder is: " + (totalDub % 40) + " " + totalDub);

        boolean remain = (totalDub % 40) == 0 ? true : false;

        System.out.println(" The boolean is: " + remain);

        if(!remain){
            System.out.println("got a remainder");
        }


        for(int i = 0; i<10; i++){
            System.out.println(i);
        }


        int j = 1;
        do{
            if (j == 1){
                break;
            }
            System.out.println("do");
        } while (j < 0);

    }
}
