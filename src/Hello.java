public class Hello {

    public static void main(String[] args) {
        Hello h = new Hello();
        h.grussErdinger();
    }

    public void grussErdinger(){
        System.out.println("Hallo Kurs 5 inf!");
        for (int i=0; i<10; i++){
            System.out.println(i + "   " + i*i);
        }
    }
}
