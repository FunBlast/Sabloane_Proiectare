package ro.uvt.models;

public interface Element
{
    void print();
    void accept(Visitor visitor);
}
