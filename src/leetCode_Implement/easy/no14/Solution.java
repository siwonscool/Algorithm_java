package leetCode_Implement.easy.no14;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (j >= strs[i].length()){
                    prefix = prefix.substring(0,j);
                    break;
                }

                if (prefix.charAt(j) != strs[i].charAt(j)){
                    prefix = prefix.substring(0,j);
                    break;
                }
            }
        }

        return prefix;
    }
}
