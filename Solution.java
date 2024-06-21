class Solution {
    public String modify(String s){
        String out1 = "";
        String out2 = "";

        for(int i=0; i<s.length(); i=i+2){
            out1 += s.charAt(i);
        }
        for(int i=1; i<s.length(); i=i+2){
            out2 += s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        char[] temp1 = out1.toCharArray();
        char[] temp2 = out2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        sb.append(temp1);
        sb.append(temp2);
        return sb.toString();
    }
    public int numSpecialEquivGroups(String[] words) {
        Set<String> temp = new HashSet<>();
        for(String s : words){
            String str = modify(s);
            temp.add(str);
        }
        return temp.size();
    }
}
