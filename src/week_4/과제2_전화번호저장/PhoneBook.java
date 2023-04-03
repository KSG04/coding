package week_4.과제2_전화번호저장;

import week_4.과제2_전화번호저장.Service.servicePhone;

import java.io.IOException;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        servicePhone serviceUser = new servicePhone();

        serviceUser.choose();
    }
}
