package week_4.과제2_전화번호저장.User;

import java.util.regex.Pattern;

public class User {

    private String name;
    private String phone;

    public User(){}


    public User(String name, String phone) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.",name));
        }
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
