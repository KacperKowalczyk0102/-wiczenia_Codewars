public class Zadanie1{
    boolean something;
    public String toString(boolean something){
        return String.valueOf(something);
    }
    
    public static void main(String[] args) {
        Zadanie1 zad = new Zadanie1();
        System.out.println(zad.toString(false));
        System.out.println(zad.toString(true));

    }
}