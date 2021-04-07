import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
	/* switch blokları, if bloklarına göre daha az kullanılan bir yöntemdir.
	switch dallandırma da kullanılır. aşağıdaki örnek de bir öğrencinin bir sınavdan aldığı nota
	göre öğrenciye mesaj vermeye yönelik (kaldım,geçtim,başarılı..)bir örnek olsun.*/
        char grade = 'B';
        /*unutma char varsa tek tırnak içinde verecek.*/
        switch (grade) {
            /*switch bloğunun içine şartımızın öznesini yazıyoruz yani grade.*/
            case 'A':
                /*case durum demek.Ne durumunda mesela not A ise gibi...*/
                System.out.println("Mükemmel : Geçtiniz!");
            break;
            /*break kodu bitirmeye yarar.*/
            case 'B':
                System.out.println("Çok güzel : Geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz!");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz not girdiniz!!");
                /* default şu demek; diyelimki kullanıcı A,B,C,D,F notları dışında
                bir not girdi o zaman harflendirme karşılığı olmadığı için sistem geçersiz
                diyecek default bu işe yarar.
                 */
        }
        System.out.println("-------------------");
        int number =2;
        switch (number){
            case 1:
                System.out.println("1 sayısını girdiniz.");
                break;
            case 2:
                System.out.println("2 sayısını girdiniz.");
                break;
            case 3:
                System.out.println("3 sayısını girdiniz.");
                break;
            case 4:
                System.out.println("4 sayısını girdiniz.");
                break;
            case 5:
                System.out.println("5 sayısını girdiniz.");
                break;
            default:
                System.out.println("Seçtiğiniz sayı geçersizdir!");

        }
    }
}
