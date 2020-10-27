package src.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subdomain {
//    A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
//
//            Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
//
//    We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
//
public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> counts = new HashMap();
    for (String domain: cpdomains) {
        String[] cpinfo = domain.split("\\s+");
        String[] frags = cpinfo[1].split("\\.");
        int count = Integer.valueOf(cpinfo[0]);
        String cur = "";
        for (int i = frags.length - 1; i >= 0; --i) {
            cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
            counts.put(cur, counts.getOrDefault(cur, 0) + count);
        }
    }

    List<String> ans = new ArrayList();
    for (String dom: counts.keySet())
        ans.add("" + counts.get(dom) + " " + dom);
    return ans;
}
}
