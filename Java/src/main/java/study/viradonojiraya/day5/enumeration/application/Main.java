package study.viradonojiraya.day5.enumeration.application;

import study.viradonojiraya.day5.enumeration.domain.Client;
import study.viradonojiraya.day5.enumeration.domain.enums.ClientType;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Danilo", ClientType.PF);
        Client client2 = new Client("Cássia", ClientType.PF);
        Client client3 = new Client("Eliane", ClientType.PJ);

        ClientType.NONE.getInfo();
        ClientType.NO_UUID.getInfo();
        ClientType.PF.getInfo();
        ClientType.PJ.getInfo();
        System.out.println("*** Discounts ***");

        System.out.println(ClientType.NONE.evaluateDiscount2(1000));
        System.out.println(ClientType.NO_UUID.evaluateDiscount2(1000));
        System.out.println(ClientType.PF.evaluateDiscount2(1000));
        System.out.println(ClientType.PJ.evaluateDiscount2(1000));
    }
}
