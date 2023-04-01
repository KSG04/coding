package week_4.과제2_전화번호저장.User;

import java.util.regex.Pattern;

public class Phone {

    private String name;
    private String phone;

    public Phone(){}


    public Phone(String name, String phone) {

        this.name = name;
        this.phone = phone ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
        if(!Pattern.matches(regEx,phone)) return null;
        return phone.replaceAll(regEx,"$1-$2-$3");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
