package StreamExo;

import java.util.*;
import java.util.stream.Collectors;

public class stream {

    public List EvenList(List<Integer>List) {
        return (List.stream().filter(e -> e % 2 == 0).toList());

    }
    public static long sumIndexes(List<Integer> num, List<Integer> indexes)
    {
        return (indexes.stream().mapToLong(num::get).sum());
    }
    public List DeleteDuplicate(List<Integer>List){
        return  List.stream().distinct().toList();
    }
    public List ListFusion(List<Integer>q1,List<Integer>q2){
        LinkedList<Integer> fus = new LinkedList();
        q1.stream().forEach(e->fus.add(e));
        q2.stream().forEach(e->fus.add(e));
        return fus;
    }
    public static Collection<Integer> collectionSort(Set<Integer> set)
    {
        return (set.stream().sorted().collect(Collectors.toSet()));
    }
//    public Map<Character, Integer> caracterCount(String s){
//
//    }
}
