  /*
  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"a": 1, "bb": 2}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "this": 4, "and": 3}
wordLen(["code", "code", "code", "bug"]) → {"bug": 3, "code": 4}
  */
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    map.put(s, 0);
  }
  return map;
