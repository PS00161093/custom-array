class MatchningStrings {

    /*
     * https://www.hackerrank.com/challenges/sparse-arrays/problem
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for(String q: queries) {
            int count = 0;
            for(String s: strings){
                if(q.trim().equalsIgnoreCase(s.trim())){
                    count++;
                }
            }
            result.add(count);
        }
      
        return result;
    }

}
