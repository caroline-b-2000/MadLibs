import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class that allows user to play Mad Libs.
 * There are four possible stories to choose from, or one can be randomly selected for you.
 * User answers questions in the terminal then the story is printed as a file title "PlayMadLibsFileIO.txt".
 *
 * @author Caroline Betz
 * @version 1.0
 */
public class PlayMadLibsFileIO {
    /**
     * The string that contains the story that user gets to write.
     */
    private static ArrayList<String> story = new ArrayList<>();
    /**
     * Instance of random to use later to select random story.
     */
    private static Random rand = new Random();
    /**
     * First of four stories.
     */
    private static void story1() {
        Scanner scan = new Scanner(System.in);
        String position1;
        String location1;
        String verb1;
        String location2;
        String publicFigure;
        String largeNum1;
        String cause;
        String largeNum2;
        String time;
        String sus;
        String position2;
        String location3;
        System.out.println("You have picked story 1!");
        System.out.println("Type a position like CEO, or Queen, or President, or Duke: \n");
        position1 = scan.nextLine();
        System.out.println();
        System.out.println("Type a location like a country or company: \n");
        location1 = scan.nextLine();
        System.out.println();
        System.out.println("Type a verb ending in ‘ing’ such as singing or running: \n");
        verb1 = scan.nextLine();
        System.out.println();
        System.out.println("Type a location, such as a city or a store or someone’s home: \n");
        location2 = scan.nextLine();
        System.out.println();
        System.out.println("Type a public figure, such as Jeff Bezos or Big Bird: \n");
        publicFigure = scan.nextLine();
        System.out.println();
        System.out.println("Type a large number, such as 50 or 50,000: \n");
        largeNum1 = scan.nextLine();
        System.out.println();
        System.out.println("Type a charitable cause, such as homeless corgis, world peace, or newly graduated Theater majors: \n");
        cause = scan.nextLine();
        System.out.println();
        System.out.println("Type another very large number, larger than the first one: \n");
        largeNum2 = scan.nextLine();
        System.out.println();
        System.out.println("Type a small period of time such as second, minute, or shift: \n");
        time = scan.nextLine();
        System.out.println();
        System.out.println("Type something suspicious such as money laundering or hiding an underground drug ring: \n");
        sus = scan.nextLine();
        System.out.println();
        System.out.println("Type another position like CEO, or Queen, or President, or Duke: \n");
        position2 = scan.nextLine();
        System.out.println();
        System.out.println("Type another location like a country or company: \n");
        location3 = scan.nextLine();
        story.add("The " + position1 + " of " + location1 + " recently got caught in a scandal.");
        story.add(" They were caught " + verb1 + " in the unfortunate location of " + location2 + " in the unfortunate company of " + publicFigure + ".");
        story.add(" In an attempt to fix their public image, they committed to " + largeNum1 + " hours of community service to the cause of " + cause + ".");
        story.add(" This however failed to turn the tide of public opinion as it was soon revealed that they were actually paying a body double $" + largeNum2 + " per " + time + " and that the seemingly charitable cause was actually a front for " + sus + ".");
        story.add(" They were unable to move on from the recent scandal and were stripped of their title of the " + position1 + " of " + location1 + ", but rumor has it they are currently pursuing a new position as the " + position2 + " of " + location3 + ".");
    }
    /**
     * Second of four stories.
     * The sources for the articles are as follows.
     * Article 1.
     * Original title: How 'goblin mode' became Oxford's word of the year.
     * Link: https://www.npr.org/2022/12/05/1140696560/oxford-word-2022-goblin-mode . 
     * Article 2.
     * Original title: Steve Jobs' worn-out Birkenstocks sell for $218,000 at auction.
     * Link: https://www.npr.org/2022/11/15/1136637908/steve-jobs-auction-sandals-birkenstocks-apple .
     * Article 3.
     * Original title: The National Park Service wants humans to stop licking this toad.
     * Link: https://www.npr.org/2022/11/06/1134615997/the-national-park-service-wants-humans-to-stop-licking-this-toad .
     * Article 4.
     * Original title: 2 California bakers create a life-size Han Solo out of bread.
     * Link: https://www.npr.org/2022/10/17/1129434696/2-california-bakers-create-a-life-sized-han-solo-out-of-bread .
     * Article 5.
     * Original title: America's next top mullet will soon be crowned.
     * Link: https://www.npr.org/2022/10/11/1128235512/mullet-championships-best-competition-2022 .
     * Article 6.
     * Original title: A 2,560-pound Minnesota pumpkin was crowned the winner at this year's weigh-off.
     * Link: https://www.npr.org/2022/10/11/1127904184/2560-pound-pumpkin-sets-new-record .
     * Article 7.
     * Original title: A tomato spill makes a major California highway a marinara mess.
     * Link: https://www.npr.org/2022/08/30/1120033945/tomato-spill-truck-california-highway .
     * Aritcle 8.
     * Original title: A shipment of baby wipes turns out to be $11.8 million worth of cocaine.
     * Link: https://www.npr.org/2022/08/30/1120126091/baby-wipes-cocaine-discovery-us-mexico-border .
     * Article 9.
     * Original title: Why do so many bikes end up underwater? The reasons can be weird and varied.
     * Link: https://www.npr.org/2022/08/04/1115406951/bikes-thrown-in-waterways-viral-videos-citibike-china-bikeshares-jody-rosen .
     * Aritcle 10.
     * Original title: You could get paid to eat candy as a Canadian company's chief candy officer.
     * Link: https://www.npr.org/2022/07/31/1114787324/canadian-company-chief-candy-officer .
     * Article 11.
     * Original title: A distillery is fighting invasive crabs by turning them into whiskey.
     * Link: https://www.npr.org/2022/07/11/1110541257/invasive-green-crabs-whiskey-new-hampshire .
     * Article 12.
     * Original title: A Georgia monument, seen by some as satanic, was damaged from a predawn explosion.
     * Link: https://www.npr.org/2022/07/06/1110210885/georgia-guidestones-monument-damaged-explosion .
     * Article 13.
     * Original title: A marble slab in storage turned out to be an ancient Greek yearbook.
     * Link: https://www.npr.org/2022/06/06/1103372606/ancient-greece-yearbook-discovered .
     * Article 14.
     * Original title: This dog broke into a Tennessee couple's house and snuggled her way into their bed.
     * Link: https://www.npr.org/2022/05/16/1098839121/dog-stranger-in-bed-tennessee-couple .
     * Article 15.
     * Original title: 3 cats have outmaneuvered their 2 humans to hold a blender hostage for weeks.
     * Link: https://www.npr.org/2022/01/14/1072812001/cat-vitamix-blender-box-standoff  .
     */
    private static void story2() {
        Scanner scan = new Scanner(System.in);
        String a1;
        String a2;
        String a3;
        String a4;
        String a5;
        String a6;
        String a7;
        String a8;
        String a9;
        String a10;
        String a11;
        String a12;
        String a13;
        String a14;
        String a15;
        System.out.println("You have picked story 2!");
        System.out.println("Type the weirdest word you can think of, seriously go nuts: \n");
        a1 = scan.nextLine();
        System.out.println();
        System.out.println("Type a noun of any kind, but an object would probably be the funniest: \n");
        a2 = scan.nextLine();
        System.out.println();
        System.out.println("Type another noun, again an object would probably  be the funniest: \n");
        a3 = scan.nextLine();
        System.out.println();
        System.out.println("Type another noun, this time a person place or thing would all be equally entertaining: \n");
        a4 = scan.nextLine();
        System.out.println();
        System.out.println("Type a place: \n");
        a5 = scan.nextLine();
        System.out.println();
        System.out.println("Type a specific competition, such as a pie eating contest or a three legged race: \n");
        a6 = scan.nextLine();
        System.out.println();
        System.out.println("Type another location: \n");
        a7 = scan.nextLine();
        System.out.println();
        System.out.println("Type an incredibly common household object: \n");
        a8 = scan.nextLine();
        System.out.println();
        System.out.println("Type your favorite weird adjective, such as moist or hairy: \n");
        a9 = scan.nextLine();
        System.out.println();
        System.out.println("Type a government position, such as president, mayor, or colonel: \n");
        a10 = scan.nextLine();
        System.out.println();
        System.out.println("Type some kind of plant or animal, such as flower or duck: \n");
        a11 = scan.nextLine();
        System.out.println();
        System.out.println("Type another fun adjective, such as most or hairy: \n");
        a12 = scan.nextLine();
        System.out.println();
        System.out.println("Type a genre of literature, such as romance or fanfiction: \n");
        a13 = scan.nextLine();
        System.out.println();
        System.out.println("Type an occupation or animal, such as a cashier or a cat or a mailman: \n");
        a14 = scan.nextLine();
        System.out.println();
        System.out.println("Type a some kind of household object a cat would have no interest in: \n");
        a15 = scan.nextLine();
        story.add("\n");
        story.add("This is less of a story and instead is fifteen of the strangest news article titles that I could find, with a single word changed. (The links to the articles can be found in the javadocs of the story2() method):");
        story.add("\n");
        story.add("\n");
        story.add("Article 1: 'How '" + a1 + "' became Oxford's word of the year'");
        story.add("\n");
        story.add("\n");
        story.add("Article 2: ‘Steve Jobs' worn-out " + a2 + " sell for $218,000 at auction’");
        story.add("\n");
        story.add("\n");
        story.add("Article 3: ‘The National Park Service wants humans to stop licking this " + a3 + "’");
        story.add("\n");
        story.add("\n");
        story.add("Article 4: ‘2 California bakers create a life-size " + a4 + " out of bread’");
        story.add("\n");
        story.add("\n");
        story.add("Article 5: ‘" + a5 + "'s next top mullet will soon be crowned’");
        story.add("\n");
        story.add("\n");
        story.add("Article 6: ‘A 2,560-pound Minnesota pumpkin was crowned the winner at this year's " + a6 + "’");
        story.add("\n");
        story.add("\n");
        story.add("Article 7: ‘A tomato spill makes a major California " + a7 + " a marinara mess’");
        story.add("\n");
        story.add("\n");
        story.add("Article 8: ‘A shipment of " + a8 + " turns out to be $11.8 million worth of cocaine’");
        story.add("\n");
        story.add("\n");
        story.add("Article 9: ‘Why do so many bikes end up underwater? The reasons can be weird and " + a9 + "’");
        story.add("\n");
        story.add("\n");
        story.add("Article 10: ‘You could get paid to eat candy as a Canadian company's chief candy " + a10 + "’");
        story.add("\n");
        story.add("\n");
        story.add("Article 11: ‘A distillery is fighting invasive " + a11 + " by turning them into whiskey’");
        story.add("\n");
        story.add("\n");
        story.add("Article 12: ‘A Georgia monument, seen by some as satanic, was damaged from a " + a12 + " explosion’");
        story.add("\n");
        story.add("\n");
        story.add("Article 13: ‘A marble slab in storage turned out to be an ancient Greek " + a13 + "'");
        story.add("\n");
        story.add("\n");
        story.add("Article 14: ‘This " + a14 + " broke into a Tennessee couple's house and snuggled her way into their bed’");
        story.add("\n");
        story.add("\n");
        story.add("Article 15: ‘3 cats have outmaneuvered their 2 humans to hold a " + a15 + " hostage for weeks’");
        story.add("\n");
        story.add("\n");
        story.add("The actual titles of these articles, which I found equally as entertaning, as as follows:");
        story.add("\n");
        story.add("\n");
        story.add("Article 1: ‘How 'goblin mode' became Oxford's word of the year’");
        story.add("\n");
        story.add("\n");
        story.add("Article 2: ‘Steve Jobs' worn-out Birkenstocks sell for $218,000 at auction’");
        story.add("\n");
        story.add("\n");
        story.add("Article 3: ‘The National Park Service wants humans to stop licking this toad’");
        story.add("\n");
        story.add("\n");
        story.add("Article 4: ‘2 California bakers create a life-size Han Solo out of bread’");
        story.add("\n");
        story.add("\n");
        story.add("Article 5: ‘America's next top mullet will soon be crowned’");
        story.add("\n");
        story.add("\n");
        story.add("Article 6: ‘A 2,560-pound Minnesota pumpkin was crowned the winner at this year's weigh-off’");
        story.add("\n");
        story.add("\n");
        story.add("Article 7: ‘A tomato spill makes a major California highway a marinara mess’");
        story.add("\n");
        story.add("\n");
        story.add("Article 8: ‘A shipment of baby wipes turns out to be $11.8 million worth of cocaine’");
        story.add("\n");
        story.add("\n");
        story.add("Article 9: ‘Why do so many bikes end up underwater? The reasons can be weird and varied’");
        story.add("\n");
        story.add("\n");
        story.add("Article 10: ‘You could get paid to eat candy as a Canadian company's chief candy officer’");
        story.add("\n");
        story.add("\n");
        story.add("Article 11: ‘A distillery is fighting invasive crabs by turning them into whiskey’");
        story.add("\n");
        story.add("\n");
        story.add("Article 12: ‘A Georgia monument, seen by some as satanic, was damaged from a predawn explosion’");
        story.add("\n");
        story.add("\n");
        story.add("Article 13: ‘A marble slab in storage turned out to be an ancient Greek yearbook’");
        story.add("\n");
        story.add("\n");
        story.add("Article 14: ‘This dog broke into a Tennessee couple's house and snuggled her way into their bed’");
        story.add("\n");
        story.add("\n");
        story.add("Article 15: ‘3 cats have outmaneuvered their 2 humans to hold a blender hostage for weeks’");
        story.add("\n");
    }
    /**
     * Third of four stories.
     */
    private static void story3() {
        Scanner scan = new Scanner(System.in);
        String smallNum1;
        String animal;
        String name;
        String verb;
        String largeNum;
        String smallNum2;
        System.out.println("You have picked story 3!");
        System.out.println("Type a small number, such as 2 or 0.5: \n");
        smallNum1 = scan.nextLine();
        System.out.println();
        System.out.println("Type an animal, such as a dog or a parakeet: \n");
        animal = scan.nextLine();
        System.out.println();
        System.out.println("Type a name that you would give a person but not a pet: \n");
        name = scan.nextLine();
        System.out.println();
        System.out.println("Type a verb ending in ‘ing’ such as walking or dancing: \n");
        verb = scan.nextLine();
        System.out.println();
        System.out.println("Type a large number, such as 12 or 1,400: \n");
        largeNum = scan.nextLine();
        System.out.println();
        System.out.println("Type a small whole number between 1 and 5: \n");
        smallNum2 = scan.nextLine();
        System.out.println();
        story.add("My parents’ reaction to me moving out on my own was subpar. My mom was so distraught that " + smallNum1 + " days after I moved out, she replaced me with a " + animal + " that she named " + name + ".");
        story.add(" Soon " + name + " became my mom’s best friend.");
        story.add(" Every day they started" + verb + " around the neighborhood together.");
        story.add(" It was such a strange sight that the other neighborhood moms soon took notice and started to be concerned for her sanity.");
        story.add(" Soon, they staged an intervention at her house, but it didn’t go quite as planned.");
        story.add(" As soon as all " + largeNum + " mothers showed up at my parents’ humble " + smallNum2 + " room house was filled with suburban mothers discovering that my mom has replaced me with a " + animal + " and had replaced my face in all our family photos with " + name + "’s face.");
    }
    /**
     * Final of four stories.
     */
    private static void story4() {
        Scanner scan = new Scanner(System.in);
        String uni;
        String name;
        String largeNum;
        String negAdj;
        String celeb;
        String smallNum;
        String luxAdj;
        String noun;
        System.out.println("You have picked story 4!");
        System.out.println("Type the name of state or other proper noun: \n");
        uni = scan.nextLine();
        System.out.println();
        System.out.println("Type a person’s name, famous or in your life: \n");
        name = scan.nextLine();
        System.out.println();
        System.out.println("Type a large number, in the range of 100-300: \n");
        largeNum = scan.nextLine();
        System.out.println();
        System.out.println("Type a negative adjective, such as suspicious or gross: \n");
        negAdj = scan.nextLine();
        System.out.println();
        System.out.println("Type a famous person, such as Taylor Swift or Harry Potter: \n");
        celeb = scan.nextLine();
        System.out.println();
        System.out.println("Type a small number, such as 0 or 1500: \n");
        smallNum = scan.nextLine();
        System.out.println();
        System.out.println("Type a luxurious adjective, such as Velvet or Crystal: \n");
        luxAdj = scan.nextLine();
        luxAdj = luxAdj.substring(0, 1).toUpperCase() + luxAdj.substring(1);
        System.out.println();
        System.out.println("Type a noun, such as Dog or Shoe: \n");
        noun = scan.nextLine();
        noun = noun.substring(0, 1).toUpperCase() + noun.substring(1);
        System.out.println();
        story.add("As a freshman at the University of " + uni + ", " + name + " had a hard time adjusting to their new life. ");
        story.add("From living on a floor with over " + largeNum + " people and sharing a bathroom with every single one of them to adjusting to the slightly " + negAdj + " food that the dining hall served, they were struggling. ");
        story.add("After a month in " + name + " was just about over it, until one day a miracle came. ");
        story.add("They spotted a poster in the student center that advertised that " + celeb + " would be performing a concert on campus the next weekend, for the low, low price of $" + smallNum + ". ");
        story.add("This was a notably lower price than " + celeb + "’s concert tickets usually sold for, but " + name + " was so starstruck that they immediately bought the tickets. ");
        story.add("Unfortunately, this did not turn out very well… it turned out to be the winner of a local lookalike contest for " + celeb + ", not actually " + celeb + " themself who was performing. ");
        story.add("Although " + name + " did feel the performance was slightly overpriced at $" + smallNum + ", they did find a new local live music artist to go see at the local music venue, the " + luxAdj + " " + noun + ".");
    }
    /**
     * Method that selects a random story of the four.
     */
    private static void randStory() {
        int storyNum = rand.nextInt(4) + 1;
        switch (storyNum) {
            case 1:
                story1();
            case 2:
                story2();
            case 3:
                story3();
            case 4:
                story4();
            default:
                return;
        }
    }
    /**
     * Method which allows user to select one of the eight stories.
     */
    private static void pickStory() {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("What story would you like to choose?");
        System.out.println("Type a number 1-4: ");
        input = scan.nextLine();
        input = input.strip();
        switch (input) {
            case "1":
                story1();
            case "2":
                story2();
            case "3":
                story3();
            case "4":
                story4();
        }
    }
    /**
     * Method which asks users to select if they want to write a random story of choose one of the eight options.
     */
    private static void write() {
        Scanner scan = new Scanner(System.in);
        String choice = "";
        System.out.println("Would you like to choose which story to write or go with one at random?");
        System.out.println("type 'r' for random and 'c' for choose: ");
        choice = scan.nextLine();
        choice = choice.toLowerCase();
        choice = choice.strip();
        if (choice.equals("c")) {
            pickStory();
        } else if (choice.equals("r")) {
            randStory();
        } else {
            System.out.println("Invalid input, random story chosen for you.");
            randStory();
        }
    }
    /**
     * Main method.
     *
     * @param arrgs Array from command line.
     */
    public static void main(String[] arrgs) {
        System.out.println("location 1");
        write();
        System.out.println("location 2");
        try{
            File outfile = new File("PlayMadLibsFileIO.txt");
            PrintWriter outWriter = new PrintWriter(outfile);
            for (String str: story) {
                outWriter.print(str);
            }
            outWriter.close();
        } catch (IOException ex) {
            System.out.println("IO Error");
        } catch (Exception e) {
            System.out.println("Exception flagged");
        } finally {
            System.out.println();
            System.out.println("Your story has been added to 'PlayMadLibsFileIO.txt'!");
        }
    }
}