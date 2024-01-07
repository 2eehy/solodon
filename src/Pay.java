public class Pay {

    public static int price=0;
    int coupon =(int) (Math.random()*6 + 5);


    public int memberPrice(){
        return  price /100 *(100-coupon) ;

    }

    public int normalPrice() {
        return price;
    }
}
