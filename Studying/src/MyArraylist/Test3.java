package MyArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/18 20:58
 */

/**
 * 创建扑克牌类
 */
class Card {
    private String suit;
    private int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "[ " + suit + " " + rank + " ]";
    }
}



public class Test3 {

    public static final String[] SUITS = {"♥","♠","♣","♦"};

    /**
     * 买回来的一副牌
     * @return 返回牌
     */
    public static List<Card> buyCard() {
        List<Card> desk = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String suit = SUITS[i];
                Card card = new Card(suit,j);
                desk.add(card);
            }
        }
        return desk;
    }

    /**
     * 洗牌之后的牌
     * @param cardList 牌
     */
    public static void shuffle(List<Card> cardList) {
        for (int i = cardList.size()-1; i > 0 ; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            swap(cardList,i,index);
        }
    }

    /**
     * 两个牌进行交换
     * @param cardList 牌
     * @param i 被交换的牌
     * @param j 去交换的牌
     */
    private static void swap(List<Card> cardList,int i,int j) {
        Card temp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,temp);
    }


    public static void main(String[] args) {
        List<Card> cardList = buyCard();
        System.out.println("买来的牌" + cardList);
        shuffle(cardList);
        System.out.println("洗牌之后" + cardList);

        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();

        List<List<Card>> hands = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);

        // 三个人轮流抓5张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                // 每次抓牌都去获取cardList的0下标的元素（删除）
                Card card = cardList.remove(0);
                hands.get(j).add(i,card);
            }
        }
        System.out.println("第一个人的牌：" + hand1);
        System.out.println("第二个人的牌：" + hand2);
        System.out.println("第三个人的牌：" + hand3);
        System.out.println("剩余的牌：" + cardList);
    }
}
