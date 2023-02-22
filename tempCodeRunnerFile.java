public class branchrecursion {
    static void fun(int num){
        if(num<0){
            return;
        }
        system.out.println(num);
        fun(num-1);
        fun(num-2);
    }
    run|debug
    public static void(string []args){
        fun(num:3);
    }
}