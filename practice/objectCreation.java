//Object creation
class box{
    int height;
    int breadth;
    int length;
}
class Practice{
    public static void main(String[] args){ 
        box blackBox=new box();
        blackBox.height=12;
        blackBox.length=15;
        blackBox.breadth=10;
        System.out.println(blackBox.height);
        System.out.println(blackBox.breadth);
        System.out.println(blackBox.length);
    }
}

//Object Creation ex2
class user{
    String name;
    String email;
    String phno;
}
class book{
    String book_name;
    String author_name;
    int book_id;
}
class card{
    int card_id;
    int token_no;
    String renewal_date;
    String submission_date;
}
class rem_msg{
    String msg;
}
class Practice{
    public static void main(String[] args){
        user mem=new user();
        mem.name="Varsini";
        mem.email="varsinimarimuthu03@gmail.com";
        mem.phno="987654321";
        System.out.println("Name:" +mem.name);
        System.out.println("Email id:" +mem.email);
        System.out.println("Phone number:" +mem.phno);

        book Books=new book();
        Books.book_name="The power of subconcious mind";
        Books.author_name="John";
        Books.book_id=437;
        System.out.println("Book name:" +Books.book_name);
        System.out.println("Author name:" +Books.author_name);
        System.out.println("Book id:" +Books.book_id);

        card Cards=new card();
        Cards.card_id=77;
        Cards.token_no=89;
        Cards.renewal_date="jan 20, 2025";
        Cards.submission_date="feb 20,2025";
        System.out.println("Card_id:" +Cards.card_id);
        System.out.println("Token number:" +Cards.token_no);
        System.out.println("Book Renewal date:" +Cards.renewal_date);
        System.out.println("Book submission date:" +Cards.submission_date);

        rem_msg msgs=new rem_msg();
        msgs.msg="Reminder to return the book on or before 20th feb";
        System.out.println("Reminder:" +msgs.msg);
    }
}