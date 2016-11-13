/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/

public Map<String, Boolean> wordMultiple(String[] strings) {
   Map<String, Boolean> map = new HashMap<String, Boolean> ();
  for (String s:strings) {
    
    if (!map.containsKey(s)) {  // first time we've seen this string
      map.put(s, false);
    }
    else
    {
      map.put(s, true);
    }
  }
  return map;
 
}
