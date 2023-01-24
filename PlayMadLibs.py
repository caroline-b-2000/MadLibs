import random as rand
def play_mad_libs():
    print("Would you like to choose which story to write or go with one at random?\n")
    choice = input("type 'r' for random and 'c' for choose: \n")
    storyNum = 0
    story = ""
    if choice.strip().lower() == "r":
        storyNum = randChoice()
    elif choice.strip().lower() == "c":
        storyNum = pickNum()
    else:
        print("Invalid input, a random choice will be selected for you.")
        storyNum = randChoice()
    if (storyNum == "1"):
        story = story_1()
    elif (storyNum == "2"):
        story = story_2()
    elif (storyNum == "3"):
        story = story_3()
    elif (storyNum == "4"):
        story = story_4()
    print('\nHere is your story:\n')
    print(story)

def randChoice():
    choice = rand.randrange(1,5)
    return str(choice)

def pickNum():
    print("What story would you like to choose?\n")
    choice = input("Type a number 1-4: \n")
    return str(choice)

def story_1():
    story = ""
    print("You have picked story 1!\n")
    position1 = input("Type a position like CEO, or Queen, or President, or Duke: \n")
    location1 = input("Type a location like a country or company: \n")
    verb1 = input("Type a verb ending in ‘ing’ such as singing or running: \n")
    location2 = input("Type a location, such as a city or a store or someone’s home: \n")
    publicFigure = input("Type a public figure, such as Jeff Bezos or Big Bird: \n")
    largeNum1 = input("Type a large number, such as 50 or 50,000: \n")
    cause = input("Type a charitable cause, such as homeless corgis, world peace, or newly graduated Theater majors: \n")
    largeNum2 = input("Type another very large number, larger than the first one: \n")
    time = input("Type a small period of time such as second, minute, or shift: \n")
    sus = input("Type something suspicious such as money laundering or hiding an underground drug ring: \n")
    position2 = input("Type another position like CEO, or Queen, or President, or Duke: \n")
    location3 = input("Type another location like a country or company: \n")
    story = append(story, ("The " + position1 + " of " + location1 + " recently got caught in a scandal."))
    story = append(story, (" They were caught " + verb1 + " in the unfortunate location of " + location2 + " in the unfortunate company of " + publicFigure + "."))
    story = append(story, (" In an attempt to fix their public image, they committed to " + largeNum1 + " hours of community service to the cause of " + cause + "."))
    story = append(story, (" This however failed to turn the tide of public opinion as it was soon revealed that they were actually paying a body double $" + largeNum2 + " per " + time + " and that the seemingly charitable cause was actually a front for " + sus + "."))
    story = append(story, (" They were unable to move on from the recent scandal and were stripped of their title of the " + position1 + " of " + location1 + ", but rumor has it they are currently pursuing a new position as the " + position2 + " of " + location3 + "."))
    return story

'''
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
'''
def story_2():
    story = ""
    print("You have picked story 2!\n")
    a1 = input("Type the weirdest word you can think of, seriously go nuts: \n")
    a2 = input("Type a noun of any kind, but an object would probably be the funniest: \n")
    a3 = input("Type another noun, again an object would probably  be the funniest: \n")
    a4 = input("Type another noun, this time a person place or thing would all be equally entertaining: \n")
    a5 = input("Type a place: \n")
    a6 = input("Type a specific competition, such as a pie eating contest or a three legged race: \n")
    a7 = input("Type another location: \n")
    a8 = input("Type an incredibly common household object: \n")
    a9 = input("Type your favorite weird adjective, such as moist or hairy: \n")
    a10 = input("Type a government position, such as president, mayor, or colonel: \n")
    a11 = input("Type some kind of plant or animal, such as flower or duck: \n")
    a12 = input("Type another fun adjective, such as most or hairy: \n")
    a13 = input("Type a genre of literature, such as romance or fanfiction: \n")
    a14 = input("Type an occupation or animal, such as a cashier or a cat or a mailman: \n")
    a15 = input("Type a some kind of household object a cat would have no interest in: \n")
    story = append(story, ("\n"))
    story = append(story, ("This is less of a story and instead is fifteen of the strangest news article titles that I could find, with a single word changed. (The links to the articles can be found in the javadocs of the story2() method):"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 1: 'How '" + a1 + "' became Oxford's word of the year'"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 2: ‘Steve Jobs' worn-out " + a2 + " sell for $218,000 at auction’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 3: ‘The National Park Service wants humans to stop licking this " + a3 + "’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 4: ‘2 California bakers create a life-size " + a4 + " out of bread’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 5: ‘" + a5 + "'s next top mullet will soon be crowned’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 6: ‘A 2,560-pound Minnesota pumpkin was crowned the winner at this year's " + a6 + "’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 7: ‘A tomato spill makes a major California " + a7 + " a marinara mess’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 8: ‘A shipment of " + a8 + " turns out to be $11.8 million worth of cocaine’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 9: ‘Why do so many bikes end up underwater? The reasons can be weird and " + a9 + "’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 10: ‘You could get paid to eat candy as a Canadian company's chief candy " + a10 + "’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 11: ‘A distillery is fighting invasive " + a11 + " by turning them into whiskey’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 12: ‘A Georgia monument, seen by some as satanic, was damaged from a " + a12 + " explosion’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 13: ‘A marble slab in storage turned out to be an ancient Greek " + a13 + "'"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 14: ‘This " + a14 + " broke into a Tennessee couple's house and snuggled her way into their bed’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 15: ‘3 cats have outmaneuvered their 2 humans to hold a " + a15 + " hostage for weeks’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("The actual titles of these articles, which I found equally as entertaning, as as follows:"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 1: ‘How 'goblin mode' became Oxford's word of the year’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 2: ‘Steve Jobs' worn-out Birkenstocks sell for $218,000 at auction’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 3: ‘The National Park Service wants humans to stop licking this toad’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 4: ‘2 California bakers create a life-size Han Solo out of bread’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 5: ‘America's next top mullet will soon be crowned’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 6: ‘A 2,560-pound Minnesota pumpkin was crowned the winner at this year's weigh-off’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 7: ‘A tomato spill makes a major California highway a marinara mess’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 8: ‘A shipment of baby wipes turns out to be $11.8 million worth of cocaine’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 9: ‘Why do so many bikes end up underwater? The reasons can be weird and varied’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 10: ‘You could get paid to eat candy as a Canadian company's chief candy officer’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 11: ‘A distillery is fighting invasive crabs by turning them into whiskey’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 12: ‘A Georgia monument, seen by some as satanic, was damaged from a predawn explosion’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 13: ‘A marble slab in storage turned out to be an ancient Greek yearbook’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 14: ‘This dog broke into a Tennessee couple's house and snuggled her way into their bed’"))
    story = append(story, ("\n"))
    story = append(story, ("\n"))
    story = append(story, ("Article 15: ‘3 cats have outmaneuvered their 2 humans to hold a blender hostage for weeks’"))
    story = append(story, ("\n"))
    return story


