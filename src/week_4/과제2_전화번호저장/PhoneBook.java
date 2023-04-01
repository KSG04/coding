package week_4.과제2_전화번호저장;

import week_4.과제2_전화번호저장.Service.Phone;

import java.io.IOException;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        System.out.println("이름과 전화번호 저장 프로그램\n");
        Phone phone = new Phone();

        phone.choose();
    }
}
