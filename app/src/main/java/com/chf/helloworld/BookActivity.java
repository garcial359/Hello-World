package com.chf.helloworld;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BookActivity extends ListActivity {

    public static final String ADAPTER_AUTHORS = "authors";
    public static final String ADAPTER_TITLES = "titles";
    public static final String ADAPTER_COUNT = "adapterCount";
    public List<Book> books;
    public ArrayList<String> titles;
    public ArrayList<String> authors;
    public String author;
    public String title2;
    public int adapterCount;
    private BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);

        if (savedInstanceState != null) {
            authors = savedInstanceState.getStringArrayList(ADAPTER_AUTHORS);
            titles = savedInstanceState.getStringArrayList(ADAPTER_TITLES);
            adapterCount = savedInstanceState.getInt(ADAPTER_COUNT);
            books = new ArrayList<Book>();
            for (int i = 0; i < adapterCount; ++i) {
                author = authors.get(i);
                title2 = titles.get(i);
                books.add((new Book(title2, author)));
            }
            bookAdapter = new BookAdapter(this, R.layout.book_item, books);
        } else {
            books = BookStore.getBooks();
            bookAdapter = new BookAdapter(this, R.layout.book_item, books);
        }
        setListAdapter(bookAdapter);
        registerForContextMenu(getListView());
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        BookAdapter adapter = (BookAdapter) getListAdapter();
        adapterCount = adapter.getCount();
        List<String> authors = new ArrayList<String>();
        List<String> titles = new ArrayList<String>();
        for (int i = 0; i < adapterCount; ++i) {
            Book book = adapter.getItem(i);
            author = book.getAuthor();
            title2 = book.getTitle2();
            authors.add(author);
            titles.add(title2);
        }
        outState.putStringArrayList(ADAPTER_AUTHORS, (ArrayList<String>) authors);
        outState.putStringArrayList(ADAPTER_TITLES, (ArrayList<String>) titles);
        outState.putInt(ADAPTER_COUNT, adapterCount);
        super.onSaveInstanceState(outState);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int position = menuInfo.position;
        BookAdapter adapter = (BookAdapter) getListAdapter();
        Book book = adapter.getItem(position);
        switch (item.getItemId()) {
            case R.id.view:
                Toast.makeText(this, book.getTitle2() + " by " + book.getAuthor(), Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                books.remove(position);
                bookAdapter.notifyDataSetChanged();
                return true;
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == getListView()) {
            MenuInflater menuInflater = getMenuInflater();
            menu.setHeaderTitle(R.string.more);
            menuInflater.inflate(R.menu.books, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    static class Holder {
        public TextView title2;
        public TextView author;

        public Holder(TextView title2, TextView author) {
            this.author = author;
            this.title2 = title2;
        }
    }

    class BookAdapter extends ArrayAdapter<Book> {

        private LayoutInflater layoutInflater;

        public BookAdapter(Context context, int resource, List<Book> books) {
            super(context, resource, books);
            layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Holder holder = null;
            Book book = getItem(position);

            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.book_item, null);
                TextView author = (TextView) convertView.findViewById(R.id.author);
                TextView title2 = (TextView) convertView.findViewById(R.id.title2);

                holder = new Holder(title2, author);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }

            holder.title2.setText(book.getTitle2());
            holder.author.setText(book.getAuthor());


            return convertView;
        }
    }
}
