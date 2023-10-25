package nl.novi;

public class Main {

    public static void main(String[] args) {
        //1st tier
        Person Alma = new Person("Alma", "Madrugal", 60, 'f');
        Person Pedro = new Person("Pedro", "Madrugal", 62, 'm');

        //2nd tier
        Person Bruno = new Person("Bruno", "Madrugal", 40, 'm');
        Person Henkie = new Person("Hank", "de", "bouwer", 21, 'm');
        Person Felix = new Person("Felix", "Jansen", 38, 'm');
        Person Agustin = new Person("Agustin", "Frons", 39, 'm');
        Person Annabel = new Person("Annebel", "huffenpuff", 38, 'f');
        Person Julietta = new Person("Julietta", "Madrugal", 42, 'm');
        Person Pepa = new Person("Pepa", "Madrugal", 42, 'f');
        //3rd tier
        Person Antonio = new Person("Antonio", "Jansen", 19, 'm');
        Person Dolores = new Person("Dolores", "Jansen", 17, 'f');
        Person Camilo = new Person("Camilo", "Jansen", 15, 'f');
        Person Mirabel = new Person("Mirabel", "Frons", 18, 'f');
        Person Isabela = new Person("Isabela", "Frons", 15, 'f');
        Person Luisa = new Person("Luisa", "Frons", 9, 'f');

        // 1th tier has no parent

        // Add 2nd tier parent.
        Julietta.addParents(Pedro, Alma, Julietta);
        Pepa.addParents(Pedro, Alma, Pepa);
        Bruno.addParents(Pedro, Alma, Bruno);
        Henkie.addParents(Pedro, Julietta, Henkie); // verschillende ouders.

        // Add 3rd tier parent
        Antonio.addParents(Felix, Pepa, Antonio);
        Dolores.addParents(Felix, Pepa, Dolores);
        Camilo.addParents(Felix, Pepa, Camilo);
        Mirabel.addParents(Agustin, Annabel, Mirabel);
        Isabela.addParents(Agustin, Annabel, Isabela);
        Luisa.addParents(Agustin, Annabel, Luisa);

        // Pets
        Pet dog = new Pet("woefje", 10, "hond");
        Bruno.setPets(dog);
        Pet cat = new Pet("mieuwy", 15, "kat");
        Isabela.setPets(cat);

        // Use of methods
        System.out.println("----------------------");
        printChildren(Pedro); // Print the children of a parent
        System.out.println("----------------------");
        printGrandChildren(Pedro);// Print the grandChildren of a 1st tier parent
        System.out.println("----------------------");
        printSiblings(Henkie);
        System.out.println("----------------------");
        sexChange(Henkie); // henkie is a Man, changes to a female.
        System.out.println("All images stolen from google!");


    }

    static void printGrandChildren(Person grandparent) {
        grandparent.getGrandChildren();
        System.out.println("The grand childeren of " + grandparent.getName() + " are :");
        for (Person grandchild : grandparent.getGrandChildren()) {
            System.out.println(grandchild.getName());
        }

    }

    static void printChildren(Person father) {
        System.out.println(father.getName() + " has the following children ");
        for (Person child : father.getChildren()) {
            System.out.println(child.getName());
        }
    }

    static void printSiblings(Person person) {
        System.out.println("The siblins of " + person.getName());
        for (Person personList : person.getSiblings()) {
            System.out.println(personList.getName());
        }
    }

    static void sexChange(Person person) {
        System.out.println(person.getName() + " changed his sex from: " + person.getSex());
        if (person.getSex() == 'f') {
            System.out.println("werkt deze ?");
            person.setSex('m');
        } else if (person.getSex() == 'm') {
            person.setSex('f');
            System.out.println("of deze ?");
        }
        System.out.println(" changed his sex to: " + person.getSex());
    }
}
