package Grok2.Pokemon;
import java.util.Random;

public class PokemonBattle {
            public static void main(String[] args) {
                Random random = new Random();
                Pokemon[] pokemons = {new Pikachu(), new Charizard(), new Bulbasaur(), new Squirtle(), new Gengar()};
                Pokemon player1 = pokemons[random.nextInt(pokemons.length)];
                Pokemon player2;
                do {
                    player2 = pokemons[random.nextInt(pokemons.length)];
                } while (player2 == player1); // Ensure player1 and player2 are different Pokémon
        
                System.out.println("Battle between " + player1 + " and " + player2 + " begins!");
        
                while (!player1.isFainted() && !player2.isFainted()) {
                    if (random.nextBoolean()) {
                        player1.attack(player2);
                    } else {
                        player2.attack(player1);
                    }
                    System.out.println(player1 + ", " + player2);
                }
        
                Pokemon winner = player1.isFainted() ? player2 : player1;
                System.out.println(winner.name + " wins the battle! The other Pokémon has fainted.");
            }
        }