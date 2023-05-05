package week_7;

import javax.xml.crypto.Data;
import java.security.Key;
import java.util.*;

class mouse{
    String name;

    public mouse(String name) {
        this.name = name;
    }
}


public class Keyboard {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Keyboard){
            Keyboard k = (Keyboard) obj;
            if (name.equals(k.name))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


class ObjectMethodDemo{
    public static void main(String[] args) {
        mouse m1 = new mouse("Logitech");
        mouse m2 = new mouse("Logitech");
        mouse m3 = m1;
        Keyboard k1 = new Keyboard("Microsoft");
        Keyboard k2 = new Keyboard("Microsoft");

        //mouse 타입 객체는 object 클래스에서 제공하는 toString 메서드 사용
        System.out.println(m1.toString());
        System.out.println(m1);

        //keyboard 타입 객체는 오버라이딩된 toString 메서드 사용
        System.out.println(k1.toString());
        System.out.println(k1);

        //Object 클래스의 equals 메서드는 동일한 객체인지를 판단
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        //keyboard 타입 객체는 오버라이딩된 equals 메서드를 사용
        System.out.println(k1.equals(k2));

        System.out.println();

        System.out.println("======================");
        System.out.println("Class 클래스");
        Keyboard k = new Keyboard("Logitech");

        Class c = k.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getTypeName());
        System.out.println(c.getPackage().getName());
        // 실무에서 로그기록 남길때 필요하다.
        System.out.println();

        System.out.println("======================");
        System.out.println("Math 클래스");

        System.out.println("Math.pow(2,8) : " + Math.pow(2,8));
        System.out.println("Math.random() :" + Math.random());
        System.out.println("Math.sin(Math.PI) : " + Math.sin(Math.PI));
        System.out.println("Math.min(10,20) : " + Math.min(10,20));

        System.out.println();


        System.out.println("======================");
        System.out.println("StringBuilder");

        String s = new String("hi");

        System.out.println(s.hashCode()+ ":" + s);
        s = s + " ! ";
        System.out.println(s.hashCode() + " : " + s);

        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.hashCode() + " : " + sb);
        sb = sb.append("!");

        System.out.println(sb.hashCode() + " : " + sb.toString());

        System.out.println(sb.replace(0,2,"Good bye").insert(0,"Java"));

        System.out.println();
        System.out.println("=====================================");
        System.out.println("System Class");

        int[] src = new int[]{1,2,3,4,5,6};
        int[] dst = {100,200,300,400,500,600,700};

        System.arraycopy(src,2,dst,3,4); // src 인덱스 2번부터 dst 3
        for (int i = 0; i < dst.length; i++){
            System.out.print(dst[i] + "   ");
        }
        System.out.println();

        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("OS.name"));
        System.out.println(System.nanoTime());


        System.out.println();
        System.out.println("======================================");
        System.out.println("Wrapper");

        Integer bi1 = new Integer(10);

        System.out.println(bi1.intValue());
        System.out.println(bi1.doubleValue());

        Integer bi2 = 20; //자동 박싱
        int i2 =bi2 + 20; // 자동 언박싱

        String s1 = Double.toString(3.14);
        Float pi = Float.parseFloat("3.14");
        Integer bi3 = Integer.valueOf("11",16);
        System.out.println(bi3);


        System.out.println();
        System.out.println("========================================");
        System.out.println("Arrays Class");
        System.out.println();

        char[] a1 = {'j', 'a', 'v', 'a'};
        char[] a2 = Arrays.copyOf(a1, a1.length);
        System.out.println(a2);

        String[] sa = {"케이크", "애플", "도넛","바나나"};
        print(sa);

        Arrays.sort(sa);
        print(sa);

        System.out.println(Arrays.binarySearch(sa,"애플"));

        Arrays.fill(sa,2,4,"기타");
        print(sa);


        System.out.println();
        System.out.println("=======================================");
        System.out.println("Calender Class");
        System.out.println();

        Date now = new Date();
        System.out.println(now);

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);

        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH)+1);

        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));
        System.out.println(c1.get(Calendar.WEEK_OF_MONTH));

        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println(c1.get(Calendar.MINUTE));


        System.out.println();
        System.out.println("==========================================");
        System.out.println("StringTokenizer");
        System.out.println();

        String arr = "of the poeple, by the people, for the people";
        StringTokenizer st = new StringTokenizer(arr," ,");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
            System.out.println("[" + st.nextToken() + "]");


        System.out.println();
        System.out.println("=======================");
        System.out.println("Random");
        System.out.println();

        Random r = new Random();

        for (int i = 0; i < 5; i++){
            System.out.print(r.nextInt(100) + "    ");
        }


    }
    static void print(Object[] oa){ //Arrays CLass
        for(Object o : oa){
            System.out.print(o + "     ");
        }
        System.out.println();
    }


}



