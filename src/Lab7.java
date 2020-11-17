public class Lab7 {

    public static void main(String[] args)  {
        Command cmd1 = new OpenCommand();
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        DocumentManager.getBook().print();
    }
}
