package week_4.과제3_영어로반환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Dictionary {
    private Map<String,String> words = new HashMap<String,String>();

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public Dictionary(){
        System.out.println("한글 영어 변환 프로그램");
    }

    public void choose() throws IOException {
        System.out.println("\n1번 : 단어 추가\n2번 : 단어 검색\n3번 : 모든 단어 출력\n4번 : 프로그램 종료");
        int select = 0;
        try {
            select = Integer.parseInt(bf.readLine());
        }catch (Exception e){
            System.err.println(e + "\n" + "잘못 입력하셨습니다.");
            choose();
        }
        switch (select){
            case 1 : addWord();
            case 2 : searchWord();
            case 3 : allSearchWord();
            case 4 : end();
            default:
                System.out.println("잘못 입력하셨습니다.");
        }


    }



    public void setWord(){
        words.put("사과","apple");
        words.put("바나나","banana");
        words.put("배","ship");
    }

    public void addWord() throws IOException {
        System.out.println("단어를 추가합니다.");

        System.out.print("한글 입력 : ");
        String koreaWord = bf.readLine();

        System.out.println("\n영어 입력 : ");
        String englishWord = bf.readLine();

        words.put(koreaWord,englishWord);
        choose();

    }

    public void searchWord() throws IOException {
        System.out.print("검색할 한글 입력");
        int count = 0;
        String word = bf.readLine();

        Iterator<String> keys = words.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            if (word.equals(key)){
                count ++;
                System.out.println("한글 : " + word + " 영어 : " + words.get(word) + "\n");
            }
        }
        if (count == 0){
            System.out.println("등록되어 있지 않은 단어 입니다.");
        }
        choose();
    }
    public void allSearchWord() throws IOException {
        Iterator<String> keys = words.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println("한글 : " + key +" ->" + " 영어 : " + words.get(key));
        }
        choose();
    }
    public void end(){
        System.err.println("프로그램을 종료합니다 ㅠㅠ");
        System.exit(0);
    }

}
