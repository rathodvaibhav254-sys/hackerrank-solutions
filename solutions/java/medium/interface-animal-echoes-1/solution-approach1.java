// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/interface-animal-echoes-1/problem?isFullScreen=true
// Problem     Interface - Animal Echoes
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 08:53 p.m.
// ──────────────────────────────────────────────────

// Interface
interface Animal {
    void makeSound();
}

// Dog class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog goes: Woof!");
    }
}

// Cat class
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat goes: Meow!");
    }
}

// Cow class
class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow goes: Moo!");
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
