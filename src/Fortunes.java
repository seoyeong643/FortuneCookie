import java.util.Random;
import java.util.Scanner;

public class Fortunes {
    static String[] generalFortunes = {
            "Do not be afraid of competition.",
            "An exciting opportunity lies ahead of you.",
            "You love peace.",
            "Get your mind set…confidence will lead you on.",
            "You will always be surrounded by true friends.",
            "Sell your ideas-they have exceptional merit.",
            "You should be able to undertake and complete anything.",
            "You are kind and friendly.",
            "You are wise beyond your years.",
            "Your ability to juggle many tasks will take you far.",
            "A routine task will turn into an enchanting adventure.",
            "Beware of all enterprises that require new clothes.",
            "Be true to your work, your word, and your friend.",
            "Goodness is the only investment that never fails.",
            "A journey of a thousand miles begins with a single step.",
            "Forget injuries; never forget kindnesses.",
            "Respect yourself and others will respect you.",
            "A man cannot be comfortable without his own approval.",
            "Always do right. This will gratify some people and astonish the rest.",
            "It is easier to stay out than to get out.",
            "Sing everyday and chase the mean blues away.",
            "You will receive money from an unexpected source.",
            "Attitude is a little thing that makes a big difference.",
            "Plan for many pleasures ahead.",
            "Experience is the best teacher.",
            "You will be happy with your spouse.",
            "Expect the unexpected.",
            "Stay healthy. Walk a mile.",
            "The family that plays together stays together.",
            "Eat chocolate to have a sweeter life.",
            "Once you make a decision the universe conspires to make it happen.",
            "Make yourself necessary to someone.",
            "The only way to have a friend is to be one.",
            "Nothing great was ever achieved without enthusiasm.",
            "Dance as if no one is watching.",
            "Live this day as if it were your last.",
            "Your life will be happy and peaceful.",
            "Reach for joy and all else will follow.",
            "Move in the direction of your dreams.",
            "Bloom where you are planted.",
            "Appreciate. Appreciate. Appreciate.",
            "Happy news is on its way."
    };
    static String[] funnyFortunes = {
            "A closed mouth gathers no feet.",
            "He who throws dirt is losing ground.",
            "Borrow money from a pessimist. They don't expect it back.",
            "Life is what happens to you while you are busy making other plans.",
            "Help! I'm being held prisoner in a fortune cookie factory."
    };
    static String[] romanticFortunes = {
            "Paradise is always where love dwells.",
            "The one you love is closer than you think.",
            "Love is like wildflowers…it is often found in the most unlikely places.",
            "In dreams and in love there are no impossibilities.",
            "Love isn't something you find. Love is something that finds you.",
            "True love is not something that comes everyday, follow your heart, it knows the right answer."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Crack open a Fortune Cookie!");
        System.out.println("Please choose a category:");
        System.out.println("1. General");
        System.out.println("2. Funny");
        System.out.println("3. Romantic");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        String fortune;

        fortune = switch (choice) {
            case 1 -> generalFortunes[rand.nextInt(generalFortunes.length)];
            case 2 -> funnyFortunes[rand.nextInt(funnyFortunes.length)];
            case 3 -> romanticFortunes[rand.nextInt(romanticFortunes.length)];
            default -> {
                System.out.println("Invalid choice. Here's a general fortune instead:");
                yield generalFortunes[rand.nextInt(generalFortunes.length)];
            }
        };

        System.out.println("\nYour Fortune:");
        System.out.println(fortune);
    }
}
