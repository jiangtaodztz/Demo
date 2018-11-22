package com.itheima.date;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String,Date> {
    public Date convert(String s) {
        if (s.indexOf("-")>0){
            try {
                return  new SimpleDateFormat("yyyy-MM-dd").parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if (s.indexOf("/")>0){
            try {
                return new SimpleDateFormat("yyyy/MM/dd").parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
