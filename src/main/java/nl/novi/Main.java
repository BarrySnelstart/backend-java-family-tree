package nl.novi;

public class Main {

    public static void main(String[] args) {
        Person Antonio = new Person("Antonio", "Jansen", 19, 'm');
        Person Dolores = new Person("Dolores", "Jansen", 17, 'f');
        Person Camilo = new Person("Camilo", "Jansen", 15, 'f');

        Person Mirabel = new Person("Mirabel", "Frons", 18, 'f');
        Person Isabela = new Person("Isabela", "Frons", 15, 'f');
        Person Luisa = new Person("Luisa", "Frons", 9, 'f');
        Person Julietta = new Person("Julietta", "Madrugal", 42, 'm');
        Person Pepa = new Person("Pepa", "Madrugal", 42, 'f');
        Person Bruno = new Person("Bruno", "Madrugal", 40, 'm');
        Person Henkie = new Person("Hank", "de", "bouwer", 21, 'm');
        Person Felix = new Person("Felix", "Jansen", 38, 'm');
        Person Agustin = new Person("Agustin", "Frons", 39, 'm');
        Person Alma = new Person("Alma", "Madrugal", 60, 'f');
        Person Pedro = new Person("Pedro", "Madrugal", 62, 'm');
        Person Annabel = new Person("Annebel", "huffenpuff", 38, 'f');



        Julietta.addParents(Pedro, Alma, Julietta);
        Pepa.addParents(Pedro, Alma, Pepa);
        Bruno.addParents(Pedro, Alma, Bruno);
        Henkie.addParents(Pedro, Julietta, Henkie); // verschillende ouders.

        Antonio.addParents(Felix, Pepa, Antonio);
        Dolores.addParents(Felix, Pepa, Dolores);
        Camilo.addParents(Felix, Pepa, Camilo);

        Mirabel.addParents(Agustin, Annabel, Mirabel);
        Isabela.addParents(Agustin, Annabel, Isabela);
        Luisa.addParents(Agustin, Annabel, Luisa);

        Alma.getGrandChildren();
        System.out.println("----------------------");
        Pedro.getGrandChildren();

        Pet woefje = new Pet("woefje", 10, "hond");
        woefje.addPet(Bruno, woefje);

        Pet mieuwy = new Pet ("mieuwy", 15, "kat");
        mieuwy.addPet(Pepa, mieuwy);

        System.out.println("All images stolen from google!");

    }
}
