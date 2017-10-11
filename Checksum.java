public class Checksum {



        public static void main (String[] args)
        {

//            System.out.print("Enter first 9 digits of accNum: ");
            String accNum = args[0];

            int sumFunction = 0;
            int sumInts = 0;

            //loop through digits

            for (int i = 0; i < accNum.length(); i++)
            {
                //digit = the location of i in the string entered above
                int digit = new Integer(accNum.substring(i, i+1)).intValue();
                sumInts += digit;
                int function = 0;
                int dTimesTwo = 2*digit;
                String splitter = String.valueOf(dTimesTwo); //splits the value of d*2 into two digits
                for(int k = 0; k < splitter.length(); k++ ){

                    function = Integer.parseInt(splitter.substring(k,k+1));

                }
                sumFunction += function;




//                multiplier--;
            }

            int checkSum = (sumFunction + sumInts)%10;
            // find multiple of 11 for sum of digits (times multiplier)
            /*for (int i = 0; i <= accNum.length()-1; i++)
            {
                if ( ((sumInts + i) % 11) == 0)
                {
                    checkSum = i;
                    break;
                }
            }*/
            System.out.println("Account Number: " + accNum + checkSum);
            System.out.println("checksum: " + checkSum);
        }
    }

