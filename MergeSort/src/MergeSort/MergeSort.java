package MergeSort;

import java.util.Vector;

public class MergeSort {
    public static Vector<Integer> merge(Vector<Integer> v, Vector<Integer> w){
        Vector<Integer> res = new Vector<>();
        int i = 0;
        int j = 0;
        while(i < v.size() && j < w.size()){
            if(v.get(i) < w.get(j)){
                res.add(v.get(i));
                i++;
            }
            else{
                res.add(w.get(j));
                j++;
            }
        }
        while(i < v.size()){
            res.add(v.get(i));
            i++;
        }
        while(j < w.size()){
            res.add(w.get(j));
            j++;
        }
        return res;
    }

    public static Vector<Integer> mergeSort(Vector<Integer> v, Vector<Integer> w) {
        //Check if v and w are sorted
        for(int i = 0; i < v.size() - 1; i++){
            if(v.get(i) > v.get(i + 1)){
                throw new IllegalArgumentException("v is not sorted");
            }
        }
        for(int i = 0; i < w.size() - 1; i++){
            if(w.get(i) > w.get(i + 1)){
                throw new IllegalArgumentException("w is not sorted");
            }
        }

        //Merge v and w into t
        Vector<Integer> t = merge(v, w);

        //If t is already sorted, return it
        for(int i = 0; i < t.size() - 1; i++){
            if(t.get(i) > t.get(i + 1)){
                break;
            }
            if(i == t.size() - 2){
                return t;
            }
        }

        int m = 1;
        while(m < t.size()){

            //Split t into sublists of size m
            for(int i = 0; i < t.size(); i += 2*m){
                Vector<Integer> v1 = new Vector<>();
                Vector<Integer> v2 = new Vector<>();
                for(int j = i; j < i + m && j < t.size(); j++){
                    v1.add(t.get(j));
                }
                for(int j = i + m; j < i + 2*m && j < t.size(); j++){
                    v2.add(t.get(j));
                }
                //Merge sublists v1 and v2 into t
                Vector<Integer> res = merge(v1, v2);
                for(int j = i; j < i + 2*m && j < t.size(); j++){
                    t.set(j, res.get(j - i));
                }
            }

            //Double m
            m = 2*m;
        }
        return t;
    }
}
