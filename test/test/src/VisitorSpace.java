public interface VisitorSpace {
    public abstract void visit(txtFile t);
    public abstract void visit(svgFile svg);
    public abstract void visit(mp3File mp3);
    public abstract void visit(Director dir);
}