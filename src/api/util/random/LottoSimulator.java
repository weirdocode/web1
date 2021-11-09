package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {
   
   static Random r = new Random();
   
   static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
   static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
   static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
   static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
   static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
   static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수
   
   public static int[] createLotto() {
      
      int[] lotto = new int[6];
      
      /*
       - 1~45 범위의 난수 6개를 생성하셔서
        lotto 배열에 넣어서 리턴해 주시면 됩니다.
       - 난수끼리는 중복이 발생하면 안됩니다.
        난수를 생성한 후에 생성된 난수가 이미 배열에 있는지를
         확인하여, 이미 존재한다면 다시 생성해서 검사해 주시고
        존재하지 않는다면 배열에 추가해 주시면 됩니다.
       - return 전에 배열을 정렬해서 리턴해 주세요.
        (while으로 작성했습니다. for로 작성하셔도 됩니다.) 
      */
      
      int i = 0; //lotto 배열의 인덱스
      
      while(i < lotto.length) {
         boolean flag = false; //중복 여부를 알려주는 변수.
         int rn = r.nextInt(45) + 1;
         for(int j=0; j<=i; j++) {
            if(rn == lotto[j]) { //중복이 발생!
               flag = true;
               break;
            }
         }
         if(!flag) { //중복이 발생하지 않았다면
            lotto[i] = rn;
            i++; //다음 인덱스로 이동. 중복 발생 시에는 올라가지 않음.
         }      
      }
      Arrays.sort(lotto);
      return lotto;   
   }
   
   //보너스번호를 생성하는 메서드
   public static int createBonusNum(int[] win) {
      /*
       - 매개값으로 전달되는 당첨번호들을 피해서
        1~45 사이의 난수를 하나 리턴해 주시면 되겠습니다.
        당첨번호와 중복된다면 중복되지 않을 때 까지 다시 뽑아주시면
        되겠습니다. (boolean 변수를 활용하면 쉽습니다.)
       */
      
      int bonus = 0;
      while(true) {
         boolean flag = false;
         int rn = r.nextInt(45) + 1;
         for(int i : win) {
            if(rn == i) { //중복이 발생!
               flag = true;
               break;
            }
         }
         if(!flag) {
            bonus = rn;
            break;
         }
      }
      return bonus;
   }
   
   //당첨 등수를 알려주는 메서드
   public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
      
      /*
       내 로또 번호와 당첨번호 배열을 비교하여 
       일치하는 횟수를 기억해 두세요.
       일치하는 숫자만큼 위에 선언한 static 변수의 값을
        올려 주시면 되겠습니다.
       6개 일치 -> 1등
       5개 일치 + 보너스번호 일치 -> 2등
       5개 일치 -> 3등
       4개 일치 -> 4등
       3개 일치 -> 5등
       나머지 -> 꽝
       */
      
      int count = 0; //내 로또번호와 당첨번호가 몇 개 일치하는 지 세 줄 변수.
      
      for(int i : myLotto) {
         for(int j : win) {
            if(i == j) {
               count++;
               break;
            }
         }
      }
      
      if(count == 6) prize1++;
      else if(count == 5) {
         boolean flag = false;
         for(int num : myLotto) {
            if(num == bonus) {
               prize2++;
               flag = true;
               break;
            }
         }
         if(!flag) prize3++;
      } else if(count == 4) prize4++;
      else if(count == 3) prize5++;
      else failCnt++;
   
   }
   
   

   public static void main(String[] args) {
      
      //당첨번호 고정
      int[] win = createLotto();
      //보너스번호 고정
      int bonus = createBonusNum(win);
      
      int paper = 0;
      long money = 0;
      
      while(true) {
         
         int[] myLotto = createLotto();
         paper++;
         checkLottoNumber(myLotto, win, bonus);
         
         if(prize1 == 1) {
            money = paper * 1000;
            System.out.println("*** 1등에 당첨되었습니다!!! ***");
            System.out.println("--------------------------");
            System.out.println("*** 1등에 당첨되는 동안 누적 당첨 횟수 ***");
            System.out.printf("2등 당첨 횟수: %d회\n", prize2);
            System.out.printf("3등 당첨 횟수: %d회\n", prize3);
            System.out.printf("4등 당첨 횟수: %d회\n", prize4);
            System.out.printf("5등 당첨 횟수: %d회\n", prize5);
            System.out.printf("꽝 당첨 횟수: %d회\n", failCnt);
            System.out.println("1등 한 번 당첨 되려고 당신이 쓴 금액: " + money + "원");
            break;
         } else {
            System.out.printf("로또 %d장 째 구매 중...\n", paper);
         }
         
      }
      
      
      
      
   }

}











