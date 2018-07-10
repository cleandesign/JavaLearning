package com.woshidaniu.effective;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kang on 2018/7/9.
 */
//public class DateUtil {
//
//    private DateUtil(){}
//
//    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    public static Date parse(String date)  throws ParseException {
//        System.out.println("date:" + date);
//        return DATE_FORMAT.parse(date);
//    }
//
//}
//public class DateUtil {
//
//    private DateUtil(){}
//
//    public static Date parse(String date)  throws ParseException {
//        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
//    }
//
//}
public class DateUtil {

    private DateUtil(){}

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(500);
        for (int i = 0; i < 500; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        try {
                            DATE_FORMAT.parse("2014-01-01 00:00:00");
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        Thread.sleep(3000000);
    }

}
