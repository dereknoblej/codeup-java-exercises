import java.util.Scanner;
public class console_adventure_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User! Enter your hero's name");
        String heroName = sc.nextLine();
        System.out.printf("Welcome %s! Are you ready to start?", heroName);
        String readyHero = sc.next();
        if (readyHero.equals("yes")){
            System.out.println("Health: 100, Attack: 25, Exp.: 0");
        }
        System.out.println("Oh no! An enemy!");
        System.out.println("Here are your actions: Attack, Run and Potion. What would you like to do?");
        String heroAction = sc.next();
        if (heroAction.equals("Attack")){
            System.out.println("You reduced your enemy's health to 25!");
            System.out.println("What would you like to do next?");
            String heroAction2 = sc.next();

            if(heroAction2.equals("Attack")){
                System.out.println("Your reduced your enemy's health to 0!");
                System.out.println("Hurray you win");
                System.out.println("Health: 100, Attack: 25, Exp.:20");
                return;
            }
            if(heroAction2.equals("Run")){
                System.out.println("Your enemy shoots you in the back... again. You lose 30 more health.");
                System.out.println("Health: 70, Attack: 25, Exp.: 0");
                System.out.println("What would you like to do next?");
                String heroAction3 = sc.next();

                if(heroAction3.equals("Attack")){
                    System.out.println("Your reduced your enemy's health to 0!");
                    System.out.println("Hurray you win!");
                    System.out.println("Health: 70, Attack: 25, Exp.:20");
                    return;
                }
                if(heroAction3.equals("Run")){
                    System.out.println("Your enemy shoots you in the back... again. You lose 30 more health.");
                    System.out.println("Health: 40, Attack: 25, Exp.: 0");
                    System.out.println("What would you like to do next!?");
                    String heroAction4 = sc.next();

                    if(heroAction4.equals("Attack")){
                        System.out.println("Your reduced your enemy's health to 0!");
                        System.out.println("Hurray you win");
                        System.out.println("Health: 40, Attack: 25, Exp.:20");
                        return;
                    }
                    if(heroAction4.equals("Run")){
                        System.out.println("Your enemy shoots you in the back... CRITICAL HIT!");
                        System.out.println("Health: 0, Attack: 0, Exp.: 0");
                        System.out.println("YOU LOSE");
                        return;

                    }
                    if(heroAction4.equals("Potion")){
                        System.out.println("You just drank the potion! Your Health increased by 20");
                        System.out.println("Health: 90, Attack: 25, Exp.: 0");
                        System.out.println("What would you like to do next?");
                        String heroAction5 = sc.next();

                        if(heroAction4.equals("Attack")){
                            System.out.println("Your reduced your enemy's health to 0!");
                            System.out.println("Hurray you win!");
                            System.out.println("Health: 90, Attack: 25, Exp.:20");
                            return;
                        }
                        if(heroAction4.equals("Run")){
                            System.out.println("Your enemy shoots you in the back...");
                            System.out.println("Health: 60, Attack: 0, Exp.: 0");
                            System.out.println("What would you like to do next?");
                            String heroAction6 = sc.next();
                            if(heroAction4.equals("Attack")){
                                System.out.println("Your reduced your enemy's health to 0!");
                                System.out.println("Hurray you win");
                                System.out.println("Health: 60, Attack: 25, Exp.:20");
                                return;
                            }
                            if(heroAction4.equals("Run")){
                                System.out.println("Your enemy shoots you in the back... CRITICAL HIT!");
                                System.out.println("Health: 0, Attack: 0, Exp.: 0");
                                System.out.println("YOU LOSE");
                                return;

                            }
                            if(heroAction4.equals("Potion")){
                                System.out.println("You are out of potions! Your enemy attacks while you are distracted.");
                                System.out.println("Health: 30, Attack: 25, Exp.: 0");
                                System.out.println("What would you like to do next?");
                                String heroAction6 = sc.next();

                            }
                        }
                        if(heroAction4.equals("Potion")){
                            System.out.println("You are out of potions! Your enemy attacks while you are distracted.");
                            System.out.println("Health: 60, Attack: 25, Exp.: 0");
                            System.out.println("What would you like to do next?");
                            String heroAction6 = sc.next();

                        }
                    }

                }
                if(heroAction2.equals("Potion")){
                    System.out.println("You just drank the potion! Your Health increased by 20");
                    System.out.println("Health: 90, Attack: 25, Exp.: 0");
                    System.out.println("What would you like to do next?");
                    String heroAction4 = sc.next();
                }

            }
            if(heroAction2.equals("Potion")){
                System.out.println("You just drank the potion! Your Health increased by 20");
                System.out.println("Health: 120, Attack: 25, Exp.: 0");
                System.out.println("What would you like to do next?");
                String heroAction3 = sc.next();
            }

        }



        if (heroAction.equals("Run")){
            System.out.println("Your enemy shoots you in the back you lose 30 health");
            System.out.println("Health: 70, Attack: 25, Exp.: 0");
            System.out.println("What is your next action?");
            String heroRunAction = sc.next();
            if(heroRunAction.equals("Attack")){
                System.out.println("Your reduced your enemy's health to 25!");
                System.out.println("What would you like to do next?");
                String heroAction3 = sc.next();
            }
            if(heroRunAction.equals("Run")){
                System.out.println("Your enemy shoots you in the back... again. You lose 30 more health.");
                System.out.println("Health: 40, Attack: 25, Exp.: 0");
                System.out.println("What would you like to do next?");
                String heroAction3 = sc.next();
            }
            if(heroRunAction.equals("Potion")){
                System.out.println("You just drank the potion! Your Health increased by 20");
                System.out.println("Health: 60, Attack: 25, Exp.: 0");
                System.out.println("What would you like to do next?");
                String heroAction3 = sc.next();
            }
        }




    }
}
