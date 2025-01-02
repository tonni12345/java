public class Break {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            i++;
            System.out.print(i);
            if(i == 5){
                break; // perulangan akan berhenti di angka lima
            }

            if(i == 10){
                break;
            }
        }
    }
}
