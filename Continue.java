public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue; // langsung lanjut ke perulangan, tanpa mengeksekusi code selanjutnya
            }
            System.out.println(i);
        }
    }
}
