import java.util.Scanner;

import Electricitybill.billpayment;

class Electricitybill {
    private long unit;
    private double billtopay;

    public void setunit() {
        Scanner inputunit = new Scanner(System.in);
        System.out.println("enter no of unit");
        this.unit = inputunit.nextInt();

    }

    public void getbilltopay() {

        if (unit <= 0) {
            System.out.println("no unit payed");

        } else {
            return getbilltopay;
        }
    }

    public void setbilltopay() {
        Scanner inputbilltopay = new Scanner(System.in);
        System.out.println("your bill to pay is" + payment);
    }

    class billpayment {
        private String name;
        private int phoneNumber;
        private String email;
        private String address;

        public billpayment(String namein, int phoneNumberin, String emailin, String addressin) {
            namein = name;
            phoneNumberin = phoneNumber;
            emailin = email;
            addressin = address;

        }

        public void setname() {
            Scanner inputname = new Scanner(System.in);
            System.out.println("enter your name");
            this.name = inputname.nextLine();
        }

        public void setphoneNumber() {
            Scanner inputphoneNumber = new Scanner(System.in);
            System.out.println("enter your phoneNumber");
            this.phoneNumber = inputphoneNumber.nextInt();
        }

        public void setaddress() {
            Scanner inputaddress = new Scanner(System.in);
            System.out.println("enter your address");
            this.address = inputaddress.nextLine();

        }

        public void setemail() {
            Scanner inputemail = new Scanner(System.in);
            System.out.println("enter your email");
            this.email = inputemail.nextLine();

        }

    }

    class Meternumber extends Electricitybill {
        Meternumber(long unit, double billtopay, int meternumber) {

            super(unit, billtopay);
            this.meternumber = meternumber;
        }
    }

    public void setmeternumber() {
        Scanner inputmeternumber = new Scanner(System.in);
        System.out.println("enter meter numer");
        this.meternumber = inputmeternumber.nextInt();
    }
}

public class project {
    public static void main(String[] args) {
        Electricitybill getmt = new Electricitybill();
        getmt.setbilltopay();
        getmt.setunit();

        billpayment bm = new billpayment();
        bim.setname();
        bm.setaddress();
        bim.setemail();
        bim.setphoneNumber();
    }

}