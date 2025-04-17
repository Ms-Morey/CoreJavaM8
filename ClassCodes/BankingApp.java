import java.util.Scanner;

class BankingApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String address = null;
        long mobile = 0;
        float bal = 0.0f;
        int pin = 0;

        // infinite loop for account creation and existing user
        for ( ; ;) {
            System.out.println("*** WELCOME  to LAXMI CHIT FUND ***");
            System.out.println("*** 25 din mein paisa double ***");
            System.out.println();
            System.out.println("1.Existing Customer");
            System.out.println("2.Create an Account");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    // check user has created a account or not
                    if (name == null) {
                        System.out.println();
                        System.out.println("CREATE YOUR ACCOUNT FIRST");
                        break;
                    }
                    // if user created account then display the feature
                    for (;;) {
                        System.out.println();
                        System.out.println("**** Features ****");
                        System.out.println("1.Check balance");
                        System.out.println("2.Deposit Amount");
                        System.out.println("3.Withdraw Amount");
                        System.out.println("4.Account Details");
                        System.out.println("5.Exit");
                        System.out.println();
                        int opt = sc.nextInt();
                        System.out.println();
                        switch (opt) {
                            case 1: {
                                System.out.println("*** Check Balance ***");
                                System.out.println();
                                System.out.println("Enter your pin : ");
                                int pin1 = sc.nextInt();
                                if (pin1 == pin) {
                                    System.out.println("Account Balance is : " + bal + " cr");
                                } else {
                                    System.out.println("Wrong pin entered");
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("*** Deposite Amount ***");
                                System.out.println();
                                System.out.println("Enter the amount : ");
                                float deposit = sc.nextFloat();
                                bal += deposit;
                                System.out.println();
                                System.out.println("Amount deposited successfully");
                                break;
                            }
                            case 3: {
                                System.out.println("*** Withdrawal ***");
                                System.out.println();
                                System.out.println("Enter the amount : ");
                                float withdrawal = sc.nextFloat();
                                System.out.println("Enter the pin :");
                                int pin2 = sc.nextInt();
                                if (pin2 == pin) {
                                    if (withdrawal <= bal) {
                                        System.out.println("Amount debited" + withdrawal + " from your account");
                                        bal -= withdrawal;
                                    } else {
                                        System.out.println(("Insufficient Funds "));
                                    }
                                } else {
                                    System.out.println("Wrong Pin Entered");
                                }
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.println();
                                System.out.println("**** Acccount Details ****");
                                System.out.println("Account holder name : " + name);
                                System.out.println("Address : " + address);
                                System.out.println("Mobile number : " + mobile);
                                System.out.println();
                                break;
                            }
                            case 5: {
                                System.out.println("Thank you for using our application");
                                System.exit(0);// terminates the entire execution.
                            }
                            default: {
                                System.out.println("Wrong option Entered");
                                break;
                            }
                        }

                    }
                }
                // Taking account details from user and storing it in the variables.
                case 2: {
                    System.out.println("Create Account");
                    System.out.println("*** Enter your Details below ***");
                    System.out.println("Account holder name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Address : ");
                    address = sc.nextLine();
                    System.out.println("Mobile number : ");
                    mobile = sc.nextLong();
                    System.out.println("Amoun to deposite : ");
                    bal = sc.nextFloat();
                    System.out.println("Enter the pin : ");
                    pin = sc.nextInt();

                    break;
                }
                default: {
                    System.out.println("Wrong Option");
                    break;
                }

            }
            System.out.println();
        }
    }   
}
