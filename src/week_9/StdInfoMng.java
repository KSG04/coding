package week_9;

import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StdInfoMng extends StdInfoDTO{

     private int subjectNum;
     private Scanner in = new Scanner(System.in);

    public StdInfoMng(int stdNum, int subjectNum) {
        super(stdNum);
        this.subjectNum = subjectNum;
    }

    @Override
    public boolean equals(Object obj) {
        StdInfo temp;
        if (obj instanceof StdInfo){
            StdInfo m = (StdInfo)  obj;
            for (int i = 0 ; i < stdInfo.length; i++){
                temp = stdInfo[i];
                if (temp != null){
                    if (temp.getName().equals(m.getName()) && (temp.getNumber() == m.getNumber()))
                        return  false;
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public void inputStdInfo() {
        String name;
        int number;
        StringBuilder sb;
        int i = 0;
        StdInfo m;

        while (i < stdNum){
            System.out.printf("[" + ( i + 1) + "]name : ");
            name = in.nextLine();
            System.out.printf("[" + ( i+ 1) + "] number : ");
            number = in.nextInt();
            in.nextLine();
            m = new StdInfo(name,number);
            if (this.equals(m) != true){
                continue;
            }
            super.stdInfo[i] = m;
            sb = new StringBuilder();
            for (int j =0; j <subjectNum; j++){
                System.out.println("subject[" + ( j + 1) + "] : ");
                sb = sb.append(in.nextLine());
                sb = sb.append("\\");
            }
            super.stdInfo[i].setScore(sb.toString());
            i++;
        }
    }


    public void printInfo(int scorePos, int limit) {
        StringTokenizer st;
        int score;
        boolean flag = false;
        for (int i = 0 ; i < stdInfo.length; i++){
            st = new StringTokenizer(stdInfo[i].getScore(),"\\");
            for (int j = 0 ; st.hasMoreTokens(); j++){
                score = Integer.parseInt(st.nextToken());
                if ((scorePos != j) || (score < limit)){
                    continue;
                }
                System.out.println("[" + (j+1) + "]name : " + stdInfo[i].getName() + ",학번 : " + stdInfo[i].getNumber());
                System.out.println(stdInfo[i].getScore());
                System.out.println("========================================================");
                flag = true;
            }
        }
        if (flag == false)
            System.out.println("검색 결과가 없음");
    }

    public static void main(String[] args) {
        StdInfoMng m = new StdInfoMng(2,3);
        m.inputStdInfo();
        m.printInfo(1,40);
    }

}
