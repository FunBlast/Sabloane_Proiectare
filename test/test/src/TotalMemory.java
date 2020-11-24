public class TotalMemory implements VisitorSpace{
    private int txtcounter = 0;
    private int svgcounter = 0;
    private int mp3counter = 0;

    public void visit(txtFile txt){
        this.txtcounter=txtcounter +5;
    }

    public void visit(svgFile svg) {
        this.svgcounter=svgcounter+45;
    }

    public void visit(mp3File mp3) {
        this.mp3counter=mp3counter+3;
    }

    public void visit(Director dir) {

    }
    public void printStatistics(){
        System.out.println("Director Statistics: ");
        System.out.println("*** Spatiu txt: " + txtcounter +" Kb");
        System.out.println("*** Spatiu svg: " + svgcounter +" Kb");
        System.out.println("*** Spatiu mp3: " + mp3counter +" Mb");
    }

}
