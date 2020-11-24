public class App {
    public static void main(String[] args) throws Exception {
        Director dir = new Director("Prime");
        Director dir2 = new Director("Second");
        dir.add(dir2);
        txtFile text1 = new txtFile("Ana are mere");
        dir.add(text1);
        txtFile text2 = new txtFile("Maria are mere");
        dir.add(text2);
        txtFile text3 = new txtFile("Georgeta are mere");
        dir.add(text3);

        svgFile fisier1 = new svgFile("video");
        dir.add(fisier1);

        mp3File fisier2 = new mp3File("muzica");
        dir.add(fisier2);

        System.out.println("Directorul "+ dir.getNume() + " contine: ");
        dir.print();

        text1.setAlignStrategy(new AlignLeft());
        text2.setAlignStrategy(new AlignCenter());
        text3.setAlignStrategy(new AlignRight());

        System.out.println();
        System.out.println("Directorul dupa aliniere: ");
        dir.print();

        System.out.println();
        TotalMemory status = new TotalMemory();
        dir.accept(status);
        status.printStatistics();
    }
}


/*Directorul Prime contine: 
Prime
Second
Textul: Ana are mere
Textul: Maria are mere
Textul: Georgeta are mere
video
muzica

Directorul dupa aliniere:
Prime
Second
___Ana are mere
___Maria are mere___
Georgeta are mere___
video
muzica

Director Statistics:
*** Spatiu txt: 15 Kb
*** Spatiu svg: 45 Kb
*** Spatiu mp3: 3 Mb*/