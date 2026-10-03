//only keep main method
class BookApp {
    //introduce main method
    public static void main(String[] args) {
        //object
        //reference class | object name = new | constructor=> class name like method();
        Book b1 = new Book();
        b1.title ="Madol Doova";
        b1.author ="Martin Wickramasinghe";
        b1.pages = 200;

        b1.displayDetails();
    }
}    
