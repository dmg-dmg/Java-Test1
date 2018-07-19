public class Main {
        public static void main(String args[]){
            boolean num = false;
            for(int i=100;i<201;i++){
                num=false;
                for(int j=2;j<i-1;j++){
                    if(i%j==0){
                        num=true;
                        break;
                    }
                }
                if(!num){
                    System.out.println(  i  );
                }
            }
        }
}
