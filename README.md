# maven 命令
sh package .sh   （写在sh run.sh中）
将远程库克隆到本地，然后执行sh run.sh操作（切换到该目录下运行） 
    
## Java 考试

1.输出101-200之间的素数
```java
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
```
2.编辑工资
```java
public class RevenuePattern {
    private static class SingletonHolder {
        private static final RevenuePattern instance = new RevenuePattern();
    }

    private RevenuePattern() {
    }

    public static final RevenuePattern getInsatance(double x) {
        x=x-3500;
        if (x<=1500) {
            double revenue = x*0.03;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else if(x>1500 && x<=4500) {
            x=x-1500;
            double revenue = x*0.1;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else if(x>4500 && x<=9000){
            x=x-4500;
            double revenue = x*0.2;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else if(x>9000 && x<=35000){
            x=x-9000;
            double revenue = x*0.25;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else if(x>35000 && x<=55000) {
            x=x-35500;
            double revenue = x*0.3;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else if(x>55000 && x<=85000) {
            x=x-55000;
            double revenue = x*0.35;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }else {
            x=x-85000;
            double revenue = x*0.45;
            System.out.printf("应缴纳税额：%.2f",revenue);
        }
        return SingletonHolder.instance;
    }
}
```


