public class HRDemo {

    public static void main(String[] args) {
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);

        Adjunct barney = new Adjunct("Rubble Barney", 2014, "BR-2", 320, 60.55);

        FullTime wilma = new FullTime();

        wilma.setName("Flintstone, Willma");
        wilma.setIdNum("BR-3");
        wilma.setHireYear(2016);
        wilma.setSalary(78123.2468);

        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");

        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);

        Person[] staff = {fred, barney, wilma, betty, wilma2};

        for (int i = 0; i < staff.length; i++) {
            System.out.println(i + ". " + staff[i] + "\n");
        }

        System.out.println("willma equals willma2: " + wilma.equals(wilma2) + "\n");

        wilma.setName("Slate, Wilma");

        Person[] staff2 = {fred, barney, wilma, betty};

        for (int i = 0; i < staff2.length; i++) {
            System.out.println(i + ". " + staff2[i] + "\n");
        }


    }

}
