package softserveex562;

public class SoftServeEx562 {

    public static void main(String[] args) {
        for (int i = 10; i < 10000; i++) {
            String str = i+"";
            int sumOfNthDegree = 0;
            for (int j = 0; j < str.length(); j++) {
                sumOfNthDegree += Math.pow( Integer.parseInt(str.charAt(j)+""), str.length());
            }
            if(sumOfNthDegree==i){
                for (int j = 0; j < str.length(); j++) {
                    System.out.print(str.charAt(j)+"^"+str.length()+" + ");
                }
                System.out.println(" = "+i);
            }
        }
    }
    
}
