

public class Main {

    public static void main(String[] args) {
        Address address = new Address("123 main st", "Apt 12", "Austin", "Tx", "78749");
        Address address2 = new Address("456 House Ln", "Unit 7", "Austin", "Tx", "78745");
        Address addresses[] = new Address[2];
        addresses[0] = address;
        addresses[1] = address2;

        Member member = new Member("Bob Saget", "1999-04-22", addresses);


        System.out.println(member);
    }
}
