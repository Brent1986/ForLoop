public class Main {
    public static void main(String[] arg){
        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd (int number){
        if (number <= 0){
            return false;
        } else if ((number >=2) && (number % 2 > 0)){
            return true;
        } else if (number ==1){
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        if ((start <=0) || (end <=0) || (start > end )){
            return -1;
        }else{
            int theResult = 0;
            for(;start<=end; start++){
                boolean isThisOdd = isOdd(start);
                if(isThisOdd){
                    theResult += start;
                }
            }
            return theResult;
        }

    }
}
