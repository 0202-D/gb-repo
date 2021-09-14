public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(10, 0));
        checkInt(-10);
        System.out.println(checkInt2(2));
        print("Hardcore",3);
        System.out.println(year(2000));
    }

     static boolean sum(int x, int y) {
        if (x + y >= 10 && x + y <= 20) {
            return true;
        } else {
            return false;
        }

    }
     static void checkInt(int x){
        if(x>=0){
            System.out.println("Число положительное");}
        else {
            System.out.println("Число отрицательное");}

    }
     static boolean checkInt2(int x){
        if(x>=0){
            return false;}
        else {
            return true;}

    }
     static void print (String s,int x){
        for(int i=0;i<x;i++){
            System.out.println(s);
        }
    }
     static boolean year(int x){
        if(x%4==0&&x%100!=0||x%400==0){return true;}
        else {return false;}
    }
}
