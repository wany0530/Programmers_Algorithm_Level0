import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum DiscountPercent
{
    Forty(40, 0.4)
    , Thirty(30, 0.3)
    , Twoenti(20, 0.2)
    , Ten(10, 0.1);

    private int percent;
    private double decimalPoint;

    DiscountPercent(int percent, double decimalPoint)
    {
        this.percent = percent;
        this.decimalPoint = decimalPoint;
    }

    public int getPercent()
    {
        return percent;
    }

    public double getDecimalPoint()
    {
        return decimalPoint;
    }
}
class Person
{
    private int personNum;
    private int wantPercent;
    private int maxPrice;
    private boolean isBuyEmoticonPlus;
    private List<Product> productList;

    public Person(int personNum, int percent, int maxPrice)
    {
        this.personNum = personNum;
        this.wantPercent = percent;
        this.maxPrice = maxPrice;
    }

    public int getPersonNum() {
        return personNum;
    }

    public int getWantPercent() {
        return wantPercent;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public double getDecimalPoint()
    {
        return wantPercent % 100;
    }

    public boolean isBuyEmoticonPlus()
    {
        return isBuyEmoticonPlus;
    }

    public void setBuyEmoticonPlus(boolean buyEmoticonPlus)
    {
        this.isBuyEmoticonPlus = buyEmoticonPlus;
    }
}

class Product
{
    private int percent;
    private int price;
    private boolean isBuy;

    public Product(int percent, int price)
    {
        this.percent = percent;
        this.price = price;
    }

    public int getPercent()
    {
        return percent;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean isBuy()
    {
        return isBuy;
    }

    public void setBuy(boolean buy)
    {
        isBuy = buy;
    }
}

public class Solution
{
    public static void main(String[] args)
    {
        int[][] users = {{40, 10000}, {25, 10000}};
        int[]emoticons = {7000, 9000};
    }
    public static int[] solution(int[][] users, int[] emoticons)
    {
        int minPercent = Arrays.stream(users).map(e -> e[0]).min(Integer::compareTo).orElse(0);

        int cnt = 1;
        List<Person> personList = new ArrayList<>();

        for(int[] arr : users)
        {
            personList.add(new Person(cnt++, arr[0], arr[1]));
        }

        for(Person user : personList)
        {
            for(int emoticon : emoticons)
            {
                for(DiscountPercent dp : DiscountPercent.values())
                {
                    if(dp.getPercent() < user.getWantPercent())
                        break;

                    double allPrice = Arrays.stream(emoticons).mapToDouble(e -> emoticon * dp.getDecimalPoint()).sum();
                    if(allPrice > user.getMaxPrice())
                    {
                        user.setBuyEmoticonPlus(true);
                    }
                }

            }
        }




        int[] answer = {};
        return answer;
    }

}
