import java.util.Scanner;

public class SurvivalDude {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(System.getProperty("line.separator"));

		String response, name, friendName;
		int a;
		int deathNum = 0;
		int day = 1;

		do {
			System.out.print("\n\nWhat is your name? ");
			name = keyboard.next();

			do {
				System.out.println("\n\nAll right then, " + name + ", let's get started.");
				keyboard.next();
				System.out.println("You are on a plane. Suddenly, the plane's engine explodes.");
				keyboard.next();
				System.out.println("What do you do?\n\n(1) Cry \n\n(2) Grab a parchute and jump ");
				a = keyboard.nextInt();
			} while (a != 2 && a != 1);
			if (a == 1) {
				do {
					// escape plane
					System.out.println(
							"Your crying attracts the attention of a flight attendant,\n\nwho puts a parachute on you and kicks you off the plane.");
					keyboard.next();
					System.out.println("You pull the cord and slowly drift onto an island.");
					keyboard.next();
					System.out.println("You take off the parachute and see a forest.");
					keyboard.next();
					System.out.println("What do you do?\n\n(1) Explore (2) Go for a swim ");
					a = keyboard.nextInt();
				} while (a != 1 && a != 2);
				if (a == 2) {
					do {
						// swim my dude
						System.out.println("You wade into the warm ocean water. You sure are having fun!");
						keyboard.next();
						System.out.println("Eventually you get tired and go back on shore.");
						keyboard.next();
						System.out.println("The sun is setting and you're cold.");
						keyboard.next();
						System.out.println("You sure are bad at planning ahead.");
						keyboard.next();
						System.out.println(
								"What now? \n\n(1) Cover yourself with sand and go to sleep\n\n(2) Try to find shelter in the forest ");
						a = keyboard.nextInt();
					} while (a != 1 && a != 2);
					if (a == 2) {
						do {
							System.out.println("You go into the forest and find a comfy rock to sleep on.");
							keyboard.next();
							System.out.println("You cover yourself with ferns and close your eyes.");
							keyboard.next();
							System.out.println("You wake up the next day. Your stomach grumbles.");
							keyboard.next();
							System.out.println("What do you do? \n\n(1)Sleep to conserve energy (2) Eat those weird looking berries ");
							a = keyboard.nextInt();
							day++;
						} while (a != 1 && a != 2);
						if (a == 2) {
							do {
								System.out.println("Those berries taste real good.");
								keyboard.next();
								System.out.println("Wow, you just found a food source. Good job!");
								keyboard.next();
								System.out.println("You are no longer hungry.");
								keyboard.next();
								System.out.println("What do you want to do?\n\n(1)Try to make a shelter (2)Look for more food ");
								a = keyboard.nextInt();
							} while (a != 1 && a != 2);
							if (a == 1) {
								do {
									System.out.println(
											"You spend the rest of the day collecting material for your house.");
									keyboard.next();
									System.out.println("However, it is too dark to keep building your house at night.");
									keyboard.next();
									System.out.println(
											"What do you do?\n\n(1)Try anyway (2) Go to sleep on your cold rock again ");
									a = keyboard.nextInt();
								} while (a != 1 && a != 2);
								if (a ==1) {
									do {
										System.out.println("You build the frame for your shelter.");
										keyboard.next();
										System.out.println("You try to lift a heavy chunk of wood.");		
										keyboard.next();
										System.out.println("You drop it on your foot.");
										keyboard.next();
										System.out.println("Now your foot is hurt, bozo.");
										keyboard.next();
										System.out.println("What do you do?\n\n(1)Try to keep working (2) Make a splint ");
										a = keyboard.nextInt();
								}while (a != 1 && a != 2);
									if (a == 2) {
										do {
											System.out.println("You succesfully splint your foot.");
											keyboard.next();
											System.out.println("You go to sleep in your half-finished shelter.");
											keyboard.next();
											System.out.println("You wake up. Your foot does not hurt as much anymore.");
											keyboard.next();
											System.out.println("You finish building your house.");
											keyboard.next();
											System.out.println("What now? \n\n(1)Eat some berries(2)Try to make a boat");
											a = keyboard.nextInt();
											day ++;
										} while (a != 1 && a != 2);
										if (a == 1) {
											do {
												System.out.println("Those berries taste really good.");
												keyboard.next();
												System.out.println("You decide you're never going to make it off the island on your own.");
												keyboard.next();
												System.out.println("That means you need to survive until rescuers arrive.");								
												keyboard.next();
												System.out.println("What do you do to survive?\n\n(1)Continue making your house\n\n(2)Eat A L L the berries");
												a = keyboard.nextInt();
											} while (a != 1 && a != 2);
											if (a == 2) {
												do {
													System.out.println("You eat all the Y U M M Y berries.");
													keyboard.next();
													System.out.println("Those berries energize and uplift you.");
													keyboard.next();
													System.out.println("Now that you are fully awake, what do you want to do?\n\n(1)Make some friends\n\n(2)Make weapons");
													a = keyboard.nextInt();
												} while (a != 1 && a != 2);
												if (a == 1) {
													do {
														System.out.println("You explore the forest and look for some friends.");
														keyboard.next();
														System.out.println("You encounter a baby pig.");
														keyboard.next();
														System.out.println("What do you do?\n\n(1)Pet it\n\n(2)Give it some berries");
														a = keyboard.nextInt();
													} while (a != 1 && a != 2);
													if (a == 2) {
														do {
															System.out.println("The pig eats all the Y U M M Y berries.");
															keyboard.next();
															System.out.println("The pig now follows you around.");
															keyboard.next();
															System.out.println("You just made a friend! What's his name?");
															friendName = keyboard.next();
															System.out.println("What do you want to do with "+friendName+"?\n\n(1)Train your friend to fight\n\n(2)Go play in the ocean");
															a = keyboard.nextInt();
														} while (a != 1 && a != 2);
														if (a == 2) {
															do {
																System.out.println("You and "+friendName+" go into the ocean.");
																keyboard.next();
																System.out.println("You have fun until the sun sets.");
																keyboard.next();
																System.out.println("You and "+friendName+" head back to your shelter.");
																keyboard.next();
																System.out.println("You go to sleep with "+friendName+".");
																keyboard.next();
																System.out.println("You wake up the next day and eat berries with "+ friendName+".");
																keyboard.next();
																System.out.println("What now? \n\n(1)Spell out 'Help!' on the beach (2)Learn how to make fire");
																a = keyboard.nextInt();
																day++;
															} while (a != 1 && a != 2);
															if (a == 1) {
																do {
																	System.out.println("You go to the beach with some rocks.");
																	keyboard.next();
																	System.out.println("You spend a couple hours arranging the rocks in the perfect position.");
																	keyboard.next();
																	System.out.println("Now people can see that you need help. Congrats!");
																	keyboard.next();
																	System.out.println("You have some time to kill before nightfall. What do you do?\n\n(1)Lay around and do nothing (2)Find something to eat other than berries");
																	a = keyboard.nextInt();
																} while (a != 1 && a != 2);
																if (a == 1) {
																	do {
																		System.out.println("You sit on the beach and relax in the sun.");
																		keyboard.next();
																		System.out.println("Eventually you get hot and crawl into the shade.");
																		keyboard.next();
																		System.out.println("You are so bored, you go to sleep early.");
																		keyboard.next();
																		System.out.println("You wake up the next day to the sound of a helicopter.");
																		keyboard.next();
																		System.out.println("A man drops down from a rope ladder and walks toward you..");
																		keyboard.next();
																		System.out.println("Who is it ?! (1) Snoop Dogg (2) The Babadook");
																		a = keyboard.nextInt();
																	} while (a != 1 && a != 2);
																	if (a == 1) {
																			System.out.println("You as Snoop Dogg if he is here to help.");
																			keyboard.next();
																			System.out.println("He replies 'Fo shizzle, go watch some televizzle.'");
																			keyboard.next();
																			System.out.println("He brings you and "+ friendName+"back to the mainland and you live happily ever after.");
																			keyboard.next();															
																	}else {
																		System.out.println("Why would you choose the Babadook?");
																		keyboard.next();
																		System.out.println("Well guess what?");
																		keyboard.next();
																		System.out.println("You died!\n\n");
																		deathNum++;
																	}
																}else {
																	System.out.println("You find a new type of berry.");
																	keyboard.next();
																	System.out.println("You pop them into your mouth and fall unconscious.");
																	keyboard.next();
																	System.out.println("They were poisonous.");
																	keyboard.next();
																	System.out.println("You died!\n\n");
																	deathNum++;
																}
															}else {
																System.out.println("You smack some rocks together, which creates sparks.");
																keyboard.next();
																System.out.println("Those sparks spread to the dead plants on the forest floor.");
																keyboard.next();
																System.out.println("The entire island is set on fire.");
																keyboard.next();
																System.out.println("You died!\n\n");
																deathNum++;
																}
														}else {
															System.out.println("You put a pointy rock in "+friendName+"'s mouth.");
															keyboard.next();
															System.out.println(""+friendName+" stabs you and steals your berries.");
															keyboard.next();
															System.out.println("You died!\n\n");
															deathNum++;
															}
													}else {
														System.out.println("As you pet the pig, a shadow falls over you.");
														keyboard.next();
														System.out.println("It's the pig's mom!");
														keyboard.next();
														System.out.println("She eats you.");
														keyboard.next();
														System.out.println("You died!\n\n");
														deathNum++;
														}
												}else {
													System.out.println("You need weapons to survive. You pick up some sticks and shiny rocks.");
													keyboard.next();
													System.out.println("The rock shines some light into the eye of a giant bird .");
													keyboard.next();
													System.out.println("The giant bird swoops down and eats you.");								
													keyboard.next();
													System.out.println("You died!\n\n");
													deathNum++;
													}
											}else {
												System.out.println("You get some wood for your boat.");
												System.out.println("You try to put a roof over your head.");
												keyboard.next();
												System.out.println("You go inside your house and survey your work.");
												keyboard.next();
												System.out.println("The roof collapses over your head.");								
												keyboard.next();
												System.out.println("You died!\n\n");
												deathNum++;
												}
										}else {
											System.out.println("You get some wood for your boat.");
											keyboard.next();
											System.out.println("You realize that you do not know how to build a boat.");
											keyboard.next();
											System.out.println("You sit down and start crying.");
											keyboard.next();
											System.out.println("A wild boar appeared!");
											keyboard.next();
											System.out.println("What do you think happens? \n\n(1)You die(2) You still die, but faster");
											a = keyboard.nextInt();
											System.out.println("You died!\n\n");
											deathNum++;
											}
									}else {
											System.out.println("Your foot hurts, but you don't care.");
											keyboard.next();
											System.out.println("You raise a slab of stone over your head.");
											keyboard.next();
											System.out.println("Your foot gives out and you drop the rock on your head.");
											keyboard.next();
											System.out.println("You died!\n\n");
											deathNum++;
										}
									} else {
									System.out.println("You lay down on your rock.");
									keyboard.next();
									System.out.println("During the night, a giant bird grabs you.");
									keyboard.next();
									System.out.println("You get eaten.");
									keyboard.next();
									System.out.println("You died!\n\n");
									deathNum++;
								}
	
							}else {
							System.out.println("You find a couple of coconut trees and try to climb them.");
							keyboard.next();
							System.out.println("Suddenly, a coconut falls on your head.");
							keyboard.next();
							System.out.println("You died!\n\n");
							deathNum++;
							}
							} else if (a == 1) {
								System.out.println("You wake up a few hours later.");
								keyboard.next();
								System.out.println("You are so hungry you can barely move.");
								keyboard.next();
								System.out.println("You lay on your rock until a wild boar eats you.");
								keyboard.next();
								System.out.println("You died!\n\n");

								deathNum++;
							}
					} else {
						System.out.println("That sand feels nice.");
						keyboard.next();
						System.out.println("A giant crab apppears and eats you.");
						keyboard.next();
						System.out.println("You died!\n\n");
						deathNum++;
					}
				} else if (a == 1) {
					System.out.println("While you are exploring, you find a wild boar.");
					keyboard.next();
					System.out.println("It kills you.\n\n");
					deathNum++;
				}
		}
			 else {
				System.out.println("You leap out of the burning plane.");
				keyboard.next();
				System.out.println("Unfortunately, your parachute doesn't open.");
				keyboard.next();
				System.out.println("You died!\n\n");
				deathNum++;
			}
			if (day == 1) {
				System.out.print("You survived for " + day + " day.");
			} else {
				System.out.print("You survived for " + day + " days.");
			}
			if (day < 3) {
				System.out.print(" That's pretty lame.");
			}
			if (day == 3 || day > 3 && day < 5) {
				System.out.print(" That's pretty good.");
			}
			if (day == 5) {
				System.out.print(" Congrats on surviving!");
			}
			if (deathNum == 1) {
				System.out.print("\nYou died "+deathNum+" time!");
			} else {		
			System.out.print("\nYou died "+deathNum+" times!");
			}
		} while (true);
	}
}