def story_3():
    story = ""
    print("You have picked story 3!\n")
    smallNum1 = input("Type a small number, such as 2 or 0.5: \n")
    animal = input("Type an animal, such as a dog or a parakeet: \n")
    name = input("Type a name that you would give a person but not a pet: \n")
    verb = input("Type a verb ending in ‘ing’ such as walking or dancing: \n")
    largeNum = input("Type a large number, such as 12 or 1,400: \n")
    smallNum2 = input("Type a small whole number between 1 and 5: \n")
    story = append(story, ("My parents’ reaction to me moving out on my own was subpar. My mom was so distraught that " + smallNum1 + " days after I moved out, she replaced me with a " + animal + " that she named " + name + "."))
    story = append(story, (" Soon " + name + " became my mom’s best friend."))
    story = append(story, (" Every day they started" + verb + " around the neighborhood together."))
    story = append(story, (" It was such a strange sight that the other neighborhood moms soon took notice and started to be concerned for her sanity."))
    story = append(story, (" Soon, they staged an intervention at her house, but it didn’t go quite as planned."))
    story = append(story, (" As soon as all " + largeNum + " mothers showed up at my parents’ humble " + smallNum2 + " room house was filled with suburban mothers discovering that my mom has replaced me with a " + animal + " and had replaced my face in all our family photos with " + name + "’s face."))
    return story

def story_4():
    story = ""
    print("You have picked story 4!\n")
    uni = input("Type the name of state or other proper noun: \n")
    uni = uni[0].upper() + uni[1:]
    name = input("Type a person’s name, famous or in your life: \n")
    largeNum = input("Type a large number, in the range of 100-300: \n")
    negAdj = input("Type a negative adjective, such as suspicious or gross: \n")
    celeb = input("Type a famous person, such as Taylor Swift or Harry Potter: \n")
    smallNum = input("Type a small number, such as 0 or 1500: \n")
    luxAdj = input("Type a luxurious adjective, such as Velvet or Crystal: \n")
    luxAdj = luxAdj[0].upper() + luxAdj[1:];
    noun = input("Type a noun, such as Dog or Shoe: \n")
    noun = noun[0].upper() + noun[1:];
    story = append(story, "As a freshman at the University of " + uni + ", " + name + " had a hard time adjusting to their new life. ")
    story = append(story, "From living on a floor with over " + largeNum + " people and sharing a bathroom with every single one of them to adjusting to the slightly " + negAdj + " food that the dining hall served, they were struggling. ")
    story = append(story, "After a month in " + name + " was just about over it, until one day a miracle came. ")
    story = append(story, "They spotted a poster in the student center that advertised that " + celeb + " would be performing a concert on campus the next weekend, for the low, low price of $" + smallNum + ". ")
    story = append(story, "This was a notably lower price than " + celeb + "’s concert tickets usually sold for, but " + name + " was so starstruck that they immediately bought the tickets. ")
    story = append(story, "Unfortunately, this did not turn out very well… it turned out to be the winner of a local lookalike contest for " + celeb + ", not actually " + celeb + " themself who was performing. ")
    story = append(story, "Although " + name + " did feel the performance was slightly overpriced at $" + smallNum + ", they did find a new local live music artist to go see at the local music venue, the " + luxAdj + " " + noun + ".")
    return story

def append(str, newstr):
    return str + newstr

play_mad_libs()