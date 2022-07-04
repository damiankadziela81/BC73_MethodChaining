public class Main {
    public static void main(String[] args){
        // method chaining =  a common syntax for invoking multiple method calls in OOP
        //      condense code into less lines

        String name = "    Damian";
        String name1 = name.concat(" Kadziela   ");
        name1 = name1.toUpperCase();
        name1 = name1.trim();

        String name2 = name.concat(" Kadziela   ").toUpperCase().trim();

        System.out.println(name1);
        System.out.println(name2);
    }
}
