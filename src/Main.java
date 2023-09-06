public class Main {
    public static void main(String[] args) {
        ggg(20,34);
        ggg(15,24);
        ggg(9,14);
        ggg(20,22);
        ggg(2,10);
        System.out.println();

        ggg(generateRandomAge(),5);
        ggg(generateRandomAge(),9);
        ggg(generateRandomAge(),57);
        ggg(generateRandomAge(),90);
        ggg(generateRandomAge(),88);
    }

    public static String hitman ( int age, int temp){
        if ((age >= 20 && age <=45)&& temp >= -20 && temp <= 30){
            return "идти гулять";
        }else if ((age <= 20 )&& temp >= 0 && temp <= 28){
            return "идти гулять";
        }else if ((age >= 45) && (temp >= -10 && temp <= 25)){
            return "идти гулять";
        }else {
            return "остовайтесь дома";
        }
    }
    public static void ggg(int age, int temp){
        String nnn = hitman(age,temp);
        System.out.println("Возраст " + age + " температура " + temp + "\n" + nnn);
    }
    public static int generateRandomAge(){
        int random = (int) (Math.random()*100);
        return random;
    }
}
