package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBookActivity extends AppCompatActivity {

    private RecyclerView bookRecyclerView;
    private BookRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_book);

        adapter=new BookRecyclerViewAdapter(this);
        bookRecyclerView=findViewById(R.id.bookRecyclerView);

        bookRecyclerView.setAdapter(adapter);
        bookRecyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(1,"1Q8","Haruki",1350,"https://www.google.com/search?q=1q84&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiI7PaXi-7uAhVygUsFHW-MBScQ_AUoAXoECBUQAw&biw=1600&bih=757#imgrc=76LjOzeOcKNKtM",
                "A work of maddening brilliance","Long Description"));
        adapter.setBooks(books);
    }
}