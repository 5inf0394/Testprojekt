public class HelloDuDa {

    public static void main(String[] args) {
        HelloDuDa h = new HelloDuDa();
        h.grussErdinger();
    }

    public void grussErdinger(){
        System.out.println("Hallo Kurs 5 inf!");
        for (int i=0; i<10; i++){
            System.out.println(i + "   " + i*i);
        }
    }
}
