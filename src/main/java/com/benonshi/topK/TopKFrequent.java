package com.benonshi.topK;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 692. 前K个高频单词
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * <p>
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/20 13:12
 **/
public class TopKFrequent {

    public List<String> topKFrequent1(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list, (o1, o2) -> map.get(o1).equals(map.get(o2)) ? o1.compareTo(o2) : map.get(o2) - map.get(o1));
        return list.subList(0, k);
    }

    public List<String> topKFrequent2(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((o1, o2) -> o1.getValue().equals(o2.getValue()) ? o2.getKey().compareTo(o1.getKey()) : o1.getValue() - o2.getValue());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> list = new ArrayList<String>();
        while (!pq.isEmpty()) {
            list.add(pq.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }

    public List<String> topKFrequent3(String[] words, int k) {
        return Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) ->
                        o1.getValue().equals(o2.getValue()) ?
                                o1.getKey().compareTo(o2.getKey()) :
                                o2.getValue().compareTo(o1.getValue())).map(Map.Entry::getKey)
                .limit(k)
                .collect(Collectors.toList());

    }
}


