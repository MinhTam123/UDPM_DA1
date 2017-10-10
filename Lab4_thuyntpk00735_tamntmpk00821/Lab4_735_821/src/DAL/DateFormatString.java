/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Yuuki Nguyen
 */
public class DateFormatString {
    static  DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
    public static String getDateString(Date date){
            return dateformat.format(date);
    }
    public static Date getDate(String ngay){
        try {
            return dateformat.parse(ngay);
        } catch (ParseException e) {
            System.out.println("Lỗi ngày "+ e.getMessage());
        }
        return null;
    
    }
}