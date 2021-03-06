package ua.nure.st.kpp.example.demo.Observer;

import ua.nure.st.kpp.example.demo.Books.Book;

import java.util.ArrayList;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String eventType, ArrayList<Book> plant);
}
