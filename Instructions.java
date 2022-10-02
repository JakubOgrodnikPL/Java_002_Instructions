public class Instructions {
    public static void main(String[] args) {
        int age=17;

        if (age>=18){
            System.out.println("Możesz mieć prawko.");
        }
        else if (age>=16 && age<18){
            System.out.println("Możesz mieć prawko lecz musisz jedździć z rodzicem.");
        }
        else{
            System.out.println("Nie możesz mieć prawka.");
        }

    }
}
