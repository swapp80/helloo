package Backtracking;

import java.util.ArrayList;

//only right and down movement are allowded
public class Maze1 {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        retPath(" " , 3,3);
        System.out.println(PathList(" " ,3,3));

    }
    public static int count(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;

    }
    public static void retPath(String p , int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            retPath(p + 'D' , r-1,c);
        }
        if(c > 1){
            retPath(p + 'R',r,c-1);
        }

    }
    public static ArrayList<String> PathList(String p , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(PathList(p + 'D' , r-1,c));
        }
        if(c > 1){
            ans.addAll(PathList(p + 'R',r,c-1));
        }
        return ans;

    }
}
