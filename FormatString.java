public class FormatString
{
    public static void main (String[] args) {
        String S = "00-44  48 5555 8361" ;
        // want to format it as "004-448-555-583-61"
        S = S.replace("-", "");
        S = S.replace(" ", "");
        System.out.println(S);

        char[] caddyString = S.toCharArray();
        String result = "";

        Integer i = 1 ;

        for (char caddyFor : caddyString) {
            if (i%3 == 0 && i != S.length()) {
                result = result + caddyFor + "-";
            } else {
                result = result + caddyFor;
            }
            i++;
        }
        System.out.println("Index : " + i + " value " + result);
    }
}
