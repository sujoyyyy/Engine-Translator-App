package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int color;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        this.color=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView engineTranslation = (TextView) listItemView.findViewById(R.id.engine_view);
        engineTranslation.setText(currentWord.getEngineTranslation());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.english_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_photo);
        if(currentWord.hasImage()){
        iconView.setImageResource(currentWord.getImageResourceID());}
        else iconView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int mcolor = ContextCompat.getColor(getContext(),color);
        textContainer.setBackgroundColor(mcolor);

        return listItemView;
    }
}
