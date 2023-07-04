package selfStudyJava.codeWars.kyu6;

/*
You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to
an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a
Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings
representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter
(direction) and you know it takes you one minute to traverse one city block, so create a function that will return
true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters
('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
 */
public class TakeTenMinutesWalk6kyu {
    public static void main(String[] args) {
        char[] walk = new char[] {'n','s','w','n','s','n','s','n','s'};

        boolean isGood = false;
        if (walk.length == 10) {
            int north = 0;
            int east = 0;
            for (int i = 0; i < walk.length; i++) {
                north = (walk[i] == 'n') ? north+1 : north;
                north = (walk[i] == 's') ? north-1 : north;
                east = (walk[i] == 'e') ? east+1 : east;
                east = (walk[i] == 'w') ? east-1 : east;
            }
            isGood = (north == 0 && east == 0) ? true : false;
        }
        System.out.println("The walk is good?  ".concat(Boolean.toString(isGood)));
    }
}