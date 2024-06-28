package com.developersoccerclub.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author itccolina
 */
public class DateUtil {
    public static Date StringToDate(String dataInformada) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(dataInformada);
        Date dataFormatada = sdf.parse(dataInformada);
        return dataFormatada;
    }
}
