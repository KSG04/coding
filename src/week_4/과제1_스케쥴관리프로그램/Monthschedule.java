package week_4.과제1_스케쥴관리프로그램;

import java.io.IOException;

public class Monthschedule {
    public static void main(String[] args) throws IOException {
        System.out.println("스케줄 관리 프로그램");

        Day day = new Day();
        day.choose();
    }

}
