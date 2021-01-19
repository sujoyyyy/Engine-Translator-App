/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "dad", R.drawable.family_father,R.raw.dad));
        words.add(new Word("mother", "mommy", R.drawable.family_mother,R.raw.mommy));
        words.add(new Word("brother", "bhai", R.drawable.family_younger_brother,R.raw.bhai));
        words.add(new Word("sister", "sis", R.drawable.family_younger_sister,R.raw.sis));
        words.add(new Word("husband", "hubby", R.drawable.family_older_brother,R.raw.hubby));
        words.add(new Word("wife", "honey", R.drawable.family_older_sister,R.raw.honey));
        words.add(new Word("grandfather", "grandad", R.drawable.family_grandfather,R.raw.grandad));
        words.add(new Word("grandmother", "granny", R.drawable.family_grandmother,R.raw.granny));
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}
