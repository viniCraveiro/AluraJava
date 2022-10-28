package rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

    BigDecimal valor();
    LocalDate data();

}
