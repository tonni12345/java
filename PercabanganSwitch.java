public class PercabanganSwitch {
    public static void main(String[] args){
        char nilai = 'A';

        switch(nilai){
            case 'A' :
                System.out.println("Nilai Sangant Baik");
                break;
            case 'B' :
                System.out.println("Nilai Baik");
                break;
            case 'C' :
                System.out.println("Nilai Cukup");
                break;
            case 'D' :
                System.out.println("Nilai Kurang");
                break;
            default :
                System.out.println("Tidak Lulus");
        }
    }
}
