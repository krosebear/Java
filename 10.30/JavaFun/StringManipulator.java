public class StringManipulator {
    public String trimAndConcat(String x, String y) {
        return x + y;
    }
    public Integer getIndexOrNull(String x, char y){
        int index = x.indexOf(y);
            return index == -1 ? null: index;
    }
    public String concatSubstring(String string1, int int1, int int2, String string2){
        String substring = string1.substring(int1, int2);
        return substring + string2;
    }
   

}