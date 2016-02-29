// 

import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestMapClass
{
    public static void main(String[] args)
    {
        HashMap<String, String> m1 = new HashMap<String, String>();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hyden");
        m1.put("schildt", "java2s");
        System.out.println(m1.keySet()); 
        System.out.println(m1.values()); 

        TreeMap<String, String> sm = new TreeMap<String, String>();
        sm.put("map", "TreeMap");
        sm.put("schildt", "java2");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2s");
        System.out.println(sm.keySet()); 
        System.out.println(sm.values());

        LinkedHashMap<String, String> lm = new LinkedHashMap<String, String>();
        lm.put("map", "LinkedHashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        System.out.println(lm.keySet()); 
        System.out.println(lm.values());
    }
}
