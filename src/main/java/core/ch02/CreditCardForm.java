package core.ch02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class CreditCardForm {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();

    static {
        //다음 20개 연도를 배열 리스트에 추가한다.
        int year = LocalDate.now().getYear();
        for (int i= year; i <= year + 20; i++){
            expirationYear.add(i);
        }
    }
}
