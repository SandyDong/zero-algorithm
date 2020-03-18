package com.dong.niuke;

import java.util.Scanner;

/**
 * 时间是从1990年1月1日 判断输入的日期是否合法  输入日期不合法
 * 三天打鱼两天晒网
 */
public class Test05 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.next();
        //校验输入的日期是否合法
        checkInputDate(dateStr);
        //判断是在休息还是在工作
        judgeRestOrWork(dateStr);

        System.out.println("He is having a rest");
    }
    private static void  judgeRestOrWork(String dateStr){
        String[] dateArr = dateStr.split("-");
        String year = dateArr[0];//年
        String month = dateArr[1];//年
        String day = dateArr[2];//日

        int countDay = 0;
        //计算总共多少天
        int yearValue = Integer.valueOf(year) - 1900;
        int monthValue = Integer.valueOf(month) - 1;
        int dayVlaue = Integer.valueOf(day) - 1;

        if(yearValue == 0){
           if (monthValue == 0){
                countDay = dayVlaue;
           }else{
               for (int i = 1; i <monthValue+1 ; i++) {
                   if(i==1){
                        countDay+=31;
                   }else if(i==2){
                       countDay+=29;
                   }
                   else if(i==3){
                       countDay+=31;
                   }else if(i==4){
                       countDay+=30;
                   }
                   else if(i==5){
                       countDay+=31;
                   }else if(i==6){
                       countDay+=30;
                   }
                   else if(i==7){
                       countDay+=31;
                   }
                   else if(i==8){
                       countDay+=31;
                   }
                   else if(i==10){
                       countDay+=31;
                   }else if(i==11){
                       countDay+=30;
                   }
                   else if(i==12){
                       countDay+=31;
                   }
               }
               countDay +=dayVlaue;
           }
        }

        if(countDay%5 == 4|| countDay%5 == 0 ){
            System.out.println("He is having a rest");
        }
        if(countDay%5 >0 && countDay%5 <= 3){
            System.out.println("He is working");
        }
    }
    private static void checkInputDate(String dateStr)throws Exception{
        if(dateStr != null && !"".equals(dateStr)){
            String[] dateArr = dateStr.split("-");
            if(dateArr.length!=3){
                System.out.println("Invalid input");
                throw new Exception("无效参数!");
            }
            String year = dateArr[0];//年
            String month = dateArr[1];//年
            String day = dateArr[2];//日

            if(Integer.valueOf(year).compareTo(1900) < 0){
                System.out.println("Invalid input");
                throw new Exception("无效参数!");
            }
            if (Integer.valueOf(month)<= 0||Integer.valueOf(month)>12){
                System.out.println("Invalid input");
                throw new Exception("无效参数!");
            }

            //31天
            String monthNum1[] = new String[]{"1","3","5","7","8","10","12"};
            //30天
            String monthNum2[] = new String[]{"4","6","9","11"};

            for (String monthTemp : monthNum1) {
                if (month.equals(monthTemp)){
                    if (Integer.valueOf(day)<=0||Integer.valueOf(day)>31){
                        System.out.println("Invalid input");
                        throw new Exception("无效参数!");
                    }
                }
            }

            for (String monthTemp : monthNum2) {
                if (month.equals(monthTemp)){
                    if (Integer.valueOf(day)<=0||Integer.valueOf(day)>30){
                        System.out.println("Invalid input");
                        throw new Exception("无效参数!");
                    }
                }
            }
            //闰年
            if (Integer.valueOf(year)%400==0||Integer.valueOf(year)%4==0){
                if (("2".equals(month))&&(Integer.valueOf(day)<=0||Integer.valueOf(day)>28)){
                    System.out.println("Invalid input");
                    throw new Exception("无效参数!");
                }
            }else{
                if (("2".equals(month))&&(Integer.valueOf(day)<=0||Integer.valueOf(day)>29)){
                    System.out.println("Invalid input");
                    throw new Exception("无效参数!");
                }
            }

        }else{
            System.out.println("输入的日期为空!");
            throw new Exception("无效参数!");
        }
    }
}
