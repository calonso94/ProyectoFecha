package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Carlos
 */
public class Fecha {

    int dia;
    int mes;
    int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha() {
        Calendar c = new GregorianCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
    }

}
