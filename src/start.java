public class start {

    //#1, Warmup-1
    public int diff21(int n){
        int value;
        if(n <= 21){
            value = Math.abs(21-n);
            return value;
        }else{
            value = Math.abs((21-n) * 2);
            return value;
        }
    }

    //#2, Warmup-1
    public int sumDouble(int a, int b){
        if(a == b){
            return (a+b) * 2;
        }else{
            return a + b;
        }
    }

    //#3, Warmup-1
    public boolean parrotTrouble(boolean talking, int hour){
        if(talking == false){
            return false;
        }else if(hour < 7 || hour >20){
            return true;
        }else{
            return false;
        }
    }

    //#4, Warmup-2
    public String stringTimes(String str, int n){
        String string = "";
        for(int i = 0; i < n; i++){
            string += str;
        }
        return string;
    }

    //#5, String-1
    public String helloName(String name) {
        return "Hello " + name +"!";
    }

    //#6, String-1
    public String makeOutWord(String out, String word) {
        String out1 = out.substring(0,2);
        String out2 = out.substring(2);
        return out1 + word + out2;
    }

    //#7, String-1
    public String firstHalf(String str) {
        int n = str.length();
        String firstHalf = str.substring(0, (n/2));
        return firstHalf;
    }

    //#8, String-1
    public String nonStart(String a, String b) {
        String one = a.substring(1);
        String two = b.substring(1);
        return one + two;
    }

    //#9, String-1
    public String theEnd(String str, boolean front){
        String returnString;
        if(front == true){
            returnString = str.substring(0, 1);
        }else{
            int length = str.length();
            returnString = str.substring(length-1, length);
        }
        return returnString;
    }

    //#10, String-1
    public String middleThree(String str) {
        int n = str.length();
        int middle = n / 2;
        int beforeMiddle = middle-1;
        int afterMiddle = middle+2;
        String str1 = str.substring(beforeMiddle, afterMiddle);
        return str1;
    }

    //#11, String-1
    public String withoutEnd(String str) {
        int n = str.length();
        String withoutEnd = str.substring(1, (n-1));
        return withoutEnd;
    }

    //#12, String-1
    public String left2(String str) {
        String left = str.substring(0, 2);
        String right = str.substring(2);
        return right + left;
    }

    //#13, String-1
    public String makeTags(String tag, String word) {
        String firsttag = "<" + tag + ">";
        String secondtag = "</" + tag + ">";
        return firsttag + word + secondtag;
    }

    //#14, Logic-1
    public static boolean love6(int a, int b){
        if(a == 6 || b == 6){
            return true;
        }else if(a + b == 6){
            return true;
        }else if(a - b == 6) {
            return true;
        }else if(b - a == 6){
            return true;
        }else{
            return false;
        }
    }


    //#15, Logic-1
    public static boolean cigarParty(int cigars, boolean isWeekend){
        boolean returnParty = true;
        if(isWeekend == true){
            if(cigars >=40){
                returnParty = true;
            }else{
                returnParty = false;
            }
        }else if(isWeekend == false){
            if(cigars >= 40 && cigars<= 60){
                returnParty = true;
            }else{
                returnParty = false;
            }
        }
        return returnParty;
    }

    //#16, Logic-1
    public static boolean more20(int n){
        if(n >= 0){
            if(((n - 1) % 20 == 0)||(n-2) % 20 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //#17, Logic-1
    public static boolean nearTen(int num) {
        if ((num % 10 == 0) || ((num - 1) % 10 == 0) || ((num - 2) % 10 == 0)) {
            return true;
        }else if((num % 10 == 0) || ((num + 1) % 10 == 0) || ((num + 2) % 10 == 0)){
            return true;
        }else{
            return false;
        }
    }

    //#18, Logic-1
    public static boolean twoAsOne(int a, int b, int c){
        if((a + b == c) || (b + c == a) || (c + a == b)){
            return true;
        }else{
            return false;
        }
    }

    //#19, Logic-1
    public boolean lastDigit(int a, int b, int c){
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;
        if((aLast == bLast && bLast== cLast) || (aLast == bLast) || (bLast==cLast) || (aLast==cLast)){
            return true;
        }else{
            return false;
        }
    }

    //#20, Logic-1
    public static int maxMod5(int a, int b){
        int a5 = a % 5;
        int b5 = b % 5;
        if(a == b){
            return 0;
        }else if(a5 == b5){
            if(a > b){
                return b;
            }else{
                return a;
            }
        }else{
            if(a > b){
                return a;
            }else{
                return b;
            }
        }
    }

    //#21, Logic-1
    public static int blueTicket(int a, int b, int c){
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if(ab == 10 || bc == 10 || ac == 10){
            return 10;
        }else if((ab - 10 == bc) || (ab - 10 == ac)){
            return 5;
        }else{
            return 0;
        }
    }

    //#22, Logic-1
    public String alarmClock(int day, boolean vacation){
        String alarm = "0:00";
        if(vacation == false && day >=1 && day <=5){
            alarm = "7:00";
        }else if(vacation == false && day >= 6 && day <=7 || day == 0 && vacation == false){
            alarm = "10:00";
        }else if(vacation == true && day >= 1 && day <= 5){
            alarm = "10:00";
        }else if (vacation == true && day >=6 || vacation == true && day <=7){
            alarm = "off";
        }
        return alarm;
    }

    //#23, Logic-1
    public int dateFashion(int you, int date){
        int number = 0;
        if((you >= 8 || date >= 8) && (you > 2 && date > 2)){
            number =  2;
        }else if((you >= 8 || date >= 8) && (you <= 2 || date <= 2)){
            number = 0;
        }else if(you > 2 && date > 2){
            number = 1;
        }
        return number;
    }

    //#24, Logic-1
    public static int sortaSum(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <=19){
            return 20;
        }else{
            return sum;
        }
    }

    //#25, Logic-1
    public boolean in1To10(int n, boolean outsideMode){
        if(outsideMode == true){
            if(n<=1 || n>=10){
                return true;
            }else{
                return false;
            }
        }else{
            if(n >=1 && n <=10){
                return true;
            }else{
                return false;
            }
        }
    }

    //#26, Logic-1
    public boolean old35(int n){
        int mult3 = n % 3;
        int mult5 = n % 5;
        if(mult3 == 0 && mult5 == 0){
            return false;
        }else if(mult3 == 0 || mult5 == 0){
            return true;
        }else{
            return false;
        }
    }

    //#27, Logic-1
    public int teenSum(int a, int b){
        int sum = a + b;
        if((a>=13 && a<=19)||(b>=13 && b<=19)){
            return 19;
        }else{
            return sum;
        }
    }

    //#28, Array-1
    public boolean firstLast6(int[] nums){
        int length = nums.length;
        if(nums[0]==6 || nums[length-1]==6){
            return true;
        }else{
            return false;
        }
    }

    //#29, Array-1
    public boolean sameFirstLast(int[] nums){
        int length = nums.length;
        if((length >= 1) && (nums[0] == nums[length-1])){
            return true;
        }else{
            return false;
        }
    }

    //#30, Array-1
    public int[] makePi(){
        int[] arr = {3, 1, 4};
        return arr;

    }

    //#31, Array-1
    public boolean commonEnd(int[] a, int[] b){
        int lengthA = a.length;
        int lengthB = b.length;
        if((a[0] == b[0]) || (a[lengthA-1] == b[lengthB -1])){
            return true;
        }else{
            return false;
        }
    }

    //#32, Array-1
    public int sum3(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    //#33, Array-1
    public int[] rotateLeft3(int[] nums){
        int first = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = first;
        return nums;
    }

    //#34, Array-1
    public int[] reverse3(int[] nums){
        int first = nums[0];
        int last = nums[2];
        nums[0] = last;
        nums[2] = first;
        return nums;
    }

    //#35, Array-1
    public int[] maxEnd3(int[] nums){
        int larger = 0;
        if(nums[0] > nums[nums.length - 1]){
            larger = nums[0];
        }else{
            larger = nums[nums.length - 1];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = larger;
        }
        return nums;
    }

    //#36, Array-1
    public int sum2(int[] nums){
        int length = nums.length;
        int result = 0;
        if(length > 2){
            for(int i = 0; i < 2; i++){
                result += nums[i];
            }
        }else if(length == 0){
            result = 0;
        }else{
            for(int i = 0; i < length; i++){
                result += nums[i];
            }
        }
        return result;
    }

    //#37, Logic-2
    public int blackjack(int a, int b) {
        if(a > 21 && b > 21){
            return 0;
        }else if(a > 21){
            return b;
        }else if(b > 21){
            return a;
        }else if(21-a > 21-b){
            return b;
        }else{
            return a;
        }
    }

    //#38, String-2
    public String doubleChar(String str) {
        int length = str.length();
        String newString = "";
        for(int i = 0; i < length; i++){
            newString += str.charAt(i);
            newString += str.charAt(i);
        }
        return newString;
    }


    //#39, String-3
    public boolean gHappy(String str) {
        int length = str.length();
        boolean isHappy = false;
        for(int i = 0; i < length; i++){
            if(str.substring(i, i+1).equals("g")){
                if((i>1 && str.substring(i-1, i).equals("g")) || (i+1<length && str.substring(i+1, i+2).equals("g"))){
                    isHappy = true;
                }else{
                    isHappy = false;
                }
            }
        }
        return isHappy;
    }

    //#40, Array-2
    public int countEvens(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //#41, Array-3, NOT COMPLETE
    public int[] fix34(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                int switched = nums[i+1];
                if(nums[i+1] == 4){
                    nums[i+2] = switched;
                }
                nums[i+1] = 4;
            }
        }
        return nums;
    }

}
