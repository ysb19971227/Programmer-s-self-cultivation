import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/22
 * Time: 9:49
 * Description:
 */
/*class Card implements Comparable<Card>{
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card o) {
        return  this.rank - o.rank  ;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}*/
class Card{
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 比较的是：是不是同一个类型
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return rank == card.rank && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }//先不关心
}
/*class RankComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.rank-o2.rank;
    }
}*/

public class TestDemo {

    public static void main(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 = new Card(1,"♥");
        System.out.println(card1.equals(card2));
    }

    public static void main4(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 = new Card(2,"♥");
        /*PriorityQueue<Card> priorityQueue = new PriorityQueue<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.rank-o2.rank;
            }
        });*/
        PriorityQueue<Card> priorityQueue = new PriorityQueue<>((x,y)->{return y.rank-x.rank;});
        priorityQueue.offer(card1);//直接放到底层的queue数组的0下标
        priorityQueue.offer(card2);
        System.out.println(priorityQueue);
    }

   /* public static void main4(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 = new Card(2,"♥");
        RankComparator rankComparator = new RankComparator();
        PriorityQueue<Card> priorityQueue = new PriorityQueue<>(rankComparator);
        priorityQueue.offer(card1);//直接放到底层的queue数组的0下标
        priorityQueue.offer(card2);
        System.out.println(priorityQueue);
    }*/

    public static void main3(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 = new Card(2,"♥");

        //默认就是一个小根堆
 /*       PriorityQueue<Card> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(card1);//直接放到底层的queue数组的0下标
        priorityQueue.offer(card2);

        System.out.println(priorityQueue);*/

        //System.out.println(card1.compareTo(card1));

        /*RankComparator rankComparator = new RankComparator();
        int ret = rankComparator.compare(card1,card2);
        System.out.println(ret);*/

    }


    public static void main2(String[] args) {
        //默认就是一个小根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //每放一个元素 都得保证当前的堆 是大堆 或者是小堆
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(15);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }

    public static void main1(String[] args) {
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        TestHeap testHeap = new TestHeap();
        testHeap.createHeap(array);
        testHeap.heapSort();
        System.out.println("=========");
    }





}

