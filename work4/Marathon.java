package work4;

public class Marathon {
    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + times[i]);
//        }
        System.out.println("-------------------------------------");
        int fastest = 0;
        int second = fastest;
        for (int j = 1; j < names.length; j++) {
            if (times[j] < times[fastest])
                fastest = j;
            for (int k = 1; k < names.length; k++ ) {
                if(second < times[fastest])
                    second = k;
            }    
        }
        System.out.println("The Fastest Runner 1");
        System.out.println(names[fastest] + ": " + times[fastest]);
        System.out.println("-------------------------------------");
        System.out.println("The Second Fastest Runner 2");
        System.out.println(names[second] + ": " + times[second]);
    }
}
