
class Avg{

    public static void average(String[] num){
        double sum = 0;
       double len = num.length;
        for(String str  : num ){
            sum += Integer.valueOf(str);
        }
        double res = sum /len;
        System.out.println( String.format("%.2f", res)) ;
    }
    public static void main(String[] args){
        average(args);
    }

}