package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone uzairsiphoneObj = new Phone();
        // Assigning a value to name using uzairiphoneObj
        uzairsiphoneObj.name = "Apple";
        uzairsiphoneObj.model = "13 Pro";
        uzairsiphoneObj.generation = 'X';
        uzairsiphoneObj.year = 2022;
        uzairsiphoneObj.weight = 3;
        System.out.println(uzairsiphoneObj.name);
        System.out.println(uzairsiphoneObj.model);
        System.out.println(uzairsiphoneObj.generation);
        // We are calling the call method on uzairiphoneObj

        uzairsiphoneObj.call();
        uzairsiphoneObj.text();
        uzairsiphoneObj.browse();

        Phone uzairssamsungObj = new Phone();
        // Assigning a value to name using uzairssamsungObj
        uzairssamsungObj.name = "Samsung";
        uzairssamsungObj.model = "S23";
        uzairssamsungObj.generation = 'S';
        uzairssamsungObj.year = 2023;
        uzairssamsungObj.weight = 4;
        System.out.println(uzairssamsungObj.name);
        System.out.println(uzairssamsungObj.model);
        System.out.println(uzairssamsungObj.generation);
        // We are calling the call method on uzairssamsungObj

        uzairssamsungObj.call();
        uzairssamsungObj.text();
        uzairssamsungObj.browse();

        Phone uzairspixelObj = new Phone();
        // Assigning a value to name using uzairspixelObj
        uzairspixelObj.name = "Google";
        uzairspixelObj.model = "Pixel 7";
        uzairspixelObj.generation = 'G';
        uzairspixelObj.year = 2023;
        uzairspixelObj.weight = 5;
        System.out.println(uzairspixelObj.name);
        System.out.println(uzairspixelObj.model);
        System.out.println(uzairspixelObj.generation);
        // We are calling the call method on uzairspixelObj

        uzairspixelObj.call();
        uzairspixelObj.text();
        uzairspixelObj.browse();
    }
}
