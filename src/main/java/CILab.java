public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {

        boolean firstCap = false;
        boolean allCaps = true;
        boolean allLower = false;
        for (int i = 0; i < myString.length(); i++)
        {
            char c = myString.charAt(i);

            //Checking first character, dictates if capital letter, all caps or all lower case
            if (c >= 'A' && c <= 'Z' && i == 0)
                firstCap = true;
            if (c >= 'a' && c <= 'z' && i == 0)
                allLower = true;

            //Any subsequent non matching letters make the case fail
            if (c >= 'A' && c <= 'Z' && i != 0)
            {
                allLower = false;
                firstCap = false;
            }
            if (c >= 'a' && c <= 'z' && i != 0)
                allCaps = false;

        }

        return allCaps || allLower || firstCap;
        //return answer;
    }

}

